<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="p1.게시물저장소" %>    
<%@ page import="p1.게시물" %> 
<%    
         게시물저장소   한저장소=new 게시물저장소();      
         게시물[]   모든게시물들 = 한저장소.모든게시물을수집하다();         
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>게시물 목록</h1>
<% for(int 회=0; 회<모든게시물들.length ; 회++ ){ %>
       <%= 회+1 %> <a href="detail.jsp?no=<%= 모든게시물들[회].번호 %>" ><%= 모든게시물들[회].제목 %></a> <br> 
<% } %>
</body>
</html>