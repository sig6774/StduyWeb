package com.stone.springmvc.board.dataservice;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.stone.springmvc.board.common.Board;

@Mapper
public interface I게시물Mapper {
	
	@Insert("insert into board(title,contents) values(#{title},#{contents})")
	void 저장하다(Board 새게시물);
	
	@Select("select * from board")
	@Results(value= {
		@Result(property="no", column="no"),
		@Result(property="title", column="title"),
		@Result(property="contents", column="contents"),
		@Result(property="wdate", column="wdate")})
	List<Board> 모두수집하다();
	
	@Select("select * from board where no=#{no}")
	@Results(value= {
		@Result(property="no", column="no"),
		@Result(property="title", column="title"),
		@Result(property="contents", column="contents"),
		@Result(property="wdate", column="wdate")})
	Board 찾다By번호(@Param("no") int 게시물번호);
	
	@Delete("delete from board where no=#{no}")
	void 삭제하다(@Param("no") int 게시물번호);
	   
	@Update("update board set title=#{title}, contents=#{contents} where no=#{no}")
	void 변경하다(Board 수정할게시물);
}
