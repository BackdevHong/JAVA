<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP Script Example</title>
</head>
<body>
	<h1>Script Example</h1>
	<%! 
		String declaration = "선언";
	%>
	<%!
		public String decMethod(){
			return declaration;
		}
	%>
	<%
		String scriptlet = "Scriptlet";
		String comment = "Comment";
		
		out.println("내장 객체를 이용한 출력 : " + declaration + "<br>");
	%>
	
	선언문의 출력 : <%=declaration%><br>
	선언문의 출력2 : <%=decMethod() %><br>
	스크립틀릿의 출력 : <%=scriptlet %><br>
	
	<!-- jSP 주석부분 -->
	<!-- JSP주석 1 : <%=comment%> --><br>
	<%-- JSP주석 2 ㅣ <%=comment%> --%>
	<%
		/* 주석
		( 여러줄 주석 )
		*/
	%>
	<% // 주석 ( 한줄 주석 )%>
</body>
</html>