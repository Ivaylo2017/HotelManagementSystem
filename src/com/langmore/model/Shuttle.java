package com.langmore.model;

public class Shuttle {
	
	private int busId;
	@SuppressWarnings("unused")
	private Inventory item;
	
	public int getBusId() {
		return busId;
	}

	public void setBusId(int busId) {
		this.busId = busId;
	}

	public void setItem(Inventory item) {
		this.item = item;
	}

}
