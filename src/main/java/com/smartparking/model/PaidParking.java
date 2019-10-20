package com.smartparking.model;

import java.sql.Timestamp;

public class PaidParking {

	private String name;
	private Timestamp startTime;
	private Timestamp endTime;
	private String licensePlate;
	private long mobile;
	private String email;
	private String zipCode;
	private String area;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Timestamp getStartTime() {
		return startTime;
	}

	public void setStartTime(Timestamp startTime) {
		this.startTime = startTime;
	}

	public Timestamp getEndTime() {
		return endTime;
	}

	public void setEndTime(Timestamp endTime) {
		this.endTime = endTime;
	}

	public String getLicensePlate() {
		return licensePlate;
	}

	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	@Override
	public String toString() {
		return "PaidParking [name=" + name + ", startTime=" + startTime + ", endTime=" + endTime + ", licensePlate="
				+ licensePlate + ", mobile=" + mobile + ", email=" + email + ", zipCode=" + zipCode + ", area=" + area
				+ "]";
	}

}
