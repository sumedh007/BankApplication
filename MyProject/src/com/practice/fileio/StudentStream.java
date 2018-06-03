package com.practice.fileio;

import java.io.Serializable;

public class StudentStream implements Serializable {
	private String stream;
	private int seq;
	public StudentStream(String stream, int seq) {
		this.stream = stream;
		this.seq = seq;
		
	}
	public String getStream(){
		return stream;
	}
	public int getSeq(){
		return seq;
	}
	
}
