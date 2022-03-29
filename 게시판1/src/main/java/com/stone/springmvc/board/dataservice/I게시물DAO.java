package com.stone.springmvc.board.dataservice;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.stone.springmvc.board.common.Board;

public interface I게시물DAO {
	
	void 저장하다(Board 새게시물);
	
	List<Board> 모두수집하다();
	
	Board 찾다By번호(int 게시물번호);
	
	void 삭제하다(int 게시물번호);
	   
	void 변경하다(Board 수정할게시물);
}
