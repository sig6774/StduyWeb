package com.stone.springmvc.board.presentation;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.stone.springmvc.board.common.Board;
import com.stone.springmvc.board.service.게시물업무자;

@Controller
public class Board컨트롤러 {
	게시물업무자 한게시물업무자 = new 게시물업무자();
	
	@GetMapping("/prepareboard")
	public ModelAndView 게시물입력을준비하다() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("게시물등록창");
		return mv;
	}
	
	@PostMapping("/addboard")
	public ModelAndView 게시물등록하다(Board 새게시물){
		한게시물업무자.게시물을등록하다(새게시물);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("게시물등록알림창");
		return mv;
	}
	
	@GetMapping("/listboard")
	public ModelAndView 게시물목록을출력하다() {
		ArrayList<Board> 모든게시물 = 한게시물업무자.모두수집하다();
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("게시물목록창");
		mv.addObject("boards", 모든게시물);
		return mv;
	}
	
	@GetMapping("/viewboard")
	public ModelAndView 상세게시물을출력하다(@RequestParam("no") int 게시물번호) {
		ModelAndView mv = new ModelAndView();
		
		Board 찾은게시물 = 한게시물업무자.찾다By번호(게시물번호);
		mv.setViewName("게시물상세창");
		mv.addObject("board", 찾은게시물);
		return mv;
	}
	
	@GetMapping("/preparealterboard")
	public ModelAndView 게시물변경을준비하다() {
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("게시물변경창");
		return mv;  
		// 게시물등록창.jsp를 생성하여 게시물입력을준비
	}
	@PostMapping("/alterboard")
	public ModelAndView 게시물을변경하다(Board 수정할게시물) {
		한게시물업무자.게시물을변경하다(수정할게시물);
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("게시물변경알림창");
		
		return mv;
	}
	// 변경기능은 되는데 실제로 바뀌지는 않음 ... 고민해보기 


}
