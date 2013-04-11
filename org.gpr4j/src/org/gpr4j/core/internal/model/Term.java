package org.gpr4j.core.internal.model;

import java.util.ArrayList;
import java.util.List;

import org.gpr4j.utilities.StringUtilities;

import com.google.common.base.Preconditions;

/**
 * A Term corresponds to a variable or to an attribute of a project unit.
 * 
 */
public class Term {

	private static final int STRING = 1;
	private static final int STRING_LIST = 2;

	private ArrayList<String> value;
	private int type;

	public static Term CreateString(String value) {
		return new Term(value);
	}

	public static Term CreateStringList(List<String> value) {
		return new Term(value);
	}

	private Term(String value) {
		this.value = new ArrayList<String>(1);
		this.value.add(StringUtilities.RemoveQuotes(value));
		this.type = STRING;
	}

	private Term(List<String> value) {
		this.value = new ArrayList<String>(StringUtilities.RemoveQuotes(value));
		this.type = STRING_LIST;
	}

	public boolean isAString() {
		return type == STRING;
	}

	public String getAsString() {
		Preconditions.checkArgument(isAString());
		return value.get(0);
	}

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
