package oopd.finalexam.myException;
import lab.oodp.Keyboard;

public class MonthlyPaymentProgram {
	public void start() {
		String credit_no;
		double loan_amount;
		int number_of_month;
		
		try {
				System.out.print("Enter 5 characters of credit card no: ");
				String temp = Keyboard.readInput();	
			    credit_no = getCreditCardNo(temp);
			    
			    System.out.print("Enter loan amount (50,000-1,000,0000): ");
				temp = Keyboard.readInput();
				loan_amount = getLoanAmount(temp);
				
				System.out.print("Enter number of months (2- 48):");
				temp = Keyboard.readInput();
				number_of_month = getNoOfMonth(temp);
				
				System.out.print("You pay " + loan_amount/number_of_month+ "/month");

			}catch (CreditCardException| LoanAmountException|NumberFormatException|PayMonthlyException e) {
				e.printStackTrace();
				
			}

	}
	
	public String getCreditCardNo(String temp) throws CreditCardException{	
			
			//TODO: checking credit card no is in 5 characters, 
			//otherwise throw CreditCardException
			
	
	}
	
	public double getLoanAmount(String temp) throws LoanAmountException,NumberFormatException {
		try {
			
			double amount = Double.parseDouble(temp);
			//TODO:  Check loan amount is more than 50,000 and less than 1,000,000
			// otherwise throw CreditCardException
			
		//TODO:  Check NumberFormatException 
		}catch() {
			throw new NumberFormatException("Must be number format");
			
		}
	}

	
	
	public int getNoOfMonth(String temp ) throws PayMonthlyException,NumberFormatException {
		try {
			
			int amount = Integer.parseInt(temp);
			//TODO:  Checking the mumber of monthly payment not exceed 48 months and more than 2
			// otherwise throw PayMonthlyException
			
			
			return amount;
		//TODO:  Check NumberFormatException 
		}catch() {
			throw new NumberFormatException("Must be number format");
			
		}
	}

	public static void main(String[] args) {
		
		new MonthlyPaymentProgram().start();
	}


}
