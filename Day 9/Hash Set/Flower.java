package com.capg.collections;

public class Flower {
	private int fId;
	private String fname;
	private double ppkg;
	private double qty;
	
	//	Getters
	public int getfId() {
		return fId;
	}
	public String getFname() {
		return fname;
	}
	public double getPpkg() {
		return ppkg;
	}
	public double getQty() {
		return qty;
	}
	
	//	Setters
	public void setfId(int fId) {
		this.fId = fId;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public void setPpkg(double ppkg) {
		this.ppkg = ppkg;
	}
	public void setQty(double qty) {
		this.qty = qty;
	}
	
	//	Constructors
	public Flower() {
		super();
	}
	public Flower(int fId, String fname, double ppkg, double qty) {
		super();
		this.fId = fId;
		this.fname = fname;
		this.ppkg = ppkg;
		this.qty = qty;
	}
	
}
