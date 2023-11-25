package com.practice.memnto;

import java.util.Stack;

public class History {

	private Stack<EditorState> states = new Stack<>();

	public void pushState(EditorState newState) {
		states.add(newState);
	}

	public EditorState popState() {
		if (states.size() > 0) {
			return states.pop();
		}
		return null;
	}
}
