package com.pack1;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet3 extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException
	{
		ArrayList<String> list=new ArrayList<String>();
		list.add("abc");
		list.add("xxx");
		list.add("123");
		list.add("rrrr");
		list.add("gggg");
		request.setAttribute("msg", list);
		RequestDispatcher rd = request.getRequestDispatcher("fromServlet3.jsp");
		rd.forward(request, response);
	}

}
