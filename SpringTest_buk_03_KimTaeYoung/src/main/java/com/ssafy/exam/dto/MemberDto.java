package com.ssafy.exam.dto;

public class MemberDto {
	private String id;
	private String password;
	private String name;
	private String email;
	private String role;

	public MemberDto() {
		super();
	}

	public MemberDto(String id, String password, String name, String email, String role) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
		this.email = email;
		this.role = role;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "MemberDto [id=" + id + ", password=" + password + ", name=" + name + ", email=" + email + ", role="
				+ role + "]";
	}
	
	

}
