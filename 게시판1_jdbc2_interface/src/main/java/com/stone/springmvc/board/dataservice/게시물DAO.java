package com.stone.springmvc.board.dataservice;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.stone.springmvc.board.common.Board;

@Repository 
//@Repository는 spiring에게 시작할 때 객체를 만들라는 명령 (@Service와 같음)

public class 게시물DAO implements I게시물DAO{ // I게시물DAO interface 포함 
	@Autowired I게시물Mapper 한게시물Mapper;
	// @Autowird 클래스 객체 : 위처럼 작성하면 Spring이 웹서버를 시작할 때 자동으로 객체를 생성하고 관리함

//	게시물Mapper 한게시물Mapper=new 게시물Mapper();
	
	// @Override : 인터페이스에서 추상화한 행동(메소드)을 구체화해서 조정 
	@Override 
	public void 저장하다(Board 새게시물) {
		한게시물Mapper.저장하다(새게시물);
	}
	
	@Override
	public ArrayList<Board> 모두수집하다() {		
		return 한게시물Mapper.모두수집하다();
	}
	@Override

	public Board 찾다By번호(int 게시물번호) {
		return 한게시물Mapper.찾다By번호(게시물번호);
	}
	@Override

	public void 삭제하다(int 게시물번호) {
		한게시물Mapper.삭제하다(게시물번호);		
	}

	public void 변경하다(Board 수정할게시물) {
		한게시물Mapper.변경하다(수정할게시물);	
	}	
}


