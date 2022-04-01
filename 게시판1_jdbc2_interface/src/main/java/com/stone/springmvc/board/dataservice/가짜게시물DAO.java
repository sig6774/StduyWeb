package com.stone.springmvc.board.dataservice;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;
import com.stone.springmvc.board.common.Board;

//@Repository 
public class 가짜게시물DAO implements I게시물DAO {
	ArrayList<Board>가짜게시물들 = new ArrayList<Board>();

	public 가짜게시물DAO() {
		Board 첫번째게시물 = new Board();
		첫번째게시물.setNo(1);
		첫번째게시물.setTitle("봄");
		첫번째게시물.setContents("봄꽃");
		가짜게시물들.add(첫번째게시물);
		
		Board 두번째게시물 = new Board();
		두번째게시물.setNo(2);
		두번째게시물.setTitle("여름");
		두번째게시물.setContents("여름꽃");
		가짜게시물들.add(두번째게시물);
	}

	@Override
	public void 저장하다(Board 새게시물) {
		System.out.println("가짜 저장하다.");
		새게시물.setNo(가짜게시물들.size()+1);
		가짜게시물들.add(새게시물);
	}

	@Override
	public ArrayList<Board> 모두수집하다() {
		System.out.println("가짜 모두수집하다.");
		return 가짜게시물들;
	}

	@Override
	public Board 찾다By번호(int 게시물번호) {
		System.out.println("가짜 찾다By번호.");
		return 가짜게시물들.get(게시물번호-1);
	}

	@Override
	public void 삭제하다(int 게시물번호) {
		System.out.println("가짜 삭제하다.");

	}

	@Override
	public void 변경하다(Board 수정할게시물) {
		System.out.println("가짜 변경하다.");

	}

}
