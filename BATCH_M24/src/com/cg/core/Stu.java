package com.cg.core;

public class Stu  {
private String name;
private String phone;
private int sid;




public Stu(String name, String phone, int eid) {
	
	this.name = name;
	this.phone = phone;
	this.sid = eid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public int getSid() {
	return sid;
}
public void setSid(int eid) {
	this.sid = eid;
}



}
