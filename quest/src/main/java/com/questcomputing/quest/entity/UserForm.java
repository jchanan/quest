package com.questcomputing.quest.entity;

import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class UserForm {
	
	private String ppsNumber;	
	
	@NotNull
    @Size(max=5)
	private String name;
	
	private Date birthDay;
	private String mobilePhone;
	public String getPpsNumber() {
		return ppsNumber;
	}
	public void setPpsNumber(String ppsNumber) {
		this.ppsNumber = ppsNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBirthDay() {
		return birthDay;
	}
	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}
	public String getMobilePhone() {
		return mobilePhone;
	}
	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}
	@Override
	public String toString() {
		return "UserForm [ppsNumber=" + ppsNumber + ", name=" + name + ", birthDay=" + birthDay + ", mobilePhone="
				+ mobilePhone + "]";
	}
}
