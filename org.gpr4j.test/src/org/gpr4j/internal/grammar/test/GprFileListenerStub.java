package org.gpr4j.internal.grammar.test;

import org.antlr.v4.runtime.tree.ParseTree;
import org.gpr4j.internal.Loader;
import org.gpr4j.internal.grammar.GprFileListener;
import org.gpr4j.internal.model.Term;

public class GprFileListenerStub extends GprFileListener {

	public GprFileListenerStub(Loader loader) {
		super(loader);
	}

	public String getStringFor(ParseTree node) {
		return this.stringNodes.get(node);
	}

	public Term getTermFor(ParseTree node) {
		return this.termNodes.get(node);
	}

}
