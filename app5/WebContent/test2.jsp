<jsp:useBean id="h1" class="com.pack1.Hello" />
<%
	String s1 = h1.sayHello();
	out.println(s1);
	out.println("<br>");
%>
<%=h1.sayHello()%>