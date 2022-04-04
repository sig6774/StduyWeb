//package com.stone.springmvc.board.presentation;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.util.ArrayList;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Controller;
//import org.springframework.stereotype.Repository;
//import org.springframework.stereotype.Service;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.servlet.ModelAndView;
//
//import com.stone.springmvc.board.common.Board;
//
//import config.DBConfig;
//@Component
//class 게시물Mapper {
//	
//	void 저장하다(Board 새게시물) {
//		Connection con = null;		 
//		try{
//		    Class.forName("com.mysql.cj.jdbc.Driver");
//		    con=DriverManager.getConnection(DBConfig.DBURL, DBConfig.ID, DBConfig.PASSWORD);        
//		    PreparedStatement 명령자=con.prepareStatement("insert into board(title,contents) values(?,?)");
//		    명령자.setString(1, 새게시물.getTitle());
//		    명령자.setString(2, 새게시물.getContents());        
//		    명령자.executeUpdate();
//		    con.close();
//		}
//		catch(Exception ex){ ex.printStackTrace(); }
//	}
//	
//	ArrayList<Board> 모두수집하다(){
//		ArrayList<Board> 수집된게시물들=new ArrayList<Board>();
//		Connection con = null;		 
//		try{
//		    Class.forName("com.mysql.cj.jdbc.Driver");
//		    con=DriverManager.getConnection(DBConfig.DBURL, DBConfig.ID, DBConfig.PASSWORD);
//		    PreparedStatement 명령자=con.prepareStatement("select * from board");
//		    ResultSet 게시물표= 명령자.executeQuery();
//		    while(게시물표.next()) {
//		    	
//		    	int 게시물번호 =게시물표.getInt("no");
//		    	String 제목= 게시물표.getString("title");
//		    	String 내용= 게시물표.getString("contents");
//		    	Board 한게시물 = new Board();	        	
//		    	한게시물.setNo(게시물번호);
//		    	한게시물.setTitle(제목);
//		    	한게시물.setContents(내용);
//		    	
//		    	수집된게시물들.add(한게시물);
//		    }
//		    게시물표.close();
//		    con.close();
//		}
//		catch(Exception ex){ ex.printStackTrace(); }
//		return 수집된게시물들;
//	}
//	
//	Board 찾다By번호( int 게시물번호) {
//		Board 찾은게시물 = null;
//		Connection con = null;		 
//		try{
//		    Class.forName("com.mysql.cj.jdbc.Driver");
//		    con=DriverManager.getConnection(DBConfig.DBURL, DBConfig.ID, DBConfig.PASSWORD);
//		    PreparedStatement 명령자=con.prepareStatement("select title,contents from board where no=?");
//		    명령자.setInt(1, 게시물번호);
//		    ResultSet 게시물표= 명령자.executeQuery();
//		    if(게시물표.next()) {		    	
//		    	String 제목= 게시물표.getString("title");
//		    	String 내용= 게시물표.getString("contents");
//		    	찾은게시물 = new Board();	        	
//		    	찾은게시물.setNo(게시물번호);
//		    	찾은게시물.setTitle(제목);
//		    	찾은게시물.setContents(내용);
//		    }
//		    게시물표.close();
//		    con.close();
//		}
//		catch(Exception ex){ ex.printStackTrace(); }
//		return 찾은게시물;
//	}
//	
//	void 삭제하다(int 게시물번호) {
//		Connection con = null;		 
//		try{
//		    Class.forName("com.mysql.cj.jdbc.Driver");
//		    con=DriverManager.getConnection(DBConfig.DBURL, DBConfig.ID, DBConfig.PASSWORD);        
//		    PreparedStatement 명령자=con.prepareStatement("delete from board where no=?");
//		    명령자.setInt(1, 게시물번호);        
//		    명령자.executeUpdate();
//		    con.close();
//		}
//		catch(Exception ex){ ex.printStackTrace(); }
//	}
//	  	
//	void 변경하다(Board 수정할게시물) {
//		Connection con = null;		 
//		try{
//		    Class.forName("com.mysql.cj.jdbc.Driver");
//		    con=DriverManager.getConnection(DBConfig.DBURL, DBConfig.ID, DBConfig.PASSWORD);        
//		    PreparedStatement 명령자=con.prepareStatement("update board set title=?, contents=? where no=?");
//		    명령자.setString(1, 수정할게시물.getTitle());
//		    명령자.setString(2, 수정할게시물.getContents());        
//		    명령자.executeUpdate();
//		    con.close();
//		}
//		catch(Exception ex){ ex.printStackTrace(); }
//	}
//}
//@Repository
//class 게시물DAO {
//	//게시물Mapper 한게시물Mapper=new 게시물Mapper();
//	@Autowired 게시물Mapper 한게시물Mapper;
//	public void 저장하다(Board 새게시물) {
//		한게시물Mapper.저장하다(새게시물);
//	}
//
//	public ArrayList<Board> 모두수집하다() {		
//		return 한게시물Mapper.모두수집하다();
//	}
//
//	public Board 찾다By번호(int 게시물번호) {
//		return 한게시물Mapper.찾다By번호(게시물번호);
//	}
//
//	public void 삭제하다(int 게시물번호) {
//		한게시물Mapper.삭제하다(게시물번호);		
//	}
//
//	public void 변경하다(Board 수정할게시물) {
//		한게시물Mapper.변경하다(수정할게시물);	
//	}	
//}
//
//@Service
//class 게시물업무자 {
//    //게시물DAO 한게시물DAO = new 게시물DAO();
//    @Autowired 게시물DAO 한게시물DAO;
//	public void 등록하다(Board 새게시물) {
//		한게시물DAO.저장하다(새게시물);
//	}
//
//	public ArrayList<Board> 모두수집하다() {
//		return 한게시물DAO.모두수집하다();
//	}
//
//	public Board 찾다By번호(int 게시물번호) {
//		return 한게시물DAO.찾다By번호(게시물번호);
//	}
//
//	public void 삭제하다(int 게시물번호) {
//		한게시물DAO.삭제하다(게시물번호);
//	}
//
//
//	public void 변경하다(Board 수정할게시물) {
//		한게시물DAO.변경하다(수정할게시물);
//	}
//}
//
//@Controller
//public class Board컨트롤러 {
//		//게시물업무자 한게시물업무자=new 게시물업무자();
//		@Autowired 게시물업무자 한게시물업무자;
//		
//		@GetMapping("/board")
//		public String 게시물을등록준비하다() {
//			return "board/게시물등록창";					
//		}
//		
//		@PostMapping("/board")
//		public String 게시물을을등록하다(Board 새게시물) {
//			한게시물업무자.등록하다(새게시물);
//			return "board/게시물등록알림창";					
//		}
//		
//		@GetMapping("/boards")
//		public ModelAndView 게시물목록을출력하다( ) {
//			ArrayList<Board> 수집된게시물들= 한게시물업무자.모두수집하다( );
//			ModelAndView mv=new ModelAndView();
//			mv.setViewName("board/게시물목록창");
//			mv.addObject("boards", 수집된게시물들);			
//			return mv;					
//		}
//		
//		@GetMapping("/board/{게시물번호}")
//		public ModelAndView 게시물상세를출력하다(@PathVariable int 게시물번호) {
//			Board 수집된게시물= 한게시물업무자.찾다By번호(게시물번호);
//			ModelAndView mv=new ModelAndView();
//			mv.setViewName("board/게시물상세창");
//			mv.addObject("board", 수집된게시물);			
//			return mv;								
//		}
//}
