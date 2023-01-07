package com.pack1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet4 extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException
	{
		HashMap<String, String> map=new HashMap<String, String>();
		map.put("abc", "123");
		map.put("xyv", "456");
		map.put("ddd", "aaa");
		map.put("rrr", "hhh");
		map.put("aaa", "fff");
		request.setAttribute("msg", map);
		RequestDispatcher rd = request.getRequestDispatcher("fromServlet4.jsp");
		rd.forward(request, response);
	}

}
