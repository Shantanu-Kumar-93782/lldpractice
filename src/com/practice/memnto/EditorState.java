package com.practice.memnto;

public class EditorState {

	private Content content;
	
	public EditorState(Content content, History history) {
		this.content = new Content(content.getSenderList(), content.getHeading(), content.getBody());
		history.pushState(this);
	}

	public Content getContent() {
		return content;
	}

	public void setContent(Content content) {
		this.content = content;
	}
}
