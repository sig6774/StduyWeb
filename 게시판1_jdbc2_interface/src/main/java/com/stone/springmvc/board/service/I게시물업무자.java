package com.stone.springmvc.board.service;

import java.util.ArrayList;

import com.stone.springmvc.board.common.Board;

public interface I게시물업무자 {

	//    게시물DAO 한게시물DAO = new 게시물DAO();
	void 등록하다(Board 새게시물);

	ArrayList<Board> 모두수집하다();

	Board 찾다By번호(int 게시물번호);

	void 삭제하다(int 게시물번호);

	void 변경하다(Board 수정할게시물);

}