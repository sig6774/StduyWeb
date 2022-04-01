package com.stone.springmvc.board.common;



public class Board {
	private int no;
	private String title;
	private String contents;
	
	
	public int getNo() {
		
		return no;
	}
	public void setNo(int no) {
	    if(no<0) {return   ;}
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
		
}
