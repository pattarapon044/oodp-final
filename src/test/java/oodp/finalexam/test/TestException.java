package oodp.finalexam.test;
import static org.junit.Assert.assertTrue;

import org.junit.*;
import org.junit.Assert;

import oopd.finalexam.myException.CreditCardException;
import oopd.finalexam.myException.LoanAmountException;
import oopd.finalexam.myException.MonthlyPaymentProgram;
import oopd.finalexam.myException.PayMonthlyException;

public class TestException {
	
	MonthlyPaymentProgram myexception=null;
	@Before
	public void setUp() {
		myexception = new MonthlyPaymentProgram();
		
	}
	

	@Test
	public void testWrongCreditCardNo() {
		try {
			myexception.getCreditCardNo("123");
			myexception.getLoanAmount("50000");
			myexception.getNoOfMonth("12");
		} catch (CreditCardException e) {
			assertTrue(true);
		} catch(LoanAmountException e) {
			assertTrue(false);
		}catch(PayMonthlyException e) {
			assertTrue(false);
		}catch(NumberFormatException e) {
			assertTrue(false);
		}
	}
	
	@Test
	public void testWrongLoanAmount1() {
		try {
			myexception.getCreditCardNo("12345");
			myexception.getLoanAmount("5000");
			myexception.getNoOfMonth("12");
		} catch (CreditCardException e) {
			assertTrue(false);
		} catch(LoanAmountException e) {
			assertTrue(true);
		}catch(PayMonthlyException e) {
			assertTrue(false);
		}catch(NumberFormatException e) {
			assertTrue(false);
		}
	}
	
	@Test
	public void testWrongLoanAmount2() {
		try {
			myexception.getCreditCardNo("12345");
			myexception.getLoanAmount("5000000");
			myexception.getNoOfMonth("12");
		} catch (CreditCardException e) {
			assertTrue(false);
		} catch(LoanAmountException e) {
			assertTrue(true);
		}catch(PayMonthlyException e) {
			assertTrue(false);
		}catch(NumberFormatException e) {
			assertTrue(false);
		}
	}
	
	@Test
	public void testNoOfMonth1() {
		try {
			myexception.getCreditCardNo("12345");
			myexception.getLoanAmount("50000");
			myexception.getNoOfMonth("0");
		} catch (CreditCardException e) {
			assertTrue(false);
		} catch(LoanAmountException e) {
			assertTrue(false);
		}catch(PayMonthlyException e) {
			assertTrue(true);
		}catch(NumberFormatException e) {
			assertTrue(false);
		}
	}
	@Test
	public void testNoOfMonth2() {
		try {
			myexception.getCreditCardNo("12345");
			myexception.getLoanAmount("50000");
			myexception.getNoOfMonth("50");
		} catch (CreditCardException e) {
			assertTrue(false);
		} catch(LoanAmountException e) {
			assertTrue(false);
		}catch(PayMonthlyException e) {
			assertTrue(true);
		}catch(NumberFormatException e) {
			assertTrue(false);
		}
	}
	
	@Test
	public void testNumberformat1() {
		try {
			myexception.getCreditCardNo("12345");
			myexception.getLoanAmount("test");
			myexception.getNoOfMonth("12");
		} catch (CreditCardException e) {
			assertTrue(false);
		} catch(LoanAmountException e) {
			assertTrue(false);
		}catch(PayMonthlyException e) {
			assertTrue(false);
		}catch(NumberFormatException e) {
			assertTrue(true);
		}
	}
	
	@Test
	public void testNumberformat2() {
		try {
			myexception.getCreditCardNo("12345");
			myexception.getLoanAmount("50000");
			myexception.getNoOfMonth("test");
		} catch (CreditCardException e) {
			assertTrue(false);
		} catch(LoanAmountException e) {
			assertTrue(false);
		}catch(PayMonthlyException e) {
			assertTrue(false);
		}catch(NumberFormatException e) {
			assertTrue(true);
		}
	}
	
	

}
