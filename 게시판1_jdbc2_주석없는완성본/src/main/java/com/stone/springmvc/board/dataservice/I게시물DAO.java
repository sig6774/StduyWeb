package com.stone.springmvc.board.dataservice;

import java.util.ArrayList;

import com.stone.springmvc.board.common.Board;

public interface I게시물DAO {
	
	void 게시물저장(Board 새게시물);
	
	ArrayList<Board> 게시물목록출력();
	
	Board 세부게시물찾기(int 게시물번호);
	
	void 게시물삭제(int 게시물번호);
	
	void 게시물변경(Board 수정할게시물);

}
