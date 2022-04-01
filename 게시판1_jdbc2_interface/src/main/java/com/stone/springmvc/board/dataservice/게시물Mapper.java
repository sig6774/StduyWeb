package com.stone.springmvc.board.dataservice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import org.springframework.stereotype.Component;

import com.stone.springmvc.board.common.Board;

import config.DBConfig;

@Component
// @Service, Repository, Component에서 Spring이 하는 역할은 모두 객체를 만들고 있어라 라는 뜻  
public class 게시물Mapper implements I게시물Mapper {
	
	@Override
	public void 저장하다(Board 새게시물) {
		Connection con = null;		 
		try{
		    Class.forName("com.mysql.cj.jdbc.Driver");
		    con=DriverManager.getConnection(DBConfig.DBURL, DBConfig.ID, DBConfig.PASSWORD);        
		    PreparedStatement 명령자=con.prepareStatement("insert into board(title,contents) values(?,?)");
		    명령자.setString(1, 새게시물.getTitle());
		    명령자.setString(2, 새게시물.getContents());        
		    명령자.executeUpdate();
		    con.close();
		}
		catch(Exception ex){ ex.printStackTrace(); }
	}
	
	@Override
	public ArrayList<Board> 모두수집하다(){
		ArrayList<Board> 수집된게시물들=new ArrayList<Board>();
		Connection con = null;		 
		try{
		    Class.forName("com.mysql.cj.jdbc.Driver");
		    con=DriverManager.getConnection(DBConfig.DBURL, DBConfig.ID, DBConfig.PASSWORD);
		    PreparedStatement 명령자=con.prepareStatement("select * from board");
		    ResultSet 게시물표= 명령자.executeQuery();
		    while(게시물표.next()) {
		    	
		    	int 게시물번호 =게시물표.getInt("no");
		    	String 제목= 게시물표.getString("title");
		    	String 내용= 게시물표.getString("contents");
		    	Board 한게시물 = new Board();	        	
		    	한게시물.setNo(게시물번호);
		    	한게시물.setTitle(제목);
		    	한게시물.setContents(내용);
		    	
		    	수집된게시물들.add(한게시물);
		    }
		    게시물표.close();
		    con.close();
		}
		catch(Exception ex){ ex.printStackTrace(); }
		return 수집된게시물들;
	}
	
	@Override
	public Board 찾다By번호( int 게시물번호) {
		Board 찾은게시물 = null;
		Connection con = null;		 
		try{
		    Class.forName("com.mysql.cj.jdbc.Driver");
		    con=DriverManager.getConnection(DBConfig.DBURL, DBConfig.ID, DBConfig.PASSWORD);
		    PreparedStatement 명령자=con.prepareStatement("select title,contents from board where no=?");
		    명령자.setInt(1, 게시물번호);
		    ResultSet 게시물표= 명령자.executeQuery();
		    if(게시물표.next()) {		    	
		    	String 제목= 게시물표.getString("title");
		    	String 내용= 게시물표.getString("contents");
		    	찾은게시물 = new Board();	        	
		    	찾은게시물.setNo(게시물번호);
		    	찾은게시물.setTitle(제목);
		    	찾은게시물.setContents(내용);
		    }
		    게시물표.close();
		    con.close();
		}
		catch(Exception ex){ ex.printStackTrace(); }
		return 찾은게시물;
	}
	
	@Override
	public void 삭제하다(int 게시물번호) {
		Connection con = null;		 
		try{
		    Class.forName("com.mysql.cj.jdbc.Driver");
		    con=DriverManager.getConnection(DBConfig.DBURL, DBConfig.ID, DBConfig.PASSWORD);        
		    PreparedStatement 명령자=con.prepareStatement("delete from board where no=?");
		    명령자.setInt(1, 게시물번호);        
		    명령자.executeUpdate();
		    con.close();
		}
		catch(Exception ex){ ex.printStackTrace(); }
	}
	  	
	@Override
	public void 변경하다(Board 수정할게시물) {
		Connection con = null;		 
		try{
		    Class.forName("com.mysql.cj.jdbc.Driver");
		    con=DriverManager.getConnection(DBConfig.DBURL, DBConfig.ID, DBConfig.PASSWORD);        
		    PreparedStatement 명령자=con.prepareStatement("update board set title=?, contents=? where no=?");
		    명령자.setString(1, 수정할게시물.getTitle());
		    명령자.setString(2, 수정할게시물.getContents());        
		    명령자.executeUpdate();
		    con.close();
		}
		catch(Exception ex){ ex.printStackTrace(); }
	}
}