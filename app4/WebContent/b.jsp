<jsp:useBean id="p1" class="com.Person" >
	<%!
		int i=90;
	%>
	<jsp:setProperty name="p1" property="id" value="<%=i %>" />
	<jsp:setProperty name="p1" property="name" value="abc" />
	 
	<p>Got message....</p>
	 
	<jsp:getProperty name="p1" property="id" />
	<jsp:getProperty name="p1" property="name" />
</jsp:useBean>