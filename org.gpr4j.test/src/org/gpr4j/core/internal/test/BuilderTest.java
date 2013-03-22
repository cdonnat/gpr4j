package org.gpr4j.core.internal.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.gpr4j.core.Factory;
import org.gpr4j.core.Gpr;
import org.gpr4j.core.Symbol;
import org.gpr4j.core.internal.ProjectUnit;
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

		this.project.addAttribute("exec_dir", Symbol.CreateString("new_exe"));
		this.project.addAttribute("object_dir", Symbol.CreateString("obj"));

		List<String> sourcesDir = new ArrayList<String>();
		sourcesDir.add("src");
		sourcesDir.add("include");
		this.project.addAttribute("source_dirs", Symbol.CreateStringList(sourcesDir));

		List<String> main = new ArrayList<String>();
		main.add("main.adb");
		this.project.addAttribute("Main", Symbol.CreateStringList(main));

		Gpr gpr = Factory.CreateGpr(this.project);

		assertEquals("sample_project", gpr.getName());
		assertEquals(projectPath, gpr.getRootDirPath().toString());
		assertEquals("new_exe", gpr.getExecutableDir());
		assertEquals("obj", gpr.getObjectDir());
		assertEquals(2, gpr.getSourcesDir().size());
		assertEquals("src", gpr.getSourcesDir().get(0));
		assertEquals("include", gpr.getSourcesDir().get(1));
		assertTrue(gpr.isExecutable());
		assertEquals("main.adb", gpr.getExecutableSourceNames().get(0));

	}

}
