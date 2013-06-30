// Generated from D:\Users\RS\workspace_ada\gpr4j\org.gpr4j\src\org\gpr4j\internal\grammar\Gpr.g4 by ANTLR 4.0
package org.gpr4j.internal.grammar;

import org.gpr4j.internal.model.Term;

import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface GprListener extends ParseTreeListener {
	void enterExpression(GprParser.ExpressionContext ctx);
	void exitExpression(GprParser.ExpressionContext ctx);

	void enterStringExpressionAttributeReference(GprParser.StringExpressionAttributeReferenceContext ctx);
	void exitStringExpressionAttributeReference(GprParser.StringExpressionAttributeReferenceContext ctx);

	void enterStringExpressionVariableName(GprParser.StringExpressionVariableNameContext ctx);
	void exitStringExpressionVariableName(GprParser.StringExpressionVariableNameContext ctx);

	void enterPackage_extension(GprParser.Package_extensionContext ctx);
	void exitPackage_extension(GprParser.Package_extensionContext ctx);

	void enterSimple_project_declaration(GprParser.Simple_project_declarationContext ctx);
	void exitSimple_project_declaration(GprParser.Simple_project_declarationContext ctx);

	void enterPackage_spec(GprParser.Package_specContext ctx);
	void exitPackage_spec(GprParser.Package_specContext ctx);

	void enterSimple_declarative_item(GprParser.Simple_declarative_itemContext ctx);
	void exitSimple_declarative_item(GprParser.Simple_declarative_itemContext ctx);

	void enterSimple_name(GprParser.Simple_nameContext ctx);
	void exitSimple_name(GprParser.Simple_nameContext ctx);

	void enterEmpty_declaration(GprParser.Empty_declarationContext ctx);
	void exitEmpty_declaration(GprParser.Empty_declarationContext ctx);

	void enterVariable_declaration(GprParser.Variable_declarationContext ctx);
	void exitVariable_declaration(GprParser.Variable_declarationContext ctx);

	void enterTyped_variable_declaration(GprParser.Typed_variable_declarationContext ctx);
	void exitTyped_variable_declaration(GprParser.Typed_variable_declarationContext ctx);

	void enterString_list(GprParser.String_listContext ctx);
	void exitString_list(GprParser.String_listContext ctx);

	void enterName(GprParser.NameContext ctx);
	void exitName(GprParser.NameContext ctx);

	void enterAttribute_designator(GprParser.Attribute_designatorContext ctx);
	void exitAttribute_designator(GprParser.Attribute_designatorContext ctx);

	void enterPackage_declaration(GprParser.Package_declarationContext ctx);
	void exitPackage_declaration(GprParser.Package_declarationContext ctx);

	void enterTyped_string_declaration(GprParser.Typed_string_declarationContext ctx);
	void exitTyped_string_declaration(GprParser.Typed_string_declarationContext ctx);

	void enterAttribute_prefix(GprParser.Attribute_prefixContext ctx);
	void exitAttribute_prefix(GprParser.Attribute_prefixContext ctx);

	void enterCase_statement(GprParser.Case_statementContext ctx);
	void exitCase_statement(GprParser.Case_statementContext ctx);

	void enterWith_clause(GprParser.With_clauseContext ctx);
	void exitWith_clause(GprParser.With_clauseContext ctx);

	void enterContext_clause(GprParser.Context_clauseContext ctx);
	void exitContext_clause(GprParser.Context_clauseContext ctx);

	void enterCase_item(GprParser.Case_itemContext ctx);
	void exitCase_item(GprParser.Case_itemContext ctx);

	void enterAttribute_reference(GprParser.Attribute_referenceContext ctx);
	void exitAttribute_reference(GprParser.Attribute_referenceContext ctx);

	void enterProject_declaration(GprParser.Project_declarationContext ctx);
	void exitProject_declaration(GprParser.Project_declarationContext ctx);

	void enterPath_name(GprParser.Path_nameContext ctx);
	void exitPath_name(GprParser.Path_nameContext ctx);

	void enterProject(GprParser.ProjectContext ctx);
	void exitProject(GprParser.ProjectContext ctx);

	void enterStringExpressionExternalValue(GprParser.StringExpressionExternalValueContext ctx);
	void exitStringExpressionExternalValue(GprParser.StringExpressionExternalValueContext ctx);

	void enterDiscrete_choice_list(GprParser.Discrete_choice_listContext ctx);
	void exitDiscrete_choice_list(GprParser.Discrete_choice_listContext ctx);

	void enterPackage_renaming(GprParser.Package_renamingContext ctx);
	void exitPackage_renaming(GprParser.Package_renamingContext ctx);

	void enterAttribute_declaration(GprParser.Attribute_declarationContext ctx);
	void exitAttribute_declaration(GprParser.Attribute_declarationContext ctx);

	void enterTerm(GprParser.TermContext ctx);
	void exitTerm(GprParser.TermContext ctx);

	void enterDeclarative_item(GprParser.Declarative_itemContext ctx);
	void exitDeclarative_item(GprParser.Declarative_itemContext ctx);

	void enterStringExpressionLiteral(GprParser.StringExpressionLiteralContext ctx);
	void exitStringExpressionLiteral(GprParser.StringExpressionLiteralContext ctx);

	void enterExternal_value(GprParser.External_valueContext ctx);
	void exitExternal_value(GprParser.External_valueContext ctx);
}