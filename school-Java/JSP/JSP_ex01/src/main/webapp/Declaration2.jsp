<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%!
	int one;
	int two = 1;
	public int plusMethod(){
		return one + two;
	}
	String msg;
	int three;
%>
one + two = <%=plusMethod() %><br>
String MSG = <%=msg %><br>
Int Three = <%=three %>

</body>
</html>