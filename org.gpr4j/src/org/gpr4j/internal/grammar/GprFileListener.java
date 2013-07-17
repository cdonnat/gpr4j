package org.gpr4j.internal.grammar;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.gpr4j.api.ParsingFailedException;
import org.gpr4j.internal.Loader;
import org.gpr4j.internal.grammar.GprParser.Discrete_choice_listContext;
import org.gpr4j.internal.grammar.GprParser.ExpressionContext;
import org.gpr4j.internal.grammar.GprParser.Path_nameContext;
import org.gpr4j.internal.grammar.GprParser.Simple_nameContext;
import org.gpr4j.internal.grammar.GprParser.TermContext;
import org.gpr4j.internal.model.Term;
import org.gpr4j.internal.utilities.StringUtilities;

import com.google.common.base.Preconditions;

public class GprFileListener extends GprBaseListener {

	private Loader loader;
	protected ParseTreeProperty<Term> termNodes;
	protected ParseTreeProperty<String> stringNodes;

	public GprFileListener(Loader loader) {
		this.loader = loader;
		this.termNodes = new ParseTreeProperty<Term>();
		this.stringNodes = new ParseTreeProperty<String>();
	}

	/**
	 * Provides the Term associated to given node.
	 * 
	 * @param node
	 *            the node for which to retrieve associated Term
	 * @return the Term associated to given node.
	 */
	private Term getTermFor(ParseTree node) {
		return this.termNodes.get(node);
	}

	/**
	 * Associates given Term to given node.
	 * 
	 * @param node
	 *            the node to which associated the given Term.
	 * @param term
	 *            the Term to associate to given node.
	 */
	private void associateTermTo(ParseTree node, Term term) {
		this.termNodes.put(node, term);
	}

	/**
	 * Provides the String associated to given node.
	 * 
	 * @param node
	 *            the node for which to retrieve associated String
	 * @return the String associated to given node.
	 */
	private String getStringFor(ParseTree node) {
		return this.stringNodes.get(node);
	}

	/**
	 * Associates given String to given node.
	 * 
	 * @param node
	 *            the node to which associated the given String.
	 * @param term
	 *            the String to associate to given node.
	 */
	private void associateStringTo(ParseTree node, String string) {
		this.stringNodes.put(node, string);
	}

	@Override
	public void exitWith_clause(GprParser.With_clauseContext ctx) {
		for (Path_nameContext pathCtx : ctx.path_name()) {
			this.loader.addProject(this.getStringFor(pathCtx));
		}
	}

	@Override
	public void exitPath_name(GprParser.Path_nameContext ctx) {
		this.associateStringTo(ctx,
				ctx.STRING_LITERAL().getText().replaceAll("\"", ""));
	}

	@Override
	public void exitName(GprParser.NameContext ctx) {
		StringBuilder stringBuilder = new StringBuilder();

		for (Simple_nameContext simpleNameCtx : ctx.simple_name()) {
			stringBuilder.append(simpleNameCtx.getText());
			stringBuilder.append('.');
		}
		stringBuilder.deleteCharAt(stringBuilder.length() - 1);

		this.associateStringTo(ctx, stringBuilder.toString());
	}

	@Override
	public void exitTyped_string_declaration(
			GprParser.Typed_string_declarationContext ctx) {
		HashSet<String> values = new HashSet<String>();

		for (TerminalNode value : ctx.STRING_LITERAL()) {
			values.add(StringUtilities.RemoveQuotes(value.getText()));
		}

		this.loader.addType(ctx.simple_name().getText(), values);
	}

	@Override
	public void enterCase_statement(GprParser.Case_statementContext ctx) {
		this.loader.beginCase(ctx.name().getText());
	}

	/**
	 * Checks if the discrete choice list corresponds to "when others".
	 * 
	 * @param discreteChoiceCtx
	 *            context of discrete choice list rule
	 * @return True if the discrete choice list corresponds to "when others",
	 *         False otherwise.
	 */
	private boolean isWhenOthers(Discrete_choice_listContext discreteChoiceCtx) {
		return discreteChoiceCtx.OTHERS() != null;
	}

	@Override
	public void enterDiscrete_choice_list(
			GprParser.Discrete_choice_listContext ctx) {
		List<String> discreteChoices = new ArrayList<>();

		if (isWhenOthers(ctx)) {
			discreteChoices.add(StringUtilities.RemoveQuotes(ctx.OTHERS()
					.getText()));
		} else {
			for (TerminalNode literal : ctx.STRING_LITERAL()) {
				discreteChoices.add(StringUtilities.RemoveQuotes(literal
						.getText()));
			}
		}

		this.loader.setCaseDiscreteChoices(discreteChoices);
	}

	/**
	 * Throws a ParsingFailedException if begin and end names do not match.
	 * 
	 * @param beginName
	 *            begin name of scope
	 * @param endName
	 *            end name of scope
	 * @param scopeType
	 *            the type of scope (i.e. package, project...)
	 */
	private void throwExceptionIfNamesDontMatch(String beginName,
			String endName, String scopeType) {
		if (!beginName.equals(endName)) {

			StringBuilder errorMsgBuilder = new StringBuilder(scopeType);
			errorMsgBuilder.append(" name is ambiguous: ");
			errorMsgBuilder.append(beginName);
			errorMsgBuilder.append('/');
			errorMsgBuilder.append(endName);

			throw new ParsingFailedException(errorMsgBuilder.toString());
		}
	}

	@Override
	public void exitCase_statement(GprParser.Case_statementContext ctx) {
		this.loader.endCase();
	}

	@Override
	public void enterPackage_spec(GprParser.Package_specContext ctx) {
		this.throwExceptionIfNamesDontMatch(ctx.begin_package_name.getText(),
				ctx.end_package_name.getText(), "package");

		this.loader.beginPackage(ctx.begin_package_name.IDENTIFIER().getText());
	}

	@Override
	public void exitPackage_spec(GprParser.Package_specContext ctx) {
		this.loader.endPackage();
	}

	@Override
	public void exitPackage_renaming(GprParser.Package_renamingContext ctx) {
		this.loader.addPackageFrom(ctx.newPackageName.IDENTIFIER().getText(),
				ctx.projectName.IDENTIFIER().getText(), ctx.renamedPackage
						.IDENTIFIER().getText());
	}

	@Override
	public void exitPackage_extension(GprParser.Package_extensionContext ctx) {
		this.throwExceptionIfNamesDontMatch(ctx.begin_package_name.getText(),
				ctx.end_package_name.getText(), "package");

		this.loader.addPackageFrom(ctx.begin_package_name.IDENTIFIER()
				.getText(), ctx.projectName.IDENTIFIER().getText(),
				ctx.extendedPackage.IDENTIFIER().getText());
	}

	@Override
	public void enterTyped_variable_declaration(
			GprParser.Typed_variable_declarationContext ctx) {
		this.loader.setCurrentType(ctx.name().getText());
	}

	@Override
	public void exitTyped_variable_declaration(
			GprParser.Typed_variable_declarationContext ctx) {
		if (this.loader.variableIsDefined(ctx.simple_name().getText())) {
			throw new ParsingFailedException(
					"Typed variable cannot be declared several times");
		}

		this.loader.addVariable(ctx.simple_name().getText(),
				this.getTermFor(ctx.string_expression()));
		this.loader.setCurrentType(null);
	}

	@Override
	public void exitAttribute_declaration(
			GprParser.Attribute_declarationContext ctx) {
		this.loader.addAttribute(this.getStringFor(ctx.attribute_designator()),
				this.getTermFor(ctx.expression()));
	}

	@Override
	public void exitAttribute_designator(
			GprParser.Attribute_designatorContext ctx) {
		StringBuilder attNameBuilder = new StringBuilder(ctx.att.getText());

		if (ctx.STRING_LITERAL() != null) {
			attNameBuilder.append('(');
			attNameBuilder.append(ctx.STRING_LITERAL().getText());
			attNameBuilder.append(')');
		}

		this.associateStringTo(ctx, attNameBuilder.toString());
	}

	@Override
	public void exitAttribute_reference(GprParser.Attribute_referenceContext ctx) {
		StringBuilder attNameBuilder = new StringBuilder();

		if (this.getStringFor(ctx.attribute_prefix()).isEmpty()) {
			attNameBuilder.append(ctx.simple_name().getText());
		} else {
			attNameBuilder.append(this.getStringFor(ctx.attribute_prefix()));
			attNameBuilder.append("\'");
			attNameBuilder.append(ctx.simple_name().getText());
		}

		if (ctx.STRING_LITERAL() != null) {
			attNameBuilder.append('(');
			attNameBuilder.append(ctx.STRING_LITERAL().getText());
			attNameBuilder.append(')');
		}

		this.associateTermTo(ctx,
				this.loader.getAttribute(attNameBuilder.toString()).getValue());

	}

	@Override
	public void exitAttribute_prefix(GprParser.Attribute_prefixContext ctx) {
		StringBuilder prefixBuilder = new StringBuilder("");

		if (ctx.PROJECT() == null) {
			prefixBuilder.append(ctx.project_name.getText());

			if (ctx.package_name != null) {
				prefixBuilder.append('.');
				prefixBuilder.append(ctx.package_name.getText());
			}
		}

		this.associateStringTo(ctx, prefixBuilder.toString());
	}

	@Override
	public void exitExternal_value(GprParser.External_valueContext ctx) {
		String defaultValue = null;

		if (ctx.defaultValue != null) {
			defaultValue = ctx.defaultValue.getText();
		}

		this.loader.addExternalVariable(
				StringUtilities.RemoveQuotes(ctx.external_name.getText()),
				StringUtilities.RemoveQuotes(defaultValue));

		this.associateTermTo(
				ctx,
				this.loader.getExternalVariable(
						StringUtilities.RemoveQuotes(ctx.external_name
								.getText())).getValue());
	}

	@Override
	public void exitVariable_declaration(
			GprParser.Variable_declarationContext ctx) {
		this.loader.addVariable(ctx.simple_name().getText(),
				this.getTermFor(ctx.expression()));
	}

	@Override
	public void exitExpression(GprParser.ExpressionContext ctx) {

		Term expression = this.getTermFor(ctx.first);

		for (TermContext termContext : ctx.term().subList(1, ctx.term().size())) {

			expression = Term.Concat(expression, this.getTermFor(termContext));
		}

		this.associateTermTo(ctx, expression);
	}

	@Override
	public void exitTerm(GprParser.TermContext ctx) {
		if (ctx.string_expression() != null) {
			this.associateTermTo(ctx, this.getTermFor(ctx.string_expression()));
		} else {
			Preconditions.checkNotNull(ctx.string_list());
			this.associateTermTo(ctx, this.getTermFor(ctx.string_list()));
		}
	}

	@Override
	public void exitStringExpressionAttributeReference(
			GprParser.StringExpressionAttributeReferenceContext ctx) {
		this.associateTermTo(ctx, this.getTermFor(ctx.attribute_reference()));
	}

	@Override
	public void exitStringExpressionVariableName(
			GprParser.StringExpressionVariableNameContext ctx) {
		this.associateTermTo(ctx,
				this.loader.getVariable(this.getStringFor(ctx.name()))
						.getValue());
	}

	@Override
	public void exitStringExpressionExternalValue(
			GprParser.StringExpressionExternalValueContext ctx) {
		this.associateTermTo(ctx, this.getTermFor(ctx.external_value()));
	}

	@Override
	public void exitStringExpressionLiteral(
			GprParser.StringExpressionLiteralContext ctx) {
		this.associateTermTo(ctx,
				Term.CreateString(ctx.STRING_LITERAL().getText()));
	}

	@Override
	public void exitString_list(GprParser.String_listContext ctx) {
		Term stringList = Term.CreateStringList(new ArrayList<String>(ctx
				.expression().size()));

		for (ExpressionContext expContext : ctx.expression()) {
			stringList = Term.Concat(stringList, this.getTermFor(expContext));
		}

		this.associateTermTo(ctx, stringList);

	}

	@Override
	public void enterSimple_project_declaration(
			GprParser.Simple_project_declarationContext ctx) {
		this.throwExceptionIfNamesDontMatch(ctx.begin_project_name.getText(),
				ctx.end_project_name.getText(), "project");
	}
}
