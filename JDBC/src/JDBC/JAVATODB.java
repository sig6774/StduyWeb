package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class JAVATODB {
	
	static void 저장하다(String 제목, String 내용) {
		try {
			// 드라이버 로드 
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// DBMS와 연결
			Connection 연결자 = 
					DriverManager.getConnection("jdbc:mysql://localhost:3306/db100", "root", "1234");	
			System.out.println("연결 성공");
			PreparedStatement 명령자 = 연결자.prepareStatement("insert into board(title,contents)  values(?,?)");
			// 값이 들어갈 자리(values)는 ?로 표시 
			// 자바코드로 DB에 연결하여 값을 입력해주는 코드
			
			명령자.setString(1, 제목);
			명령자.setString(2, 내용);
			명령자.executeUpdate();
			// DB에 저장될 값을 입력해주고 그것을 Update 해줌
			// 실제 mysql Workbench에서 확인해보면 값들이 들어온 것을 확인할 수 있음 
				
			// DBMS와 연결 끊기 
			연결자.close();

		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
			// 화면에 error 메시지 출력해라라는 뜻 
		}
		  catch (SQLException e2) {
			e2.printStackTrace();
		  }
	}
	
	
	// DB에 연결해서 값을 저장하는 메소드 
	// DB에 연결할 수 있는 libarary를 가지고 DB에 연결하여 값을 DB에 저장해주는 것
	// 만약 예외가 발생했을때의 상황도 생각해서 try catch를 사용 
	
	static void 목록을출력하다() {
		try {
			// 드라이버 로드 
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// DBMS와 연결
			Connection 연결자 = 
					DriverManager.getConnection("jdbc:mysql://localhost:3306/db100", "root", "1234");	
			System.out.println("연결 성공");
			PreparedStatement 명령자 = 연결자.prepareStatement("select * from board"); 
			// 자바코드로 DB에 연결하여 값을 입력해주는 코드
			// DB에 저장된 모든 행을 가져오기 위해 사용 
			ResultSet 게시물표관리자 = 명령자.executeQuery(); // DBMS에 prepareStatement안에 있는 명령 수행 
			// select를 수행하기 위해 사용 
			// select 값을 게시물표관리자에 저장 
			
			while (게시물표관리자.next()) { // 다음행으로 전환하고 다음행이 없으면 종료되는 메소드
				// 게시물표관리자에 존재하는 현재 행의 열 값들 읽기 
				int 게시물번호 = 게시물표관리자.getInt("no");
				// no라는 이름의 열의 값을 가져와서 int 게시물번호로 저장 
				String 게시물제목 = 게시물표관리자.getString("title");
				String 게시물내용 = 게시물표관리자.getString("contents");
				// 게시물제목과 내용이라는 값을 가져와서 String형식으로 저장 
				
				String 출력할내용 = String.format("%d, %s, %s", 게시물번호, 게시물제목, 게시물내용);
				System.out.println(출력할내용);
			}
			게시물표관리자.close();
			연결자.close();
			// DBMS와 연결 끊기 

		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
			// 화면에 error 메시지 출력해라라는 뜻 
		}
		  catch (SQLException e2) {
			e2.printStackTrace();
		  }
	}
	public static void main(String[] args) {
		
		저장하다("title2", "contents2");
		// 저장이 잘되고 있는 것을 볼 수 있음
		
		for (int i = 0; i< 100; i++) {
			저장하다("title" + i, "contents" + i);
		}
		목록을출력하다();
		// 출력이 잘되고 있는 것을 볼 수 있음 
	}
}
/*
JDBC 관련 핵심 클래스 
- 연결과 관련된 Connection 
- 명령과 관련된 Statement / PreparedStatement 
- 질의결과 ResultSet 
*/
