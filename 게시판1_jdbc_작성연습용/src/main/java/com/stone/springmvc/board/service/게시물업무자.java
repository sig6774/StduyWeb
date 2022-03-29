package com.stone.springmvc.board.service;

import java.util.ArrayList;
import java.util.List;

import com.stone.springmvc.board.common.Board;
import com.stone.springmvc.board.dataservice.게시물DAO;


public class 게시물업무자 {
       게시물DAO 한게시물DAO = new 게시물DAO();

	public void 등록하다(Board 새게시물) {
		한게시물DAO.저장하다(새게시물);
	}

	public ArrayList<Board> 모두수집하다() {
		return 한게시물DAO.모두수집하다();
	}

	public Board 찾다By번호(int 게시물번호) {
		return 한게시물DAO.찾다By번호(게시물번호);
	}

	public void 삭제하다(int 게시물번호) {
		한게시물DAO.삭제하다(게시물번호);
	}


	public void 변경하다(Board 수정할게시물) {
		한게시물DAO.변경하다(수정할게시물);
	}

}
