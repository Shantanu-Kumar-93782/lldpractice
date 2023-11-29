package com.practice.builder;

public class UriBuilderImpl extends UriBuilder {

	private String url;

	@Override
	public void applyurl(String url) {
		this.url = url;

	}

	@Override
	public Uri build() {
		return new Uri(url);
	}

}
