<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h1>게시물변경</h1>

<form action="/alterboard" method="post">
번호<input type="text" name="no"><br> 
제목<input type="text" name="title"><br>
내용<textarea cols="25" rows="5" name="contents"></textarea><br>
 <input type="submit" value="변경" />
</form>
<br>
<button onclick="location.href='/main'">취소</button>


</body>
</html>