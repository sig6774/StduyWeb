package com.stone.springmvc.board.dataservice;

import java.util.ArrayList;

import com.stone.springmvc.board.common.Board;

public interface I게시물Mapper {

	void 저장하다(Board 새게시물);

	ArrayList<Board> 모두수집하다();

	Board 찾다By번호(int 게시물번호);
	
	void 삭제하다(int 게시물번호);
	
	void 변경하다(Board 수정할게시물);

}