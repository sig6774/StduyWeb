<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h1>�Խù�����</h1>

<form action="/alterboard" method="post">
��ȣ<input type="text" name="no"><br> 
����<input type="text" name="title"><br>
����<textarea cols="25" rows="5" name="contents"></textarea><br>
 <input type="submit" value="����" />
</form>
<br>
<button onclick="location.href='/main'">���</button>


</body>
</html>