package org.gpr4j.core.internal.test;

import static org.junit.Assert.assertEquals;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.antlr.runtime.RecognitionException;
import org.gpr4j.core.ExternalVariable;
import org.gpr4j.core.Factory;
import org.gpr4j.core.ILoader;
import org.junit.Test;

public class LoaderTest {

	private ILoader sut;
	private Path pathToProjectToLoad;

	private static final String SampleFolder = System.getProperty("user.dir")
			+ "/src/org/gpr4j/test/gpr/";

	private void createFixture(String gprProjectName) {
		sut = Factory.CreateLoader();
		pathToProjectToLoad = Paths.get(SampleFolder, gprProjectName);
	}

	private void exercize() {
		try {
			this.sut.load(this.pathToProjectToLoad);
		} catch (RecognitionException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testLoading() {
		this.createFixture("sample_project.gpr");

		this.exercize();

		checkNbOfLoadedProjects(2);

		checkAttribute("Exec_Dir", "new_exe");
		checkAttribute("Source_Dirs", new String[] { "src", "include" });
		checkAttribute("Switches(\"main.ada\")", new String[] { "-v", "-gnatv" });
		checkAttribute("Object_Dir", "new_exe");

		checkVariable("my_var", "My_Var");
		checkVariable("my_var2", "My_Var2");
		checkVariable("Name", "My_Var");
		checkVariable("Save_Name", "My_Var.saved");
		checkVariable("Empty_List", new String[] {});
		checkVariable("List_With_One_Element", new String[] { "-gnaty" });
		checkVariable("List_With_Two_Elements", new String[] { "-gnaty", "-gnatg" });
		checkVariable("Long_List", new String[] { "main.ada", "pack1_.ada", "pack1.ada",
				"pack2_.ada" });

		checkVariable("sample_project_included_exec_dir", "exe");
		checkVariable("sample_project_included_compiler_warnings", new String[] { "-gnatwua",
				"-gnaty", "-gnatQ" });
		checkVariable("sample_project_included_compiler_switches", new String[] { "-gnatwua",
				"-gnaty", "-gnatQ" });
	}

	@Test
	public void testDefaultAttribute() {
		this.createFixture("sample_project.gpr");

		this.exercize();

		this.checkAttribute("name", "sample_project");
		this.checkAttribute("project_dir", SampleFolder.substring(0, SampleFolder.length() - 1));

	}

	@Test
	public void testRenames() {
		this.createFixture("sample_project.gpr");

		this.exercize();

		this.checkAttribute("Builder'Switches (\"main.ada\")", new String[] { "-g" });
	}

	@Test
	public void testExtends() {
		this.createFixture("sample_project.gpr");

		this.exercize();

		this.checkAttribute("Ide'Ui", "Qt");
	}

	@Test
	public void testTypes() {
		this.createFixture("sample_project.gpr");

		this.exercize();

		this.checkType("mode_type", new String[] { "debug", "release" });		
	}
	
	@Test
	public void testExternalVarialbe() {
		this.createFixture("sample_project.gpr");

		this.exercize();

		this.checkVariable("mode", "debug");
		this.checkExternalVariable("mode", "debug", new String[] { "debug", "release" });
		this.checkExternalVariable("inc_mode", "first", new String[] { "first", "second" });
			
		this.sut.setExternalVariable ("mode", "release");
		this.sut.setExternalVariable("inc_mode", "second");
		this.exercize();
		this.checkVariable("mode", "release");
		this.checkVariable("mode_included", "second");

	}

	private void checkNbOfLoadedProjects(int expectedNumberOfLoadedProject) {
		assertEquals("Number of loaded projects", expectedNumberOfLoadedProject, sut
				.getLoadedProjects().size());
	}

	private void checkVariable(String variableName, String expectedValue) {
		assertEquals("Variable value " + variableName, expectedValue, sut.getLoadedProjects()
				.get(0).getVariable(variableName).getAsString());
	}

	private void checkVariable(String variableName, String[] expectedValues) {
		List<String> computed = sut.getLoadedProjects().get(0).getVariable(variableName)
				.getAsStringList();
		assertEquals("Variable size " + variableName, expectedValues.length, computed.size());
		for (int i = 0; i < expectedValues.length; i++) {
			assertEquals("Variable n?" + i, expectedValues[i], computed.get(i));
		}
	}

	private void checkAttribute(String attributeName, String expectedValue) {
		assertEquals("Attribute value", expectedValue,
				sut.getLoadedProjects().get(0).getAttribute(attributeName).getAsString());
	}

	private void checkAttribute(String attributeName, String[] expectedValues) {
		List<String> computed = sut.getLoadedProjects().get(0).getAttribute(attributeName)
				.getAsStringList();
		assertEquals("Attribute size", expectedValues.length, computed.size());
		for (int i = 0; i < expectedValues.length; i++) {
			assertEquals("Attribute n?" + i, expectedValues[i], computed.get(i));
		}
	}

	private void checkType(String typeName, String[] expectedValues) {
		List<String> computed = sut.getLoadedProjects().get(0).getType(typeName).getAsStringList();
		for (int i = 0; i < expectedValues.length; i++) {
			assertEquals("Attribute n?" + i, expectedValues[i], computed.get(i));
		}
	}

	private void checkExternalVariable(String name, String defaultValue, String[] expectedValues) {

		ExternalVariable computed = null;

		for (ExternalVariable tmp : sut.getExternalVariables()) {
			if (tmp.getName().equals(name)) {
				computed = tmp;
				break;
			}
		}

		assertEquals("Variable name", name, computed.getName());
		assertEquals("Variable default value", defaultValue, computed.getDefaultValue());
		for (int i = 0; i < expectedValues.length; i++) {
			assertEquals("Attribute n?" + i, expectedValues[i], computed.getValues().get(i));
		}
	}
}
