package com.capg.collections;

public class StudentArrList {

	private int sid;
	private String sname;

	//  Constructor
	public StudentArrList(int sid, String sname) {
		super();
		this.sid = sid;
		this.sname = sname;
	}

	//  Getters
	public int getSid() { 
		return sid; 
	}
	public String getSname() { 
		return sname; 
	}

	//  Setters
	public void setSname(String sname) { 
		this.sname = sname; 
	}

}
