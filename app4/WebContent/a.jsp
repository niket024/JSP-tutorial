<html>
<head>
<title>Using JavaBeans in JSP</title>
</head>
<body>
	<center>
		<%@ page import="com.Person"%>
		<%
			Person p1 = new Person();
			p1.setId(123);
			p1.setName("abc");
			out.println("Id=" + p1.getId() + "<br>");
		%>
		<%="Name=" + p1.getName()%>
	</center>
</body>
</html>