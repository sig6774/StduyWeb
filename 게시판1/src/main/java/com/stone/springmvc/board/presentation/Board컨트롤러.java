package com.stone.springmvc.board.presentation;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.stone.springmvc.board.common.Board;
import com.stone.springmvc.board.service.I게시물업무자;


@Controller
public class Board컨트롤러 {
		@Autowired I게시물업무자 게시물업무자;
		
		@GetMapping("/board")
		public String 게시물을등록준비하다() {
			return "board/게시물등록창";					
		}
		
		@PostMapping("/board")
		public String 게시물을을등록하다(Board 새게시물) {
			게시물업무자.등록하다(새게시물);
			return "board/게시물등록알림창";					
		}
		
		@GetMapping("/boards")
		public ModelAndView 게시물목록을출력하다( ) {
			List<Board> 수집된게시물들= 게시물업무자.모두수집하다( );
			ModelAndView mv=new ModelAndView();
			mv.setViewName("board/게시물목록창");
			mv.addObject("boards", 수집된게시물들);			
			return mv;					
		}
		
		
		
		
		
		@GetMapping("/board/{게시물번호}")
		public ModelAndView 게시물상세를출력하다(@PathVariable int 게시물번호) {
			Board 수집된게시물= 게시물업무자.찾다By번호(게시물번호);
			ModelAndView mv=new ModelAndView();
			mv.setViewName("board/게시물상세창");
			mv.addObject("board", 수집된게시물);			
			return mv;								
		}
}



