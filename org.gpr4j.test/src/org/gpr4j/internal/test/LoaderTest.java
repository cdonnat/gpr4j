package org.gpr4j.internal.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Set;

import org.antlr.runtime.RecognitionException;
import org.gpr4j.api.ExternalVariable;
import org.gpr4j.api.Factory;
import org.gpr4j.api.ILoader;
import org.junit.Test;

public class LoaderTest {

	private ILoader sut;
	private Path pathToProjectToLoad;

	private static final String SAMPLE_FOLDER = System.getProperty("user.dir")
			+ "/src/org/gpr4j/test/gpr/";

	private void createFixture(String gprProjectName) {
		sut = Factory.CreateLoader();
		pathToProjectToLoad = Paths.get(SAMPLE_FOLDER, gprProjectName);
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

		checkVariable("my_var", "My_Var1");
		checkVariable("my_var2", "My_Var2");
		checkVariable("Name", "My_Var1");
		checkVariable("Save_Name", "My_Var1.saved");
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
		this.checkAttribute("project_dir", SAMPLE_FOLDER.substring(0, SAMPLE_FOLDER.length() - 1));

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
	public void testExternalVariable() {
		this.createFixture("sample_project.gpr");

		this.exercize();

		this.checkVariable("mode", "debug");
		this.checkExternalVariable("mode", "debug", true, new String[] { "debug", "release" });
		this.checkExternalVariable("inc_mode", "first", true, new String[] { "first", "second" });
		this.checkExternalVariable("var_ext", "1", false, null);

		this.sut.setExternalVariable("mode", "release");
		this.sut.setExternalVariable("inc_mode", "second");
		this.exercize();
		this.checkVariable("mode", "release");
		this.checkVariable("mode_included", "second");

	}

	@Test
	public void testCase() {
		this.createFixture("project_with_case.gpr");

		this.exercize();
		this.checkAttribute("exec_dir", "native_zfp_exe");
		this.checkAttribute("object_dir", "obj");
		this.checkAttribute("source_dirs", new String[] { "src", "include", "native" });

		this.sut.setExternalVariable("Platform", "native-full");
		this.exercize();
		this.checkAttribute("exec_dir", "native_full_exe");
		this.checkAttribute("object_dir", "obj_full");
		this.checkAttribute("source_dirs", new String[] { "src", "include", "native" });

		this.sut.setExternalVariable("Platform", "xcov-zfp");
		this.exercize();
		this.checkAttribute("exec_dir", "other_exe");
		this.checkAttribute("object_dir", "obj_others");
		this.checkAttribute("source_dirs", new String[] { "src", "include" });
	}

	private void checkNbOfLoadedProjects(int expectedNumberOfLoadedProject) {
		assertEquals("Number of loaded projects", expectedNumberOfLoadedProject, sut
				.getLoadedProjects().size());
	}

	private void checkVariable(String variableName, String expectedValue) {
		assertEquals("Variable value " + variableName, expectedValue, sut.getLoadedProjects()
				.get(0).getVariable(variableName).getValue().getAsString());
	}

	private void checkVariable(String variableName, String[] expectedValues) {
		List<String> computed = sut.getLoadedProjects().get(0).getVariable(variableName).getValue()
				.getAsStringList();
		assertEquals("Variable size " + variableName, expectedValues.length, computed.size());
		for (int i = 0; i < expectedValues.length; i++) {
			assertEquals("Variable n?" + i, expectedValues[i], computed.get(i));
		}
	}

	private void checkAttribute(String attributeName, String expectedValue) {
		assertEquals("Attribute value", Paths.get(expectedValue).toString(), sut
				.getLoadedProjects().get(0).getAttribute(attributeName).getValue().getAsString());
	}

	private void checkAttribute(String attributeName, String[] expectedValues) {
		List<String> computed = sut.getLoadedProjects().get(0).getAttribute(attributeName)
				.getValue().getAsStringList();
		assertEquals("Attribute size", expectedValues.length, computed.size());
		for (int i = 0; i < expectedValues.length; i++) {
			assertEquals("Attribute n?" + i, expectedValues[i], computed.get(i));
		}
	}

	private void checkType(String typeName, String[] expectedValues) {
		Set<String> computed = sut.getLoadedProjects().get(0).getType(typeName).getValues();
		assertEquals("Type possible values", expectedValues.length, computed.size());
		for (int i = 0; i < expectedValues.length; i++) {
			assertTrue("Attribute n?" + i, computed.contains(expectedValues[i]));
		}
	}

	private void checkExternalVariable(String name, String defaultValue, boolean isTyped,
			String[] expectedValues) {

		ExternalVariable computed = null;

		for (ExternalVariable tmp : sut.getLoadedProjects().get(0).getExternalVariables()) {
			if (tmp.getName().equals(name)) {
				computed = tmp;
				break;
			}
		}

		assertEquals("Variable is typed", isTyped, computed.isTyped());
		assertEquals("Variable name", name, computed.getName());
		assertEquals("Variable default value", defaultValue, computed.getDefaultValue());
		if (isTyped) {
			assertEquals("Variable possible values", expectedValues.length, computed.getType()
					.getValues().size());
			for (int i = 0; i < expectedValues.length; i++) {
				assertTrue("Attribute n?" + i,
						computed.getType().getValues().contains(expectedValues[i]));
			}
		}
	}
}
