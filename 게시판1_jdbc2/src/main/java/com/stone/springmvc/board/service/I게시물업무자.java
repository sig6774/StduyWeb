package com.stone.springmvc.board.service;

import java.util.ArrayList;

import com.stone.springmvc.board.common.Board;

public interface I게시물업무자 {
	
	public void 저장하다(Board 새게시물);
	
	public ArrayList<Board> 모두수집하다();
	
	public Board 찾다By번호(int 게시물번호);
	
	public void 삭제하다(int 게시물번호);
	
	public void 변경하다(Board 수정할게시물);
}
