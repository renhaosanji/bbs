package com.limho.bbsProject.VO;

import java.util.Date;

public class MemberVO {
	private String id;
	private String email;
	private String password;
	private String name;
	private Date registerDate;

	public MemberVO(String id, String email, String password, String name, Date registerDate) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
		this.name = name;
		this.registerDate = registerDate;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getRegisterDate() {
		return registerDate;
	}

	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
	}

	@Override
	public String toString() {
		return "MemberVO [id=" + id + ", email=" + email + ", password=" + password + ", name=" + name
				+ ", registerDate=" + registerDate + "]";
	}

}
