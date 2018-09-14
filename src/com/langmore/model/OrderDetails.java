package com.langmore.model;

import java.util.Date;

public class OrderDetails {

	private int ordDetId;

	private Order order;

	private Inventory item;

	private int quantity;

	private Date serviceStart;

	private Date serviceEnd;

	private double grandTotal;

	public int getOrdDetId() {
		return ordDetId;
	}

	public void setOrdDetId(int ordDetId) {
		this.ordDetId = ordDetId;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public Inventory getItem() {
		return item;
	}

	public void setItem(Inventory item) {
		this.item = item;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Date getServiceStart() {
		return serviceStart;
	}

	public void setServiceStart(Date serviceStart) {
		this.serviceStart = serviceStart;
	}

	public Date getServiceEnd() {
		return serviceEnd;
	}

	public void setServiceEnd(Date serviceEnd) {
		this.serviceEnd = serviceEnd;
	}

	public double getGrandTotal() {
		return grandTotal;
	}

	public void setGrandTotal(double grandTotal) {
		this.grandTotal = grandTotal;
	}


}
