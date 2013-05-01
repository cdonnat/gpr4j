package org.gpr4j.api;

public class Item {

	private String name;

	public Item(String name) {
		this.name = name.toLowerCase();
	}

	public String getName() {
		return this.name;
	}
}
