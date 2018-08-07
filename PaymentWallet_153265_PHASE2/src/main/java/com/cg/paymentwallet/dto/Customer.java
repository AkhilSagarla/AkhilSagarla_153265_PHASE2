package com.cg.paymentwallet.dto;
import com.cg.paymentwallet.dto.Wallet;
public class Customer {
	private String phoneNumber;
	private String emailId;
	private String name;
	private Wallet wallet;

	public Customer() {
		// TODO Auto-generated constructor stub
		wallet = new Wallet();
	}
	private Integer age;
	private String gender;

	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Wallet getWallet() {
		return wallet;
	}
	public void setWallet(Wallet wallet2) {
		this.wallet = wallet2;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Customer [phoneNumber=" + phoneNumber + ", emailId=" + emailId + ", name=" + name + ", wallet=" + wallet
				+ ", age=" + age + ", gender=" + gender + "]";
	}
}

