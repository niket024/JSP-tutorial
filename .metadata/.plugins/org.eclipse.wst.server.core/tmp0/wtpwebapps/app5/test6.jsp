<%@page import="com.pack1.Person"%>
<%
Person p1=(Person)session.getAttribute("p1");

out.println(p1.getFname()+"<br>");
out.println(p1.getLname()+"<br>");
out.println(p1.getAge()+"<br>");
out.println(p1.getWeight()+"<br>");
%>
