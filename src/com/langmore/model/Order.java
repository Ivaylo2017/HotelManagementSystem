package com.langmore.model;

import java.util.Date;

public class Order {

	private int orderId;

	private Date dateCreated;
	
	private User user;
	
	private String status;
	
	private Date dateOfLastChange;
	
	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getDateOfLastChange() {
		return dateOfLastChange;
	}

	public void setDateOfLastChange(Date dateOfLastChange) {
		this.dateOfLastChange = dateOfLastChange;
	}

	public int getReviewedBy() {
		return reviewedBy;
	}

	public void setReviewedBy(int reviewedBy) {
		this.reviewedBy = reviewedBy;
	}

	public int getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(int createdBy) {
		this.createdBy = createdBy;
	}

	private int reviewedBy;

	private int createdBy;
}
