<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="����.Board"%>
<!-- import �ϴ¹�  -->
    <%
    	Board ���Խù� = (Board) request.getAttribute("v1");
    // controller���� v1���� �޾ƿ� 
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>�Խù���ü�޾ƿ�</title>
</head>
<body>
����<%=���Խù�.getTitle() %><br>
����<textarea cols = 10 rows = 5 readonly><%=���Խù�.getContents() %></textarea>
<!-- ������ textarea�ȿ� Ʋ�� ������ְ� �׾ȿ� �ڹ��ڵ带 �־��� -->

</body>
</html>