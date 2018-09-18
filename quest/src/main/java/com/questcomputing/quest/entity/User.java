package com.questcomputing.quest.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class User {
	
	@Id
	@GeneratedValue
	private Long id;
	@Column(unique=true)
	private String ppsNumber;	
	private String name;	
	@DateTimeFormat (pattern="dd/MM/yyyy") 
	private Date birthDay;
	private String mobilePhone;
	
	public User() {
		super();
	}
	public User(String ppsNumber, String name, Date birthDay, String mobilePhone) {
		super();
		this.ppsNumber = ppsNumber;
		this.name = name;
		this.birthDay = birthDay;
		this.mobilePhone = mobilePhone;
	}
	public Long getId() {
		return id;
	}
	public String getPpsNumber() {
		return ppsNumber;
	}
	public String getName() {
		return name;
	}
	public Date getBirthDay() {
		return birthDay;
	}
	public String getMobilePhone() {
		return mobilePhone;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	public void setPpsNumber(String ppsNumber) {
		this.ppsNumber = ppsNumber;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}
	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", ppsNumber=" + ppsNumber + ", name=" + name + ", birthDay=" + birthDay
				+ ", mobilePhone=" + mobilePhone + "]";
	}
}
