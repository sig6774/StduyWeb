<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.stone.springmvc.board.common.*" %>
<% Board board= (Board) request.getAttribute("board"); %>
<!-- controller에서 mapping된 board를 여기서 사용할 수 있도록 board로 지정 -->
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
<button onclick="location.href='/listboard'">목록</button>
<button onclick="location.href='/main'">메인</button>
<!-- board로 저장된 값의 제목, 내용을 출력 -->
</body>
</html>