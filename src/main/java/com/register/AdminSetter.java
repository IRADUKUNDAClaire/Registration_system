package com.register;

public class AdminSetter {
	String fullname, email,password;

	public AdminSetter() {
		super();
	}

	public AdminSetter(String fullname,String email, String password) {
		super();
		this.fullname= fullname;
		this.email = email;
		this.password = password;
	}

	public String getFullName() {
		return fullname;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
