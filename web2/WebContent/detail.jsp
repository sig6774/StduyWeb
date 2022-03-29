<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="p1.게시물저장소" %>    
<%@ page import="p1.게시물" %> 
<% 
     int 게시물번호 = Integer.valueOf( request.getParameter("no") );

          게시물저장소   한저장소=new 게시물저장소();      
          게시물        찾은게시물 = 한저장소.게시물을찾다(게시물번호);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>게시물 상세</h1>
제목:<%= 찾은게시물.제목 %><br>
내용 <textarea cols=20 rows=10 readonly><%= 찾은게시물.내용 %></textarea><br>
<button onclick="location.href='list.jsp'">목록</button>
</body>
</html>