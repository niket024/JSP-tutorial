package com.pack1;

import java.io.IOException;
import java.util.Date;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.Tag;

public class ParamTag implements Tag
{
	private PageContext pc = null;
	private String param1 = null;
	private String param2 = null;

	@Override
	public void setPageContext(PageContext arg0)
	{
		System.out.println("setpagecontext");
		pc=arg0;
	}
	public void setParam1(String param1)
	{
		System.out.println("setparam1");
		this.param1 = param1;
	}
	public void setParam2(String param2)
	{
		this.param2 = param2;
	}

	@Override
	public void setParent(Tag arg0)
	{
		System.out.println("setparent");

	}

	@Override
	public Tag getParent()
	{
		System.out.println("getpagecontext");
		return null;

	}

	@Override
	public int doStartTag() throws JspException
	{
		System.out.println("dostarttag");
		JspWriter out = pc.getOut();
		Date date=new Date();
		try
		{
			out.println("The Parameter1 value is: "+param1+"<br>");
			out.println("The Parameter2 value is: "+param2);
		} catch (IOException ex)
		{
			ex.printStackTrace();
		}
		return EVAL_BODY_INCLUDE;
	}
	@Override
	public int doEndTag() throws JspException
	{
		System.out.println("doend tag");
		return SKIP_BODY;

	}
	@Override
	public void release()
	{
		System.out.println("release");
		
	}
}
