<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Expression Example</title>
</head>
<body>
<h1>표현식 예제</h1>
<%
	float f = 2.3f;
	int i = Math.round(f);
	Date date = new Date();
%>
실수 f 반올림 = <%=i %> <br />
실수 f = <%=f %> <br />
현재 날짜 & 시간 = <%=date %> <br />
</body>
</html>