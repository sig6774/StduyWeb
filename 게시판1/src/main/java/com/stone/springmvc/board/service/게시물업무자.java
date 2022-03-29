package com.stone.springmvc.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.stone.springmvc.board.common.Board;
import com.stone.springmvc.board.dataservice.I게시물DAO;

@Service
public class 게시물업무자 implements I게시물업무자 {
    @Autowired I게시물DAO 게시물DAO;
	
	@Override
	@Transactional
	public void 등록하다(Board 새게시물) {
		게시물DAO.저장하다(새게시물);
	}

	@Override
	@Transactional
	public List<Board> 모두수집하다() {
		return 게시물DAO.모두수집하다();
	}

	@Override
	@Transactional
	public Board 찾다By번호(int 게시물번호) {
		return 게시물DAO.찾다By번호(게시물번호);
	}

	@Override
	@Transactional
	public void 삭제하다(int 게시물번호) {
		게시물DAO.삭제하다(게시물번호);
	}

	@Override
	@Transactional
	public void 변경하다(Board 수정할게시물) {
		게시물DAO.변경하다(수정할게시물);
	}

}
