package com.stone.springmvc.board.service;

import java.util.ArrayList;

import com.stone.springmvc.board.common.Board;

public interface I게시물업무자 {
	
	public void  게시물을저장하다(Board 새게시물);
	
	public ArrayList<Board> 게시물목록을출력하다();
	
	public Board 특정게시물을조회하다(int 게시물번호);
	
	public void 특정게시물을삭제하다(int 게시물번호);
	
	public void 특정게시물을변경하다(Board 수정할게시물);

}
