package org.gpr4j.internal.model;

import java.util.ArrayList;
import java.util.List;

import org.gpr4j.internal.utilities.StringUtilities;

import com.google.common.base.Preconditions;

/**
 * A Term corresponds to a string or to a string list.
 * 
 */
public class Term {

	private static final int STRING = 1;
	private static final int STRING_LIST = 2;

	private ArrayList<String> value;
	private int type;

	/**
	 * String factory method.
	 * 
	 * @param value
	 *            Value of the term.
	 * @return A string term is returned.
	 */
	public static Term CreateString(String value) {
		return new Term(value);
	}

	/**
	 * String list factory method.
	 * 
	 * @param value
	 *            Value of the term.
	 * @return A string list term is returned.
	 */
	public static Term CreateStringList(List<String> value) {
		return new Term(value);
	}

	/**
	 * String constructor.
	 * 
	 * @param value
	 *            Term value.
	 */
	private Term(String value) {
		this.value = new ArrayList<String>(1);
		this.value.add(StringUtilities.RemoveQuotes(value));
		this.type = STRING;
	}

	/**
	 * String list constructor.
	 * 
	 * @param value
	 *            Term value.
	 */
	private Term(List<String> value) {
		this.value = new ArrayList<String>(StringUtilities.RemoveQuotes(value));
		this.type = STRING_LIST;
	}

	/**
	 * Return whether the term is a string or not.
	 * 
	 * @return
	 */
	public boolean isAString() {
		return type == STRING;
	}

	/**
	 * Return the string associated to the string term.
	 * 
	 * @pre The term is a string.
	 * @return The string value.
	 */
	public String getAsString() {
		Preconditions.checkArgument(isAString());
		return value.get(0);
	}

	/**
	 * Return the string list associated to the string list term.
	 * 
	 * @pre The term is a string list.
	 * @return The string value.
	 */
	public List<String> getAsStringList() {
		return value;
	}

	private static Term ConcatStringLists(Term left, Term right) {
		Preconditions.checkArgument(!left.isAString() && !right.isAString());

		List<String> concatenatedList = new ArrayList<String>(left.getAsStringList());
		concatenatedList.addAll(right.getAsStringList());

		return CreateStringList(concatenatedList);
	}

	private static Term ConcatStrings(Term left, Term right) {
		Preconditions.checkArgument(left.isAString() && right.isAString());

		return CreateString(left.getAsString() + right.getAsString());
	}

	public static Term Concat(Term left, Term right) {
		Preconditions.checkArgument((left != null) && (right != null));
		Preconditions.checkArgument((left.isAString() && right.isAString()) || !left.isAString());

		Term concatenatedTerm;

		if (left.isAString()) {
			concatenatedTerm = ConcatStrings(left, right);
		} else {
			if (right.isAString()) {
				List<String> concatenatedList = new ArrayList<String>(left.getAsStringList());
				concatenatedList.add(right.getAsString());

				concatenatedTerm = CreateStringList(concatenatedList);
			} else {
				concatenatedTerm = ConcatStringLists(left, right);
			}
		}

		return concatenatedTerm;
	}
}
