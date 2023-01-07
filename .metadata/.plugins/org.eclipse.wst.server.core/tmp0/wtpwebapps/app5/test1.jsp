<%@page import="com.pack1.Hello"%>
<%
	Hello h1 = new Hello();
	String s1 = h1.sayHello();
	out.println(s1);
	out.println("<br>");
%>
<%=h1.sayHello()%>