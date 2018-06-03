package com.practice.fileio;

public class SongsInfo {
	private String title, singer;

	public SongsInfo(String t, String s) {
		title = t;
		singer = s;
	}
	
	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	
	
	public String tostring() {
		return (title + singer);

	}
	
}
