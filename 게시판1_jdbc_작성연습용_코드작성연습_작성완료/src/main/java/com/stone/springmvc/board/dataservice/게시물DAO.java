package com.stone.springmvc.board.dataservice;

import java.util.ArrayList;

import com.stone.springmvc.board.common.Board;

public class 게시물DAO {
	게시물Mapper 게시물맵퍼 = new 게시물Mapper();
	
	public void 게시물을등록하다(Board 새게시물) {
		게시물맵퍼.저장하다(새게시물);
	}
	
	public ArrayList<Board> 모두수집하다() {
		ArrayList<Board> 수집된게시물 = 게시물맵퍼.모두수집하다();
		return 수집된게시물;
	}
	
	public Board 찾기By번호(int 게시물번호) {
		Board 찾은게시물 = 게시물맵퍼.찾다By번호(게시물번호);
		return 찾은게시물;
	}
	
	public void 게시물을변경하다(Board 수정할게시물) {
		게시물맵퍼.변경하다(수정할게시물);
	}

}
