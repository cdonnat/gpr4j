package org.gpr4j.api.test;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

import org.gpr4j.api.ExternalVariable;
import org.gpr4j.api.Type;
import org.junit.Test;

public class ExternalVariableTest {

	@Test
	public void testEquals() {
		Set<String> typeValues = new HashSet<>();
		typeValues.add("native-zfp");
		typeValues.add("native-full");

		ExternalVariable Platform = new ExternalVariable("Platform", "native-zfp", new Type(
				"T_PLatform", typeValues));
		ExternalVariable PlatformWithSameDefaultValueNotCaseSensitive = new ExternalVariable(
				"Platform", "natIve-zfp", new Type("T_PLatform", typeValues));
		ExternalVariable PlatformWithDifferentDefaultValue = new ExternalVariable("Platform",
				"native-full", new Type("T_PLatform", typeValues));
		ExternalVariable PlatformWithoutType = new ExternalVariable("Platform", "native-zfp", null);
		ExternalVariable PLatform = new ExternalVariable("PLatform", "native-zfp", new Type(
				"T_PLatform", typeValues));
		ExternalVariable other = new ExternalVariable("other", "native-zfp", new Type("T_PLatform",
				typeValues));

		assertEquals("Same instance shall be equal", Platform, Platform);
		assertEquals("External variable shall not be case sensitive on the default value",
				Platform, PlatformWithSameDefaultValueNotCaseSensitive);
		assertEquals("External variable shall not be case sensitive on the name", Platform,
				PLatform);
		assertFalse("External variable with different default value shall not be equal",
				Platform.equals(PlatformWithDifferentDefaultValue));
		assertFalse("External variable with different name shall not be equal",
				Platform.equals(other));
		assertFalse(
				"A typed instance of external variable shall not be equal to a non typed external variable",
				Platform.equals(PlatformWithoutType));
		assertFalse("An instance of external variable shall not be equal to null",
				Platform.equals(null));
		assertFalse("An instance of external variable shall not be equal to a string",
				Platform.equals("toto"));
	}

	@Test
	public void testHashCode() {
		Set<String> typeValues = new HashSet<>();
		typeValues.add("native-zfp");
		typeValues.add("native-full");

		ExternalVariable Platform = new ExternalVariable("Platform", "native-zfp", new Type(
				"T_PLatform", typeValues));
		ExternalVariable PlatformWithDifferentDefaultValue = new ExternalVariable("Platform",
				"native-full", new Type("T_PLatform", typeValues));
		ExternalVariable PlatformWithoutType = new ExternalVariable("Platform", "native-zfp", null);
		ExternalVariable PLatform = new ExternalVariable("PLatform", "native-zfp", new Type(
				"T_PLatform", typeValues));
		ExternalVariable other = new ExternalVariable("other", "native-zfp", new Type("T_PLatform",
				typeValues));

		assertEquals("Same instance shall have the same hash code", Platform.hashCode(),
				Platform.hashCode());
		assertEquals("External variable shall not be case sensitive on the name",
				Platform.hashCode(), PLatform.hashCode());
		assertFalse(
				"External variable with different default value shall not have the same hash code",
				Platform.hashCode() == PlatformWithDifferentDefaultValue.hashCode());
		assertFalse("External variable with different name shall not have the same hash code",
				Platform.hashCode() == other.hashCode());
		assertFalse(
				"A typed instance of external variable shall have the same hash code as a non typed external variable",
				Platform.hashCode() == PlatformWithoutType.hashCode());
	}

}
