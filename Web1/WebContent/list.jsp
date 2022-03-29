<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<% // 주소지정 %>
<%@ page import ="p1.게시물"%>
<%@ page import ="p1.게시물저장소" %>
<% // p1이라는 폴더(패키지)안에 있는 게시물저장소의 주소를 지정  %> 

<%     
				게시물저장소 한저장소 = new 게시물저장소();
				게시물[] 모든게시물들 = 한저장소.모든게시물을수집하다();
				게시물 찾은게시물 = 한저장소.게시물을찾다(1);
%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>"윈도우로 처음 서버~"</title>
</head>
<body>
<h1>오호호 윈도우 서버 첫번째!</h1> 
번호 : <%= 찾은게시물.번호 %> <br> <%// <br>은 줄바꿈 %>
제목 : <%= 찾은게시물.제목 %> <br>
내용 : <%= 찾은게시물.내용 %> <br> 
<% for (int 회 =0; 회<모든게시물들.length; 회++) { %>
	<%= 회+1 %>  <%= 모든게시물들[회].제목 %>  <br>
<% } %>
</body>
</html>