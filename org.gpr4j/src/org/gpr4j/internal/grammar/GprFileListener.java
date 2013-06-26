package org.gpr4j.internal.grammar;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.antlr.v4.runtime.tree.TerminalNode;
import org.gpr4j.internal.Loader;
import org.gpr4j.internal.grammar.GprParser.Case_itemContext;
import org.gpr4j.internal.grammar.GprParser.Path_nameContext;
import org.gpr4j.internal.grammar.GprParser.Simple_nameContext;
import org.gpr4j.internal.utilities.StringUtilities;

public class GprFileListener extends GprBaseListener {

	private Loader loader;

	public GprFileListener(Loader loader) {
		this.loader = loader;
	}

	@Override
	public void exitWith_clause(GprParser.With_clauseContext ctx) {
		for (Path_nameContext pathCtx : ctx.path_name()) {
			this.loader.addProject(pathCtx.result);
		}
	}

	@Override
	public void exitPath_name(GprParser.Path_nameContext ctx) {
		ctx.result = ctx.STRING_LITERAL().getText().replaceAll("\"", "");
	}

	@Override
	public void exitName(GprParser.NameContext ctx) {
		StringBuilder stringBuilder = new StringBuilder();

		for (Simple_nameContext simpleNameCtx : ctx.simple_name()) {
			stringBuilder.append(simpleNameCtx.getText());
			stringBuilder.append('.');
		}
		stringBuilder.deleteCharAt(stringBuilder.length() - 1);

		ctx.result = stringBuilder.toString();
	}
	
	@Override
	public void exitTyped_string_declaration(GprParser.Typed_string_declarationContext ctx) {
		HashSet<String> values = new HashSet<String>();
		
		for(TerminalNode value : ctx.STRING_LITERAL()) {
			values.add(StringUtilities.RemoveQuotes(value.getText()));
		}
		
		this.loader.addType(ctx.simple_name().getText(), values);
	}
	
	@Override
	public void enterCase_statement(GprParser.Case_statementContext ctx) {
		this.loader.beginCase(ctx.getToken(1, 1).getText());
	}
	
	@Override
	public	void exitCase_statement(GprParser.Case_statementContext ctx) {
		for(Case_itemContext caseItem : ctx.case_item()) {
			
			List<String> discreteChoices = new ArrayList<>();
			
			for(TerminalNode literal : caseItem.discrete_choice_list().STRING_LITERAL()) {
				discreteChoices.add(StringUtilities.RemoveQuotes(literal.getText()));
			}
			this.loader.setCaseDiscreteChoices(discreteChoices);
		}
		
		this.loader.endCase();
	}
	
//	@Override
//	public void exitPackage_spec(GprParser.Package_specContext ctx) {
//		this.loader.beginPackage(ctx.begin_pkg_name.getText());
//		
//		this.loader.endPackage();
//	}
//	
//	package_spec
//	  :
//	  PACKAGE begin_pkg_name = simple_name {gprLoader.beginPackage($begin_pkg_name.text);}
//	  IS 
//	  (simple_declarative_item)* 
//	  END end_package_name = simple_name SEMI_COLON {gprLoader.endPackage();}
//	  {$begin_pkg_name.text.equals($end_package_name.text)}?
	  ;
	
	
}
