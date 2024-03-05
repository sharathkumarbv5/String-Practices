package com.example.demo.entity;

public class Employee {
	int EId;
	String Ename;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int eId, String ename) {
		super();
		EId = eId;
		Ename = ename;
	}
	public int getEId() {
		return EId;
	}
	public void setEId(int eId) {
		EId = eId;
	}
	public String getEname() {
		return Ename;
	}
	public void setEname(String ename) {
		Ename = ename;
	}
	@Override
	public String toString() {
		return "Employee [EId=" + EId + ", Ename=" + Ename + "]";
	}
	

}
