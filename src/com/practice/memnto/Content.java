package com.practice.memnto;

import java.util.HashSet;
import java.util.Set;

public class Content {

	private Set<String> senderList = new HashSet<>();

	private String heading;

	private String body;
	
	

	public Set<String> getSenderList() {
		return senderList;
	}

	public void setSenderList(Set<String> senderList) {
		this.senderList = senderList;
	}

	public Content(Set<String> senderList, String heading, String body) {
		this.senderList = senderList;
		this.heading = heading;
		this.body = body;
	}
	
	public Content() {

	}

	public void addToSenderList(String sernder) {
		senderList.add(sernder);
	}

	public String getHeading() {
		return heading;
	}

	public void setHeading(String heading) {
		this.heading = heading;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	@Override
	public String toString() {
		return "Content [senderList=" + senderList + ", heading=" + heading + ", body=" + body + "]";
	}
	
	

}
