<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.stone.springmvc.board.common.Board" %>
<% ArrayList<Board> boards= (ArrayList<Board>) request.getAttribute("boards"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 게시물목록출력 -->
<h1>게시물 목록</h1>
<ul>
<% for(int 일련번호=0;일련번호<boards.size();일련번호++){ 
	Board 게시물 =boards.get(일련번호);//zero base
%>
    <li><%=일련번호+1 %>  
        <a href="/viewboard?no=<%= 게시물.getNo() %>"><%= 게시물.getTitle() %></a>
        <!--예)   /viewvoard?no=1  -->
    </li>
<%} %>
</ul>
<br><button onclick="location.href='/main'">메인</button>
</body>
</html>