package com.pack1;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.TagSupport;

public class MyTag extends TagSupport
{
private PageContext pc=null;
@Override
	public void setPageContext(PageContext pageContext)
	{
		System.out.println("setpagecontext");
		pc=pageContext;
	}
@Override
	public int doStartTag() throws JspException
	{
		System.out.println("dostaerttag");
		JspWriter out=pc.getOut();
		try
		{
			System.out.println("hello");
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return SKIP_BODY;
	}
}
