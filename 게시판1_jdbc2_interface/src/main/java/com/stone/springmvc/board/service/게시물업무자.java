package com.stone.springmvc.board.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stone.springmvc.board.common.Board;
import com.stone.springmvc.board.dataservice.I게시물DAO;
import com.stone.springmvc.board.dataservice.게시물DAO;

@Service
// @Service를 Annotation하면 Spring이 직접 객체를 만듬(new ~~~()) 
public class 게시물업무자 implements I게시물업무자  {
	@Autowired I게시물DAO 한게시물DAO;
	// @Autowird 클래스 객체 : 위처럼 작성하면 Spring이 웹서버를 시작할 때 자동으로 객체를 생성하고 관리함

//    게시물DAO 한게시물DAO = new 게시물DAO();
	@Override
	public void 등록하다(Board 새게시물) {
		한게시물DAO.저장하다(새게시물);
	}

	@Override
	public ArrayList<Board> 모두수집하다() {
		return 한게시물DAO.모두수집하다();
	}

	@Override
	public Board 찾다By번호(int 게시물번호) {
		return 한게시물DAO.찾다By번호(게시물번호);
	}

	@Override
	public void 삭제하다(int 게시물번호) {
		한게시물DAO.삭제하다(게시물번호);
	}


	@Override
	public void 변경하다(Board 수정할게시물) {
		한게시물DAO.변경하다(수정할게시물);
	}
}

