package com.cg.paymentwallet.dao;

import java.math.BigDecimal;

import com.cg.paymentwallet.dto.Customer;
import com.cg.paymentwallet.dto.Wallet;
import com.cg.paymentwallet.exception.PaymentWalletException;


public interface IPaymentWalletDao {
	Customer registerCustomer(Customer wallet) throws PaymentWalletException;
	Customer depositMoney(String phone,BigDecimal balance) throws PaymentWalletException;
	Customer withdrawMoney(String phone,BigDecimal balance) throws PaymentWalletException;
	Customer fundTransfer(String sourcePhone,String targetPhone,BigDecimal balance) throws PaymentWalletException;
	Customer showBalance(String phone) throws PaymentWalletException;
	//HashMap<String,String> printTransaction(String phone) throws PaymentWalletException;
	String printTransaction(String phone) throws PaymentWalletException;
	boolean checkLogin(String number, String password);
    
}
