package com.practice.memnto;

public class Editor {

	Content content = new Content();

	History history = new History();
	
	public Content getContent() {
		return content;
	}

	public void setContent(Content content) {
		this.content = content;
	}
	
	public EditorState saveState() {
		return new EditorState(content, history);
	}
	
	public void restoreState(EditorState editorState) {
		this.content = history.popState().getContent();
	}

}
