function validateRegistration()
{
	var f1=document.forms[0];
	var fn=f1.fname;
	if(fn.value.length==0)
		{
		alert("pls enter the fname");
		fn.focus();
		return false;
		}
	var ln=f1.lname;
	if(ln.value.length==0)
	{
		alert("pls enter the lname");
		ln.focus();
		return false;
	}
	var age=f1.age;
	if(age.value.length==0)
	{
		alert("pls enter the age");
		age.focus();
		return false;
	}
	var un=f1.username;
	if(un.value.length==0)
	{
		alert("pls enter the username");
		un.focus();
		return false;
	}
	var pw=f1.password;
	if(pw.value.length==0)
	{
		alert("pls enter the password");
		pw.focus();
		return false;
	}
	var em=f1.email;
	if(em.value.length==0)
	{
		alert("pls enter the email");
		em.focus();
		return false;
	}
	return true;
}