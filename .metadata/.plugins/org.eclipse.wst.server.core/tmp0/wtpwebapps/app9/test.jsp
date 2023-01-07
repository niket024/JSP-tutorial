<%
int x[]=(int [])request.getAttribute("msg");
for(int i:x)
{
	out.println(i);
}
%>