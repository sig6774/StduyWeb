package com.stone.springmvc.board.dataservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.stone.springmvc.board.common.Board;

@Repository
public class 게시물DAO implements I게시물DAO {
	@Autowired I게시물Mapper 게시물Mapper;

	@Override
	@Transactional
	public void 저장하다(Board 새게시물) {
		게시물Mapper.저장하다(새게시물);		
	}

	@Override
	@Transactional
	public List<Board> 모두수집하다() {		
		return 게시물Mapper.모두수집하다();
	}

	@Override
	@Transactional
	public Board 찾다By번호(int 게시물번호) {
		return 게시물Mapper.찾다By번호(게시물번호);
	}

	@Override
	@Transactional
	public void 삭제하다(int 게시물번호) {
		게시물Mapper.삭제하다(게시물번호);		
	}

	@Override
	@Transactional
	public void 변경하다(Board 수정할게시물) {
		게시물Mapper.변경하다(수정할게시물);		
	}	
}
