package com.logincheck;

public class LoginCredential {
	private String uname,passwd;
	public boolean checkLogin()
	{
		if(uname.equals("NIIT")&&passwd.equals("123456"))
		return true;
		else 
			return false;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	
	}


