package com.stone.springmvc.board.presentation;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.stereotype.Component;


import com.stone.springmvc.board.common.Board;
import com.stone.springmvc.board.service.게시물업무자;



@Controller
public class Board컨트롤러 {
	
	@Autowired 게시물업무자 한게시물업무자;
	
	@GetMapping("/board")
	public String 게시물을등록준비하다() {
		return "board/게시물등록창";
	}
	
	@PostMapping("/board")
	public String 게시물을등록하다(Board 새게시물) {
		한게시물업무자.게시물을저장하다(새게시물);
		return "board/게시물등록알림창";
	}
	
	@GetMapping("/boards")
	public ModelAndView 게시물목록을출력하다() {
		ArrayList<Board> 수집한게시물들 = 한게시물업무자.게시물목록을출력하다();
		ModelAndView mv = new ModelAndView();
		mv.setViewName("board/게시물목록창");
		mv.addObject("boards", 수집한게시물들);
		return mv;
	}
	
	@GetMapping("/board/{게시물번호}")
	public ModelAndView 게시물상세를출력하다(@PathVariable int 게시물번호) {
		Board 수집된게시물 = 한게시물업무자.특정게시물을조회하다(게시물번호);
		ModelAndView  mv = new ModelAndView();
		mv.setViewName("board/게시물상세창");
		mv.addObject("board", 수집된게시물);
		
		return mv;
	}

}
