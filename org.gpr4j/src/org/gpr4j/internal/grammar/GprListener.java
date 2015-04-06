package org.gpr4j.internal.grammar;

// Generated from D:\Users\RS\workspace_ada\gpr4j\org.gpr4j\src\org\gpr4j\internal\grammar\Gpr.g4 by ANTLR 4.1
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GprParser}.
 */
public interface GprListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GprParser#external_value}.
	 * @param ctx the parse tree
	 */
	void enterExternal_value(@NotNull GprParser.External_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link GprParser#external_value}.
	 * @param ctx the parse tree
	 */
	void exitExternal_value(@NotNull GprParser.External_valueContext ctx);

	/**
	 * Enter a parse tree produced by {@link GprParser#empty_declaration}.
	 * @param ctx the parse tree
	 */
	void enterEmpty_declaration(@NotNull GprParser.Empty_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GprParser#empty_declaration}.
	 * @param ctx the parse tree
	 */
	void exitEmpty_declaration(@NotNull GprParser.Empty_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link GprParser#simple_declarative_item}.
	 * @param ctx the parse tree
	 */
	void enterSimple_declarative_item(@NotNull GprParser.Simple_declarative_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link GprParser#simple_declarative_item}.
	 * @param ctx the parse tree
	 */
	void exitSimple_declarative_item(@NotNull GprParser.Simple_declarative_itemContext ctx);

	/**
	 * Enter a parse tree produced by {@link GprParser#project}.
	 * @param ctx the parse tree
	 */
	void enterProject(@NotNull GprParser.ProjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link GprParser#project}.
	 * @param ctx the parse tree
	 */
	void exitProject(@NotNull GprParser.ProjectContext ctx);

	/**
	 * Enter a parse tree produced by {@link GprParser#case_statement}.
	 * @param ctx the parse tree
	 */
	void enterCase_statement(@NotNull GprParser.Case_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GprParser#case_statement}.
	 * @param ctx the parse tree
	 */
	void exitCase_statement(@NotNull GprParser.Case_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link GprParser#package_spec}.
	 * @param ctx the parse tree
	 */
	void enterPackage_spec(@NotNull GprParser.Package_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link GprParser#package_spec}.
	 * @param ctx the parse tree
	 */
	void exitPackage_spec(@NotNull GprParser.Package_specContext ctx);

	/**
	 * Enter a parse tree produced by {@link GprParser#typed_variable_declaration}.
	 * @param ctx the parse tree
	 */
	void enterTyped_variable_declaration(@NotNull GprParser.Typed_variable_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GprParser#typed_variable_declaration}.
	 * @param ctx the parse tree
	 */
	void exitTyped_variable_declaration(@NotNull GprParser.Typed_variable_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link GprParser#package_declaration}.
	 * @param ctx the parse tree
	 */
	void enterPackage_declaration(@NotNull GprParser.Package_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GprParser#package_declaration}.
	 * @param ctx the parse tree
	 */
	void exitPackage_declaration(@NotNull GprParser.Package_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link GprParser#project_declaration}.
	 * @param ctx the parse tree
	 */
	void enterProject_declaration(@NotNull GprParser.Project_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GprParser#project_declaration}.
	 * @param ctx the parse tree
	 */
	void exitProject_declaration(@NotNull GprParser.Project_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link GprParser#simple_name}.
	 * @param ctx the parse tree
	 */
	void enterSimple_name(@NotNull GprParser.Simple_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GprParser#simple_name}.
	 * @param ctx the parse tree
	 */
	void exitSimple_name(@NotNull GprParser.Simple_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link GprParser#stringExpressionAttributeReference}.
	 * @param ctx the parse tree
	 */
	void enterStringExpressionAttributeReference(@NotNull GprParser.StringExpressionAttributeReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link GprParser#stringExpressionAttributeReference}.
	 * @param ctx the parse tree
	 */
	void exitStringExpressionAttributeReference(@NotNull GprParser.StringExpressionAttributeReferenceContext ctx);

	/**
	 * Enter a parse tree produced by {@link GprParser#attribute_designator}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_designator(@NotNull GprParser.Attribute_designatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GprParser#attribute_designator}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_designator(@NotNull GprParser.Attribute_designatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link GprParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(@NotNull GprParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link GprParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(@NotNull GprParser.TermContext ctx);

	/**
	 * Enter a parse tree produced by {@link GprParser#attribute_reference}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_reference(@NotNull GprParser.Attribute_referenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link GprParser#attribute_reference}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_reference(@NotNull GprParser.Attribute_referenceContext ctx);

	/**
	 * Enter a parse tree produced by {@link GprParser#package_renaming}.
	 * @param ctx the parse tree
	 */
	void enterPackage_renaming(@NotNull GprParser.Package_renamingContext ctx);
	/**
	 * Exit a parse tree produced by {@link GprParser#package_renaming}.
	 * @param ctx the parse tree
	 */
	void exitPackage_renaming(@NotNull GprParser.Package_renamingContext ctx);

	/**
	 * Enter a parse tree produced by {@link GprParser#path_name}.
	 * @param ctx the parse tree
	 */
	void enterPath_name(@NotNull GprParser.Path_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GprParser#path_name}.
	 * @param ctx the parse tree
	 */
	void exitPath_name(@NotNull GprParser.Path_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link GprParser#context_clause}.
	 * @param ctx the parse tree
	 */
	void enterContext_clause(@NotNull GprParser.Context_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link GprParser#context_clause}.
	 * @param ctx the parse tree
	 */
	void exitContext_clause(@NotNull GprParser.Context_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link GprParser#simple_project_declaration}.
	 * @param ctx the parse tree
	 */
	void enterSimple_project_declaration(@NotNull GprParser.Simple_project_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GprParser#simple_project_declaration}.
	 * @param ctx the parse tree
	 */
	void exitSimple_project_declaration(@NotNull GprParser.Simple_project_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link GprParser#with_clause}.
	 * @param ctx the parse tree
	 */
	void enterWith_clause(@NotNull GprParser.With_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link GprParser#with_clause}.
	 * @param ctx the parse tree
	 */
	void exitWith_clause(@NotNull GprParser.With_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link GprParser#discrete_choice_list}.
	 * @param ctx the parse tree
	 */
	void enterDiscrete_choice_list(@NotNull GprParser.Discrete_choice_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link GprParser#discrete_choice_list}.
	 * @param ctx the parse tree
	 */
	void exitDiscrete_choice_list(@NotNull GprParser.Discrete_choice_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link GprParser#attribute_declaration}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_declaration(@NotNull GprParser.Attribute_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GprParser#attribute_declaration}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_declaration(@NotNull GprParser.Attribute_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link GprParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void enterVariable_declaration(@NotNull GprParser.Variable_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GprParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void exitVariable_declaration(@NotNull GprParser.Variable_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link GprParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull GprParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GprParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull GprParser.ExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link GprParser#stringExpressionExternalValue}.
	 * @param ctx the parse tree
	 */
	void enterStringExpressionExternalValue(@NotNull GprParser.StringExpressionExternalValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link GprParser#stringExpressionExternalValue}.
	 * @param ctx the parse tree
	 */
	void exitStringExpressionExternalValue(@NotNull GprParser.StringExpressionExternalValueContext ctx);

	/**
	 * Enter a parse tree produced by {@link GprParser#typed_string_declaration}.
	 * @param ctx the parse tree
	 */
	void enterTyped_string_declaration(@NotNull GprParser.Typed_string_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GprParser#typed_string_declaration}.
	 * @param ctx the parse tree
	 */
	void exitTyped_string_declaration(@NotNull GprParser.Typed_string_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link GprParser#attribute_prefix}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_prefix(@NotNull GprParser.Attribute_prefixContext ctx);
	/**
	 * Exit a parse tree produced by {@link GprParser#attribute_prefix}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_prefix(@NotNull GprParser.Attribute_prefixContext ctx);

	/**
	 * Enter a parse tree produced by {@link GprParser#stringExpressionLiteral}.
	 * @param ctx the parse tree
	 */
	void enterStringExpressionLiteral(@NotNull GprParser.StringExpressionLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link GprParser#stringExpressionLiteral}.
	 * @param ctx the parse tree
	 */
	void exitStringExpressionLiteral(@NotNull GprParser.StringExpressionLiteralContext ctx);

	/**
	 * Enter a parse tree produced by {@link GprParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(@NotNull GprParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GprParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(@NotNull GprParser.NameContext ctx);

	/**
	 * Enter a parse tree produced by {@link GprParser#case_item}.
	 * @param ctx the parse tree
	 */
	void enterCase_item(@NotNull GprParser.Case_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link GprParser#case_item}.
	 * @param ctx the parse tree
	 */
	void exitCase_item(@NotNull GprParser.Case_itemContext ctx);

	/**
	 * Enter a parse tree produced by {@link GprParser#string_list}.
	 * @param ctx the parse tree
	 */
	void enterString_list(@NotNull GprParser.String_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link GprParser#string_list}.
	 * @param ctx the parse tree
	 */
	void exitString_list(@NotNull GprParser.String_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link GprParser#declarative_item}.
	 * @param ctx the parse tree
	 */
	void enterDeclarative_item(@NotNull GprParser.Declarative_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link GprParser#declarative_item}.
	 * @param ctx the parse tree
	 */
	void exitDeclarative_item(@NotNull GprParser.Declarative_itemContext ctx);

	/**
	 * Enter a parse tree produced by {@link GprParser#package_extension}.
	 * @param ctx the parse tree
	 */
	void enterPackage_extension(@NotNull GprParser.Package_extensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GprParser#package_extension}.
	 * @param ctx the parse tree
	 */
	void exitPackage_extension(@NotNull GprParser.Package_extensionContext ctx);

	/**
	 * Enter a parse tree produced by {@link GprParser#stringExpressionVariableName}.
	 * @param ctx the parse tree
	 */
	void enterStringExpressionVariableName(@NotNull GprParser.StringExpressionVariableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GprParser#stringExpressionVariableName}.
	 * @param ctx the parse tree
	 */
	void exitStringExpressionVariableName(@NotNull GprParser.StringExpressionVariableNameContext ctx);
}