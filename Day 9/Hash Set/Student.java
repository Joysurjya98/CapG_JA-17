package com.capg.collections;

public class Student {
	private int sid;
    private String sname;

    //	Constructors
    public Student() { 
    	super(); 
    }
    public Student(int sid, String sname) {
        super();
        this.sid = sid;
        this.sname = sname;
    }

    //    Getters
    public int getSid() { 
    	return sid; 
    }
    public String getSname() { 
    	return sname; 
    }

    //    Setters
    public void setSid(int sid) { 
    	this.sid = sid; 
    }
    public void setSname(String sname) { 
    	this.sname = sname; 
    }

}
