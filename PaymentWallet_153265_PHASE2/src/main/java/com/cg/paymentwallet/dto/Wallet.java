package com.cg.paymentwallet.dto;

import java.math.BigDecimal;

public class Wallet{
	private BigDecimal balance;
private String password;
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}

	
	public Wallet() {
		// TODO Auto-generated constructor stub
		super();
	}

	@Override
	public String toString() {
		return "Wallet [balance=" + balance + ", password=" + password + "]";
	}
	public BigDecimal getBalance() {
		return balance;
	}
	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

}

