<%@page import="com.pack1.Person"%>

<jsp:useBean id="p1" class="com.pack1.Person" scope="session" />
<%
	p1.setFname("abc");
	p1.setLname("xyz");
	p1.setAge(23);
	p1.setWeight(45.78);

	out.println(p1.getFname() + "<br>");
	out.println(p1.getLname() + "<br>");
	out.println(p1.getAge() + "<br>");
	out.println(p1.getWeight() + "<br>");
%>
