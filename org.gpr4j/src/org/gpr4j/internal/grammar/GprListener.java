// Generated from org.gpr4j\src\org\gpr4j\internal\grammar\Gpr.g4 by ANTLR 4.5
package org.gpr4j.internal.grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GprParser}.
 */
public interface GprListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GprParser#project}.
	 * @param ctx the parse tree
	 */
	void enterProject(GprParser.ProjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link GprParser#project}.
	 * @param ctx the parse tree
	 */
	void exitProject(GprParser.ProjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link GprParser#context_clause}.
	 * @param ctx the parse tree
	 */
	void enterContext_clause(GprParser.Context_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link GprParser#context_clause}.
	 * @param ctx the parse tree
	 */
	void exitContext_clause(GprParser.Context_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link GprParser#with_clause}.
	 * @param ctx the parse tree
	 */
	void enterWith_clause(GprParser.With_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link GprParser#with_clause}.
	 * @param ctx the parse tree
	 */
	void exitWith_clause(GprParser.With_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link GprParser#path_name}.
	 * @param ctx the parse tree
	 */
	void enterPath_name(GprParser.Path_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GprParser#path_name}.
	 * @param ctx the parse tree
	 */
	void exitPath_name(GprParser.Path_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link GprParser#project_declaration}.
	 * @param ctx the parse tree
	 */
	void enterProject_declaration(GprParser.Project_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GprParser#project_declaration}.
	 * @param ctx the parse tree
	 */
	void exitProject_declaration(GprParser.Project_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GprParser#simple_project_declaration}.
	 * @param ctx the parse tree
	 */
	void enterSimple_project_declaration(GprParser.Simple_project_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GprParser#simple_project_declaration}.
	 * @param ctx the parse tree
	 */
	void exitSimple_project_declaration(GprParser.Simple_project_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GprParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(GprParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GprParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(GprParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link GprParser#simple_name}.
	 * @param ctx the parse tree
	 */
	void enterSimple_name(GprParser.Simple_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GprParser#simple_name}.
	 * @param ctx the parse tree
	 */
	void exitSimple_name(GprParser.Simple_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link GprParser#declarative_item}.
	 * @param ctx the parse tree
	 */
	void enterDeclarative_item(GprParser.Declarative_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link GprParser#declarative_item}.
	 * @param ctx the parse tree
	 */
	void exitDeclarative_item(GprParser.Declarative_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link GprParser#simple_declarative_item}.
	 * @param ctx the parse tree
	 */
	void enterSimple_declarative_item(GprParser.Simple_declarative_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link GprParser#simple_declarative_item}.
	 * @param ctx the parse tree
	 */
	void exitSimple_declarative_item(GprParser.Simple_declarative_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link GprParser#typed_string_declaration}.
	 * @param ctx the parse tree
	 */
	void enterTyped_string_declaration(GprParser.Typed_string_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GprParser#typed_string_declaration}.
	 * @param ctx the parse tree
	 */
	void exitTyped_string_declaration(GprParser.Typed_string_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GprParser#case_statement}.
	 * @param ctx the parse tree
	 */
	void enterCase_statement(GprParser.Case_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GprParser#case_statement}.
	 * @param ctx the parse tree
	 */
	void exitCase_statement(GprParser.Case_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GprParser#case_item}.
	 * @param ctx the parse tree
	 */
	void enterCase_item(GprParser.Case_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link GprParser#case_item}.
	 * @param ctx the parse tree
	 */
	void exitCase_item(GprParser.Case_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link GprParser#discrete_choice_list}.
	 * @param ctx the parse tree
	 */
	void enterDiscrete_choice_list(GprParser.Discrete_choice_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link GprParser#discrete_choice_list}.
	 * @param ctx the parse tree
	 */
	void exitDiscrete_choice_list(GprParser.Discrete_choice_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link GprParser#package_declaration}.
	 * @param ctx the parse tree
	 */
	void enterPackage_declaration(GprParser.Package_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GprParser#package_declaration}.
	 * @param ctx the parse tree
	 */
	void exitPackage_declaration(GprParser.Package_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GprParser#package_spec}.
	 * @param ctx the parse tree
	 */
	void enterPackage_spec(GprParser.Package_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link GprParser#package_spec}.
	 * @param ctx the parse tree
	 */
	void exitPackage_spec(GprParser.Package_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link GprParser#package_renaming}.
	 * @param ctx the parse tree
	 */
	void enterPackage_renaming(GprParser.Package_renamingContext ctx);
	/**
	 * Exit a parse tree produced by {@link GprParser#package_renaming}.
	 * @param ctx the parse tree
	 */
	void exitPackage_renaming(GprParser.Package_renamingContext ctx);
	/**
	 * Enter a parse tree produced by {@link GprParser#package_extension}.
	 * @param ctx the parse tree
	 */
	void enterPackage_extension(GprParser.Package_extensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GprParser#package_extension}.
	 * @param ctx the parse tree
	 */
	void exitPackage_extension(GprParser.Package_extensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GprParser#typed_variable_declaration}.
	 * @param ctx the parse tree
	 */
	void enterTyped_variable_declaration(GprParser.Typed_variable_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GprParser#typed_variable_declaration}.
	 * @param ctx the parse tree
	 */
	void exitTyped_variable_declaration(GprParser.Typed_variable_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GprParser#attribute_declaration}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_declaration(GprParser.Attribute_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GprParser#attribute_declaration}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_declaration(GprParser.Attribute_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GprParser#attribute_designator}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_designator(GprParser.Attribute_designatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GprParser#attribute_designator}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_designator(GprParser.Attribute_designatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GprParser#attribute_reference}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_reference(GprParser.Attribute_referenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link GprParser#attribute_reference}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_reference(GprParser.Attribute_referenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link GprParser#attribute_prefix}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_prefix(GprParser.Attribute_prefixContext ctx);
	/**
	 * Exit a parse tree produced by {@link GprParser#attribute_prefix}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_prefix(GprParser.Attribute_prefixContext ctx);
	/**
	 * Enter a parse tree produced by {@link GprParser#external_value}.
	 * @param ctx the parse tree
	 */
	void enterExternal_value(GprParser.External_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link GprParser#external_value}.
	 * @param ctx the parse tree
	 */
	void exitExternal_value(GprParser.External_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link GprParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void enterVariable_declaration(GprParser.Variable_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GprParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void exitVariable_declaration(GprParser.Variable_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GprParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(GprParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GprParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(GprParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GprParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(GprParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link GprParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(GprParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringExpressionLiteral}
	 * labeled alternative in {@link GprParser#string_expression}.
	 * @param ctx the parse tree
	 */
	void enterStringExpressionLiteral(GprParser.StringExpressionLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringExpressionLiteral}
	 * labeled alternative in {@link GprParser#string_expression}.
	 * @param ctx the parse tree
	 */
	void exitStringExpressionLiteral(GprParser.StringExpressionLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringExpressionVariableName}
	 * labeled alternative in {@link GprParser#string_expression}.
	 * @param ctx the parse tree
	 */
	void enterStringExpressionVariableName(GprParser.StringExpressionVariableNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringExpressionVariableName}
	 * labeled alternative in {@link GprParser#string_expression}.
	 * @param ctx the parse tree
	 */
	void exitStringExpressionVariableName(GprParser.StringExpressionVariableNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringExpressionExternalValue}
	 * labeled alternative in {@link GprParser#string_expression}.
	 * @param ctx the parse tree
	 */
	void enterStringExpressionExternalValue(GprParser.StringExpressionExternalValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringExpressionExternalValue}
	 * labeled alternative in {@link GprParser#string_expression}.
	 * @param ctx the parse tree
	 */
	void exitStringExpressionExternalValue(GprParser.StringExpressionExternalValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringExpressionAttributeReference}
	 * labeled alternative in {@link GprParser#string_expression}.
	 * @param ctx the parse tree
	 */
	void enterStringExpressionAttributeReference(GprParser.StringExpressionAttributeReferenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringExpressionAttributeReference}
	 * labeled alternative in {@link GprParser#string_expression}.
	 * @param ctx the parse tree
	 */
	void exitStringExpressionAttributeReference(GprParser.StringExpressionAttributeReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link GprParser#string_list}.
	 * @param ctx the parse tree
	 */
	void enterString_list(GprParser.String_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link GprParser#string_list}.
	 * @param ctx the parse tree
	 */
	void exitString_list(GprParser.String_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link GprParser#empty_declaration}.
	 * @param ctx the parse tree
	 */
	void enterEmpty_declaration(GprParser.Empty_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GprParser#empty_declaration}.
	 * @param ctx the parse tree
	 */
	void exitEmpty_declaration(GprParser.Empty_declarationContext ctx);
}