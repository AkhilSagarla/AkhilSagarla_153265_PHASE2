package com.cg.paymentwallet.service;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.math.BigDecimal;

import org.junit.BeforeClass;
import org.junit.Test;
import com.cg.paymentwallet.exception.PaymentWalletException;



public class PaymentWalletTestCases {
	private static IPaymentsWalletService paymentwalletservice = null;

	@BeforeClass
	public static void setUpBeforeClass() throws PaymentWalletException {
		paymentwalletservice = new PaymentWalletService();
		
		

	}

	@Test(expected = PaymentWalletException.class)
	public void failWithPhone() throws PaymentWalletException {
	
		boolean customer1 = paymentwalletservice.validatePhone("978978");
		assertNull(customer1);
	}

	@Test(expected = PaymentWalletException.class)
	public void failWithNegativeMoney() throws PaymentWalletException {
		boolean customer1 = paymentwalletservice.validateMoney(new BigDecimal(-2000));
		assertNotNull(customer1);
	}

	@Test/*(expected = PaymentWalletException.class)*/
	public void passWithName() throws PaymentWalletException {
		boolean customer1 = paymentwalletservice.validateName("akhilsagarla");
		assertNotNull(customer1);
	}
	@Test(expected = PaymentWalletException.class)
	public void failWithName() throws PaymentWalletException {
		boolean customer1 = paymentwalletservice.validateName("akhil1234sagarla");
		assertNull(customer1);
	}
	@Test(expected = PaymentWalletException.class)
	public void failWithEmail() throws PaymentWalletException {
		boolean customer1 = paymentwalletservice.validateName("akhil1234sagarla");
		assertNull(customer1);
	}
	@Test(expected = PaymentWalletException.class)
	public void passWithEmail() throws PaymentWalletException {
		boolean customer1 = paymentwalletservice.validateName("akhilsagarla@gmail.com");
		assertNotNull(customer1);
	}
	
	@Test/*(expected = PaymentWalletException.class)*/
	public void passWithPhone() throws PaymentWalletException {
		boolean customer = paymentwalletservice.validatePhone("8466919330");
		assertNotNull(customer);
	}

	@Test(expected = PaymentWalletException.class)
	public void failPhoneMaxNumbers() throws PaymentWalletException {
		boolean customer = paymentwalletservice.validatePhone("9951610705951");
		assertNull(customer);
	}

}
