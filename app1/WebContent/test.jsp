<body bgcolor="pink"></body>
<%@ page import="java.util.Date"%>
<%!
int i=10;
%>

<%
Date date=new Date();
int j=90;
out.println(j);
%>
Today date is:<%= date %><br>
I value is:<%=i %><br>
J value is:<%=j %>
