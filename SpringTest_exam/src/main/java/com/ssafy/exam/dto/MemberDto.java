package com.ssafy.exam.dto;

public class MemberDto {
	private String id;
	private String name;
	private String password;
    private String joinDate;
    
	public MemberDto() {
		super();
	}
	public MemberDto(String id, String name, String password, String joinDate) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.joinDate = joinDate;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(String join_dDate) {
		this.joinDate = joinDate;
	}
	@Override
	public String toString() {
		return "MemberDto [id=" + id + ", name=" + name + ", password=" + password + ", joinDate=" + joinDate + "]";
	}
}
