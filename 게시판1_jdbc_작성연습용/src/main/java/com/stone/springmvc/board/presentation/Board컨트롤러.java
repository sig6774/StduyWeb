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
public class Board컨트롤러 {
		게시물업무자 한게시물업무자=new 게시물업무자();
		
//		@GetMapping("/prepareboard")
//		public ModelAndView 게시물입력을준비하다() {
//			
//			ModelAndView mv = new ModelAndView();
//			mv.setViewName("게시물등록창");
//			// 뷰 이름 등록
//			// mv.addObject(attributeValue) // 보내는 데이터가 있으면 사용 
//			return  mv;
//		}
//		
//		@PostMapping("/addBoard")
//		public ModelAndView 게시물을등록하다(Board 새게시물) {
//
//			한게시물업무자.등록하다(새게시물);
//			// 게시물업무자에 새게시물을 등록 
//			
//			ModelAndView mv = new ModelAndView();
//			mv.setViewName("게시물등록알림창");
//			// 뷰 이름 등록 및 이동   
//			return  mv;
//			// 이렇게 되는건가 
//		}
//
////		@GetMapping("/listboard")
////		public ModelAndView 게시물목록을출력하다() {
////			
////			
////			ArrayList<Board> 모든게시물들 = 한게시물업무자.모두수집하다();
////			// 모든게시물들 수집(업무처리)	
////			ModelAndView mv = new ModelAndView();
////			mv.setViewName("게시물목록창");
////			// 게시물목록창.jsp
////			mv.addObject("listboard", 모든게시물들);
////			// 게시물목록창.jsp에 모든게시물들을 listboard라는 이름으로 Mapping 
////			return mv;
////		}
//		
//		@GetMapping("/listboard")
//		public ModelAndView 게시물목록을출력하다() {
//			ArrayList<Board> 게시물전체 = 한게시물업무자.모두수집하다();
//			ModelAndView mv = new ModelAndView();
//			
//			mv.setViewName("게시물목록창");
//			// 뷰 이름 등록 및 이동   
//			mv.addObject("boards", 게시물전체);
//			return  mv;
//		}
//		
//		@GetMapping("/viewboard")
//		public ModelAndView 상세게시물을조회하다(@RequestParam("no") int 게시물번호) {
//			// @RequestParamint(" ") : 파라미터가 넘어올때 " "안의 이름으로 맞추겠다라는 뜻?
//
//			// 업무-게시물찾기
//			Board 특정게시물 = 한게시물업무자.찾다By번호(게시물번호);
//			ModelAndView mv = new ModelAndView();
//			mv.setViewName("게시물상세창");
//			// board에 게시물상세창.jsp 생성 
//			mv.addObject("board", 특정게시물);
//			// 여기 Controller에서 특정게시물 객체를 게시물상세창.jsp에서 사용하기 위해 board로 Mapping
//			return mv;
//		}
		@GetMapping("/prepareboard")
		public ModelAndView 게시물입력을준비하다() {
			ModelAndView mv = new ModelAndView();
			mv.setViewName("게시물등록창");
			return mv;
		}
		
		@PostMapping("/addBoard")
		public ModelAndView 게시물을등록하다(Board 새게시물) {

			한게시물업무자.등록하다(새게시물);
			// 게시물업무자에 새게시물을 등록 
			
			ModelAndView mv = new ModelAndView();
			mv.setViewName("게시물등록알림창");
			// 뷰 이름 등록 및 이동   
			return  mv;
			// 이렇게 되는건가 
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
		public ModelAndView 게시물상세를출력하다(@RequestParam("no") int 게시물번호) {
			Board 특정게시물 = 한게시물업무자.찾다By번호(게시물번호);
			ModelAndView mv = new ModelAndView();
			mv.setViewName("게시물상세창");
			mv.addObject("board", 특정게시물);
			return mv;
		}
		
		
}



