<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="공통.Board"%>
<!-- import 하는법  -->
    <%
    	Board 새게시물 = (Board) request.getAttribute("v1");
    // controller에서 v1값을 받아옴 
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>게시물객체받아옴</title>
</head>
<body>
제목<%=새게시물.getTitle() %><br>
내용<textarea cols = 10 rows = 5 readonly><%=새게시물.getContents() %></textarea>
<!-- 내용은 textarea안에 틀을 만들어주고 그안에 자바코드를 넣어줌 -->

</body>
</html>