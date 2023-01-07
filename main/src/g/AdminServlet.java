package g;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AdminServlet extends HttpServlet
{

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException
	{
		boolean status=false;
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		try
		{
		 //status= verifyLogin1.admincheck(username, password);
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
      if(true){
			
			RequestDispatcher rd=request.getRequestDispatcher("admin.jsp");
			rd.include(request, response);
		}
		else{
			
			RequestDispatcher rd=request.getRequestDispatcher("sorry.jsp");
			rd.include(request, response);
		}
	}

}
