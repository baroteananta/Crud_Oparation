package com.codeicons.main.model;

//import javax.persistence.Entity;
//import javax.persistence.Id;

//@Entity
public class Hospital 
{
	//@Id
	private int hospitalId;
	private String hospitalName;
	public int getHospitalId() {
		return hospitalId;
	}
	public void setHospitalId(int hospitalId) {
		this.hospitalId = hospitalId;
	}
	public String getHospitalName() {
		return hospitalName;
	}
	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}
}
