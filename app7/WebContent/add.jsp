<%@ taglib prefix="tags" uri="/WEB-INF/custom.tld"%>
<%-- <tags:add param1="20" param2="34"/><br> --%>
<%-- <tags:add param1="20" /><br> --%>
<%
int i=90;
%>
<tags:add param1="<%=i %>"></tags:add>