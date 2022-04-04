package com.stone.springmvc.board.dataservice;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.stone.springmvc.board.common.Board;

@Repository 
public class 게시물DAO implements I게시물DAO {
	@Autowired I게시물Mapper 한게시물Mapper;
	
	@Override
	public void 저장하다(Board 새게시물) {
		한게시물Mapper.저장하다(새게시물);
	}
	
	@Override 
	public ArrayList<Board> 모두수집하다() {
		ArrayList<Board> 모든게시물 = 한게시물Mapper.모두수집하다();
		return 모든게시물;
	}
	
	@Override 
	public Board 찾다By번호(int 게시물번호) {
		Board 특정게시물 = 한게시물Mapper.찾다By번호(게시물번호);
		return 특정게시물;
	}
	
	@Override
	public void 삭제하다(int 게시물번호) {
		한게시물Mapper.삭제하다(게시물번호);
	}
	
	@Override
	public void 변경하다(Board 수정할게시물) {
		한게시물Mapper.변경하다(수정할게시물);
	}
	
	

}
