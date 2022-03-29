package com.stone.springmvc.board.dataservice;

import java.util.ArrayList;


import com.stone.springmvc.board.common.Board;

public class 게시물DAO {
	게시물Mapper 한게시물Mapper=new 게시물Mapper();
	
	public void 저장하다(Board 새게시물) {
		한게시물Mapper.저장하다(새게시물);
	}

	public ArrayList<Board> 모두수집하다() {		
		return 한게시물Mapper.모두수집하다();
	}

	public Board 찾다By번호(int 게시물번호) {
		return 한게시물Mapper.찾다By번호(게시물번호);
	}

	public void 삭제하다(int 게시물번호) {
		한게시물Mapper.삭제하다(게시물번호);		
	}

	public void 변경하다(Board 수정할게시물) {
		한게시물Mapper.변경하다(수정할게시물);	
	}	
}
