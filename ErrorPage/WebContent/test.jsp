
<%
	try
	{
		int i = 10 / 0;
	} catch (Exception ex)
	{
		ex.printStackTrace();
	}
	out.println("hello");
%>