package com.stone.springmvc.board.presentation;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.stone.springmvc.board.common.Board;
import com.stone.springmvc.board.service.게시물업무자;

@Controller
public class Board컨트롤러2 {
		게시물업무자 한게시물업무자=new 게시물업무자();
		
		@GetMapping("/prepareboard")
		public ModelAndView 게시물입력을준비하다() {
			ModelAndView mv = new ModelAndView();
			mv.setViewName("게시물등록창");
			return mv; 
			// 게시물등록창.jsp를 생성하여 게시물입력을준비
		}
		@PostMapping("/addboard")
		public ModelAndView 게시물을등록하다(Board 새게시물) {
			한게시물업무자.등록하다(새게시물);
			ModelAndView mv = new ModelAndView();
			mv.setViewName("게시물등록알림창");
//			mv.addObject("board", 새게시물);
			
			return mv;
			// 새게시물을 입력받아서 게시물등록알림창.jsp에 새게시물을 board로 보내주도록 Mapping
			// board를 안보내주는거네 
		}
		
		@GetMapping("/listboard")
		public ModelAndView 게시물목록을출력하다() {
			ArrayList<Board> 모든게시물들 = 한게시물업무자.모두수집하다();
			
			int 게시물개수 = 모든게시물들.size();
			// 게시물 개수를 출력하기 위해 지정 
			ModelAndView mv = new ModelAndView();
			mv.setViewName("게시물목록창");
			mv.addObject("boards", 모든게시물들);
			mv.addObject("countboard", 게시물개수);
			// countboard를 통해서 게시물 개수 추가 
			return mv;
		}
		
		@GetMapping("/viewboard")
		public ModelAndView 게시물상세를출력하다(@RequestParam("no") int 게시물번호) {
			Board 특정게시물 = 한게시물업무자.찾다By번호(게시물번호);
			
			ModelAndView mv = new ModelAndView();
			mv.setViewName("게시물상세창");
			mv.addObject("board", 특정게시물);
			return mv;
		}
		// 특정게시물을 찾기위해 게시물번호를 받아서 찾은 게시물을 게시물상세창.jsp에 board로 Mapping하여 전송
		
//		@GetMapping("/listboard")
//		public ModelAndView 게시물개수를출력( ) {
//			ArrayList<Board> 모든게시물들 = 한게시물업무자.모두수집하다();
//			int 게시물개수 = 모든게시물들.size();
//			
//			ModelAndView mv = new ModelAndView();
//			mv.setViewName("게시물목록창");
//			mv.addObject("countboard", 게시물개수);
//			return mv;
//	
//		}
}



