${msg}</br>

<%=request.getAttribute("msg")%></br> 

 <%
 String str=(String)request.getAttribute("msg");
 out.println(str);
 %> 