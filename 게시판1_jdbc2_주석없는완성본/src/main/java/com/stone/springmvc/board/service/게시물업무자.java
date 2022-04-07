package com.stone.springmvc.board.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stone.springmvc.board.common.Board;
import com.stone.springmvc.board.dataservice.I게시물DAO;

@Service
public class 게시물업무자 implements I게시물업무자{
	@Autowired I게시물DAO 한게시물DAO;
	
	@Override 
	public void 게시물을저장하다(Board 새게시물) {
		한게시물DAO.게시물저장(새게시물);
	}
	
	@Override 
	public ArrayList<Board> 게시물목록을출력하다(){
		return 한게시물DAO.게시물목록출력();				
	}
	
	@Override 
	public Board 특정게시물을조회하다(int 게시물번호) {
		return 한게시물DAO.세부게시물찾기(게시물번호);
	}
	
	@Override 
	public void 특정게시물을삭제하다(int 게시물번호) {
		한게시물DAO.게시물삭제(게시물번호);
	}
	
	@Override 
	public void 특정게시물을변경하다(Board 수정할게시물) {
		한게시물DAO.게시물변경(수정할게시물);
	}
	

}
