<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

<%
	int 회 = 1;
	while(회<=10){
		// 할일
%>
		줄넘기<br>
<% // 자바코드를 이렇게 자를 수 있음 
		// 회수세기
		회 = 회+1;
	}

%>
</body>
</html>