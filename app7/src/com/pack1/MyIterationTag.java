package com.pack1;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.IterationTag;
import javax.servlet.jsp.tagext.Tag;

public class MyIterationTag implements IterationTag
{
	private PageContext pc = null;
	private int index = 10;

	@Override
	public void setPageContext(PageContext arg0)
	{
		System.out.println("setpagecontex");
		pc = arg0;

	}

	@Override
	public void setParent(Tag arg0)
	{
		System.out.println("setparent");

	}

	public void setIndex(int index)
	{
		System.out.println("setindex");
		this.index = index;
	}

	@Override
	public Tag getParent()
	{
		System.out.println("getparent");

		return null;
	}

	@Override
	public int doStartTag() throws JspException
	{
		System.out.println("dostarttag");
		return EVAL_BODY_INCLUDE;
	}

	@Override
	public int doAfterBody() throws JspException
	{
		JspWriter out = pc.getOut();
		try
		{
			if (index > 0)
			{
				System.out.println("doaftertag");
				index--;
				out.println("doaftertag</br>");
				return EVAL_BODY_AGAIN;
			}
		} catch (Exception ex)
		{
			ex.printStackTrace();
		}
		return SKIP_BODY;

	}

	@Override
	public int doEndTag() throws JspException
	{
		System.out.println("doendtag");
		return EVAL_PAGE;
	}

	@Override
	public void release()
	{
		System.out.println("release");
	}
}
