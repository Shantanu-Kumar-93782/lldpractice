package com.practice.memnto;

public class DriverClass {

	
	//Second waala tarika hai, commented waala part main hai
	public static void main(String[] args) {
		
		//compose email
		Editor editor = new Editor();
		editor.getContent().addToSenderList("raghav@gmail.com");
		editor.getContent().setHeading("Naya Email");
		editor.getContent().setBody("Naye Email ki body");
		
		//Create and save draft
		editor.saveState();
		
		editor.getContent().setBody("Naye Email ki body 2");
		
		//create and save another draft
		editor.saveState();
		
//		History history = new History();
		
		//save draft
//		history.pushState(editorState);
		
		//save draft
//		history.pushState(editorState2);
		
		editor.getContent().setBody("Naye Email ki body 3");
		
		//retrieve draft
//		history.popState();
		
		//retrieve draft
//		EditorState targetState = history.popState();
		
		
		//Undo complete
//		editor.restoreState(targetState);
		editor.restoreState(null);
		editor.restoreState(null);
		
		System.out.println(editor.getContent());

	}

}
