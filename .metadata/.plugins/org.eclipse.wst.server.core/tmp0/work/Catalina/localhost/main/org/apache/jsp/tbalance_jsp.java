/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.29
 * Generated at: 2013-10-25 05:49:47 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class tbalance_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<html>\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\r\n");
      out.write("<title>Global Banking ..</title>\r\n");
      out.write("<link href=\"style.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("function ctck()\r\n");
      out.write("{\r\n");
      out.write("var sds = document.getElementById(\"dum\");\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<div id=\"top_links\">\r\n");
      out.write("  \r\n");
      out.write("\r\n");
      out.write("<div id=\"header\">\r\n");
      out.write("\t<h1>APANA - BANK<span class=\"style1\"></span></h1>\r\n");
      out.write("    <h2>ExtraOrdinary Service</h2>\r\n");
      out.write("    <A href=\"index.html\"><IMG SRC=\"images/home1.gif\"></IMG></A>\t\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div id=\"navigation\">\r\n");
      out.write("    <ul>\r\n");
      out.write("    <li><a href=\"create.html\">NEW ACCOUNT</a></li>\r\n");
      out.write("    <li><a href=\"balance1.jsp\">BALANCE</a></li>\r\n");
      out.write("    <li><a href=\"deposit1.jsp\">DEPOSIT</a></li>\r\n");
      out.write("    <li><a href=\"withdraw1.jsp\">WITHDRAW</a></li>\r\n");
      out.write("    <li><a href=\"transfer1.jsp\">TRANSFER</a></li>\r\n");
      out.write("    <li><a href=\"closeac1.jsp\">CLOSE A/C</a></li>\r\n");
      out.write("    <li><a href=\"about.jsp\">Contact Us</a></li>\r\n");
      out.write("    </ul>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<table style=\"width:897px; background:#FFFFFF; margin:0 auto;\">\r\n");
      out.write("<tr >\r\n");
      out.write("\t<td width=\"300\" valign=\"top\" style=\"border-right:#666666 1px dotted;\">\r\n");
      out.write("    \t<div id=\"services\"><h1>Services</h1><br>\r\n");
      out.write("\t\t    <ul>\r\n");
      out.write("        \t<li><a href=\"#\">www.javatpoint.com</a></li>\r\n");
      out.write("            <li><a href=\"#\">www.javacstpoint.com </a></li>\r\n");
      out.write("            <li><a href=\"#\">www.javatpoint.com/forum.jsp</a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("\t\t\t\r\n");
      out.write("       </div>\r\n");
      out.write("\t</td>\r\n");
      out.write("    \r\n");
      out.write("    <td width=\"1200\" valign=\"top\">\r\n");
      out.write("    \t\r\n");
      out.write("    \t");
 

      out.write("\r\n");
      out.write("<table border=\"2\" align=\"center\" width=\"60%\" height=\"60%\" bgcolor=\"white\">\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td align=\"center\" valign=\"middle\" bgcolor=\"red\"><h4>Accounts Info</h4></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>\r\n");
      out.write("\t\t\t");

			{
			out.print("the target account balance is");
			out.print(request.getAttribute("target account A"));
			out.println("reduced balance is");
			out.print(request.getAttribute("account B"));
				}
			
			 
      out.write("\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    \t\t</table>");


      out.write("\r\n");
      out.write("    \t\r\n");
      out.write("    \t\r\n");
      out.write("\t\t </table>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
