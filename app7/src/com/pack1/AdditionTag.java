package com.pack1;

import java.io.IOException;
import java.util.Date;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.Tag;

public class AdditionTag implements Tag
{
	private PageContext pc = null;
	private int param1 ;
	private int param2 ;

	@Override
	public void setPageContext(PageContext arg0)
	{
		System.out.println("setpagecontext");
		pc=arg0;
	}
	public void setParam1(int param1)
	{
		System.out.println("setparam1");
		this.param1 = param1;
	}
	public void setParam2(int param2)
	{
		System.out.println("setparam2");
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
		int sum;
		try
		{
			out.println("The Parameter1 value is: "+param1+"<br>");
			out.println("The Parameter2 value is: "+param2+"<br>");
			sum=param1+param2;
          out.println("the sum of param1 and parm2 is:"+sum);
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
