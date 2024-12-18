package com.ssafy.exam.dto;

public class ProductDto {
	private String code;
	private String model;
	private int price;
	private String id;
	private String registDate;
	private String detail;
	
	public ProductDto() {
		super();
	}
	public ProductDto(String code, String model, int price, String id, String registDate, String detail) {
		super();
		this.code = code;
		this.model = model;
		this.price = price;
		this.id = id;
		this.registDate = registDate;
		this.detail = detail;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getRegistDate() {
		return registDate;
	}
	public void setRegist_date(String registDate) {
		this.registDate = registDate;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	@Override
	public String toString() {
		return "ProductDto [code=" + code + ", model=" + model + ", price=" + price + ", id=" + id + ", registDate="
				+ registDate + ", detail=" + detail + "]";
	}
}
