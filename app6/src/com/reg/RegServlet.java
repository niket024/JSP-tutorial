package com.reg;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegServlet extends HttpServlet
{
	int status;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException
	{

		PrintWriter out = response.getWriter();
		String fn = request.getParameter("fname");
		String ln = request.getParameter("lname");
		String un = request.getParameter("username");
		String pw = request.getParameter("password");
		String age = request.getParameter("age");
		String em = request.getParameter("email");
		out.println("firstname:" + fn + "<br>");
		out.println("lastname:" + ln + "<br>");
		out.println("username:" + un + "<br>");
		out.println("lastname:" + pw + "<br>");
		out.println("age:" + age + "<br>");
		out.println("email:" + em + "<br>");
		String sql = "insert into reg values('" + fn + "','" + ln + "','"
				+ un + "','" + pw + "'," + age + ",'" + em + "')";
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException ex)
		{
			ex.printStackTrace();
		}

		Connection con = null;
		Statement stmt = null;

		try
		{
			con = DriverManager
					.getConnection("jdbc:oracle:thin:@localhost:1521:XE",
							"system", "great123");
			stmt = con.createStatement();

			status = stmt.executeUpdate(sql);
		} catch (SQLException ex)
		{
			ex.printStackTrace();
		} finally
		{

			try
			{
				if (stmt != null)
				{
					stmt.close();
					stmt = null;
				}
			} catch (SQLException ex)
			{
				ex.printStackTrace();
			}
			try
			{
				if (con != null)
				{
					con.close();
					con = null;
				}
			} catch (SQLException ex)
			{
				ex.printStackTrace();
			}

		}
		RequestDispatcher rd = null;
		if (status == 1)
		{
			rd = request.getRequestDispatcher("success.jsp");
		}
		else
		{
			request.setAttribute("status",
					"registration is failed due to some db error!pls check it properly");
			rd = request.getRequestDispatcher("reg.jsp");
		}
		rd.forward(request, response);

	}
}
