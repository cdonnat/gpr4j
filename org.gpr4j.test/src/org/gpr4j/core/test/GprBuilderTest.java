package org.gpr4j.core.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.gpr4j.core.GprBuilder;
import org.gpr4j.core.GprProject;
import org.gpr4j.core.Symbol;
import org.gpr4j.core.internal.Project;
import org.junit.Test;

public class GprBuilderTest {

	private Project project;
	private GprBuilder sut;

	private final String projectPath = System.getProperty("user.dir") + "/src/org/gpr4j/test/gpr";

	private void createFixture() {
		this.project = new Project(Paths.get(projectPath, "/sample_project.gpr")); // mock(IProject.class);
		// when(this.projectMock.getPath()).thenReturn(Paths.get(projectPath,
		// "/sample_project.gpr"));
		this.sut = new GprBuilder(this.project);
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

		GprProject gpr = this.sut.build();

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
