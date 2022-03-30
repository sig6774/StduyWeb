package com.stone.springmvc.board.service;

import java.util.ArrayList;

import com.stone.springmvc.board.common.Board;
import com.stone.springmvc.board.dataservice.게시물DAO;

public class 게시물업무자 {
	게시물DAO 게시물관리자 = new 게시물DAO();
	
	public void 게시물을등록하다(Board 새게시물) {
		게시물관리자.게시물을등록하다(새게시물);
	}
	
	public ArrayList<Board> 모두수집하다() {
		return 게시물관리자.모두수집하다();
	}
	
	public Board 찾다By번호(int 게시물번호) {
		return 게시물관리자.찾기By번호(게시물번호);
	}
	
	public void 게시물을변경하다(Board 수정할게시물) {
		게시물관리자.게시물을변경하다(수정할게시물);
	}

}
