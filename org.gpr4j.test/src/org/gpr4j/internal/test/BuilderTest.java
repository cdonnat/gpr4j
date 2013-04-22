package org.gpr4j.internal.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.gpr4j.api.ExternalVariable;
import org.gpr4j.api.Factory;
import org.gpr4j.api.IGpr;
import org.gpr4j.api.Symbol;
import org.gpr4j.internal.model.ProjectUnit;
import org.gpr4j.internal.model.Term;
import org.junit.Test;

public class BuilderTest {

	private ProjectUnit project;

	private final String projectPath = System.getProperty("user.dir") + "/src/org/gpr4j/test/gpr";

	private void createFixture() {
		this.project = new ProjectUnit(Paths.get(projectPath, "/sample_project.gpr"));
	}

	@Test
	public void test() {
		this.createFixture();

		this.project.addAttribute(new Symbol("exec_dir", Term.CreateString("new_exe")));
		this.project.addAttribute(new Symbol("object_dir", Term.CreateString("obj")));

		List<String> sourcesDir = new ArrayList<String>();
		sourcesDir.add("src");
		sourcesDir.add("include");
		this.project.addAttribute(new Symbol("source_dirs", Term.CreateStringList(sourcesDir)));

		List<String> main = new ArrayList<String>();
		main.add("main.adb");
		this.project.addAttribute(new Symbol("Main", Term.CreateStringList(main)));
		this.project.addExternalVariable(new ExternalVariable("ExtVar", "Default", null));

		IGpr gpr = Factory.CreateGpr(this.project);

		assertEquals("sample_project", gpr.getName());
		assertEquals(Paths.get(projectPath).toString(), gpr.getRootDirPath().toString());
		assertEquals("new_exe", gpr.getExecutableDir());
		assertEquals("obj", gpr.getObjectDir());
		assertEquals(2, gpr.getSourcesDir().size());
		assertEquals("src", gpr.getSourcesDir().get(0));
		assertEquals("include", gpr.getSourcesDir().get(1));
		assertTrue(gpr.isExecutable());
		assertEquals("main.adb", gpr.getExecutableSourceNames().get(0));
		assertEquals(1, gpr.getExternalVariables().size());

	}

}
