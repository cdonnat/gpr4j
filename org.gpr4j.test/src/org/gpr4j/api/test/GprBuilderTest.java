package org.gpr4j.api.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.gpr4j.api.GprBuilder;
import org.gpr4j.api.GprProject;
import org.gpr4j.api.Symbol;
import org.junit.Test;

public class GprBuilderTest {

	private PropertiesProviderStub propertiesProviderStub;
	private GprBuilder sut;

	private final String projectPath = System.getProperty("user.dir") + "/src/org/gpr4j/test/gpr";

	private void createFixture() {
		this.propertiesProviderStub = new PropertiesProviderStub();
		this.sut = new GprBuilder(propertiesProviderStub, Paths.get(projectPath
				+ "/sample_project.gpr"));
	}

	@Test
	public void test() {

		this.createFixture();

		String name = "sample_project";

		this.propertiesProviderStub.setName(name);
		this.propertiesProviderStub.addAttribute("Exec_Dir", Symbol.CreateString("new_exe"));
		this.propertiesProviderStub.addAttribute("Object_Dir", Symbol.CreateString("obj"));

		List<String> sourcesDir = new ArrayList<String>();
		sourcesDir.add("src");
		sourcesDir.add("include");
		this.propertiesProviderStub
				.addAttribute("Source_Dirs", Symbol.CreateStringList(sourcesDir));

		List<String> main = new ArrayList<String>();
		main.add("main.adb");
		this.propertiesProviderStub.addAttribute("Main", Symbol.CreateStringList(main));

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
