<%
//pageContext.setAttribute("msg","from pc");
//request.setAttribute("msg","from request");
//session.setAttribute("msg","from session");
application.setAttribute("msg","from application");
%>
<%-- <%=pageContext.getAttribute("msg") %>
<%=request.getAttribute("msg") %> --%>
${msg}
${msg}
${msg}


