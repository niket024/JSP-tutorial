package com.pack1;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.BodyContent;
import javax.servlet.jsp.tagext.BodyTag;
import javax.servlet.jsp.tagext.Tag;

public class BodyTagHandler implements BodyTag
{
	private PageContext pc = null;
	private BodyContent bc = null;

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

	@Override
	public void setBodyContent(BodyContent arg0)
	{
		System.out.println("setBodyContent");
       bc=arg0;
	}

	@Override
	public Tag getParent()
	{
		System.out.println("getParent");
		return null;
	}
	@Override
	public int doStartTag() throws JspException
	{
		System.out.println("doStartTag");
		return EVAL_BODY_INCLUDE;
	}
	@Override
	public void doInitBody() throws JspException
	{
		System.out.println("doInitBody");
		
	}
	public int doAfterBody() throws JspException
	{
		System.out.println("doAfterBody");
		JspWriter out = pc.getOut();
		String str=bc.getString();
		
		str=new StringBuffer(str).reverse().toString();
		try
		{
		out.println("??");	
		out.println("Reverse of the body content is:"+str+"</br>");
				
		}
		 catch (IOException ex)
		{
			ex.printStackTrace();
		}
		return SKIP_BODY;
	}
		@Override
		public int doEndTag() throws JspException
		{
			System.out.println("doendtag");
			return SKIP_PAGE;
		}

		@Override
		public void release()
		{
			System.out.println("release");
		}
	
}
