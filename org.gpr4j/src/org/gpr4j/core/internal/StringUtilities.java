package org.gpr4j.core.internal;

import java.util.ArrayList;
import java.util.List;

import com.google.common.base.Preconditions;

public class StringUtilities {

	public static String RemoveQuotes(String input) {
		String res = input;
		if (input.startsWith("\"") && input.endsWith("\"")) {
			res = input.substring(1, input.length() - 1);
		}
		return res;
	}

	public static List<String> RemoveQuotes(List<String> input) {
		ArrayList<String> res = new ArrayList<String>(input.size());
		for (String element : input) {
			res.add(RemoveQuotes(element));
		}
		return res;
	}

	/**
	 * Join the string element of an array
	 * 
	 * @param tab
	 *            Array containing the element to join
	 * @param from
	 *            Starting index in the array
	 * @param size
	 *            Number of element to join
	 * @pre from + size - 1 <= tab.length
	 * @return A string containing the joined element.
	 */
	public static String Join(String[] tab, int from, int size) {
		Preconditions.checkArgument(from + size - 1 <= tab.length);
		StringBuilder res = new StringBuilder();

		for (int i = from; i < from + size; i++) {
			res.append(tab[i]);
		}
		return res.toString();
	}

}
