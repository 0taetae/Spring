package com.edu.customer.model;

public class Customer {
	private String id; // 고객 아이디
	private String password; // 고객 비밀번호
	private String name; // 고객 이름

	public Customer() {
		super();
	}

	public Customer(String id, String password, String name) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
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

}
