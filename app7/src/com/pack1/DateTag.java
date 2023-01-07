package com.pack1;

import java.io.IOException;
import java.util.Date;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.Tag;

public class DateTag implements Tag
{
	private PageContext pc = null;

	@Override
	public void setPageContext(PageContext arg0)
	{
		System.out.println("setpagecontext");
		pc=arg0;
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
			out.println("Today date is:"+date);
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
		return SKIP_PAGE;

	}
	@Override
	public void release()
	{
		System.out.println("release");
		
	}
}
