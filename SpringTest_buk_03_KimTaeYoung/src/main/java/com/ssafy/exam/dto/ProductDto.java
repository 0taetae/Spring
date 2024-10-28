package com.ssafy.exam.dto;

public class ProductDto {

	private int reservationId;
	private String userId;
	private int resourceId;
	private String startDate;
	private String endDate;

	public ProductDto() {
		super();
	}

	public ProductDto(int reservationId, String userId, int resourceId, String startDate, String endDate) {
		super();
		this.reservationId = reservationId;
		this.userId = userId;
		this.resourceId = resourceId;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public int getReservationId() {
		return reservationId;
	}

	public void setReservationId(int reservationId) {
		this.reservationId = reservationId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public int getResourceId() {
		return resourceId;
	}

	public void setResourceId(int resourceId) {
		this.resourceId = resourceId;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	@Override
	public String toString() {
		return "ProductDto [reservationId=" + reservationId + ", userId=" + userId + ", resourceId=" + resourceId
				+ ", startDate=" + startDate + ", endDate=" + endDate + "]";
	}

	
	
	

}
