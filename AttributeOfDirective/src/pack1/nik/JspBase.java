package pack1.nik;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class JspBase extends HttpServlet
{
   public void doSomething()
   {
	   System.out.println("do something");
   }
}
