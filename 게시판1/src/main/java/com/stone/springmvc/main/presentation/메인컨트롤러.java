package com.stone.springmvc.main.presentation;


import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class 메인컨트롤러 {
		
		@RequestMapping("main")
		public ModelAndView 메인페이지를주다(HttpSession session) {
			System.out.println("tttttttttttttttttttttttsssssssssssseeeeeeeeee");
			ModelAndView mv = new ModelAndView();
			mv.setViewName("contents/main");	
			/*
			 * boolean 로그인중=(session.getAttribute("id")!=null)?true:false;
			 * mv.addObject("isLogin",로그인중);
			 */
			return mv;
					
		}
		
}



