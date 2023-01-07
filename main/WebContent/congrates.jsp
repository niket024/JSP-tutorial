<%@ page import="g.*"%>
<body bgcolor="#ff00ff">
<A href="index.html"><IMG SRC="images/home1.gif"></IMG></A>	<br>
<font color="yellow" style="verdana">
CONGRATULATION! <br>
WELCOME TO APNA BANK..<br>
YOUR ACCOUNT HAS BEEN OPENED SUCCESSFULLY.....
<br>
</font>
<font color="blue">
		<% 
		int	account=(Integer)request.getAttribute("accno");
		out.println("YOUR ACCOUNT NO IS:"+account);
		request.setAttribute("accno",null);
		%>
</font>
<center> <image src="images/Tulips.jpg" height="250" width="250"/></center>
</body>
