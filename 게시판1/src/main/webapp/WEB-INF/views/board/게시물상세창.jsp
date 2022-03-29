<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.stone.springmvc.board.common.*" %>
<% Board board= (Board) request.getAttribute("board"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>게시물 상세</h1>


 제목<%=board.getTitle()%> <br>
 내용<textarea cols="25" rows="5" name="contents" readonly><%= board.getContents()%></textarea><br>
작성일<%= board.getWdate().toString() %><br>
<button onclick="location.href='/boards'">목록</button>
<button onclick="location.href='/main'">메인</button>
</body>
</html>