package org.gpr4j.api.test;

import static org.junit.Assert.*;
import java.util.HashSet;
import java.util.Set;

import org.gpr4j.api.Type;
import org.junit.Test;

public class TypeTest {

	@Test
	public void testTypeEquals() {

		Set<String> s1 = new HashSet<>();
		s1.add("native-zfp");
		s1.add("native-full");
		Set<String> s2 = new HashSet<>(s1);

		Type Platform = new Type("Platform", s1);
		Type PLatform = new Type("PLatform", s2);
		Type Other = new Type("Other", s1);

		assertEquals("Same instance shall be equal", Platform, Platform);
		assertEquals("Type with same name and same values shall be equal", Platform, PLatform);

		assertFalse("Type with different name shall not be equal", Platform.equals(Other));
		assertFalse("An instance of Type shall not be equal to null", Platform.equals(null));
		assertFalse("An instance of Type shall not be equal to a string", Platform.equals("toto"));
	}

	@Test
	public void testTypeHashCode() {

		Set<String> s1 = new HashSet<>();
		s1.add("native-zfp");
		s1.add("native-full");
		Set<String> s2 = new HashSet<>(s1);

		Type Platform = new Type("Platform", s1);
		Type PLatform = new Type("PLatform", s2);
		Type Other = new Type("Other", s1);

		assertEquals("Same instance shall have the same hash code", Platform.hashCode(),
				Platform.hashCode());
		
		assertEquals("Type with same name and same values shall have the same hash code",
				Platform.hashCode(), PLatform.hashCode());

		assertTrue("Type with different name shall have a different hash code",
				Platform.hashCode() != Other.hashCode());
	}

}
