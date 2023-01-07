<body bgcolor="pink">
<%
String s1=request.getParameter("fname");
if(s1==null)
{
s1="";
}
%>
<%
String s2=request.getParameter("lname");
if(s2==null)
{
s2="";
}
%>
<%
String s3=request.getParameter("age");
if(s3==null)
{
s3="";
}
%>
<%
String s4=request.getParameter("username");
if(s4==null)
{
s4="";
}
%>
<%
String errorstatus=(String)request.getAttribute("status");
if(errorstatus==null)
{
	errorstatus="";
}
%>
<link rel="stylesheet" type="text/css" href="style.css"/>
<font class="errorFont">
<%=errorstatus %>
</font>
<script src="regvalidate.js"></script>
<form action="RegServlet" method="get">
	
	<font class="fieldFont">
	FirstName:
	</font>
	<input type="text" name="fname" value="<%=s1%>"><br>
	<font class="fieldFont">
	LastName:
	</font>
	<input type="text" name="lname" value="<%=s2%>"><br>
	<font class="fieldFont">
	Age:
	</font>
	<input type="text" name="age" value="<%=s3%>"><br>
	<font class="fieldFont">
	Username:
	</font>
	<input type="text" name="username" value="<%=s4%>"><br>
	
	<font class="fieldFont">
	Password:
	</font>
	<input type="password" name="password" ><br>
	
	<font class="fieldFont">
	
	email:
	</font>
	<input type="text" name="email" ><br>
	<input type="submit" value="Registration" onclick="return validateRegistration()"><br>
</form>
</body>