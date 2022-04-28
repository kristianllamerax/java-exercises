import java.text.DecimalFormat;

public class Account {
	public double balance;
	private Customer cust;
	
	private static final DecimalFormat df = new DecimalFormat("0.00");
	
	public Account(double bal, String fName, String lName, String str, String city, String st, String zip, int aType) {
		balance = bal;
		cust = new Customer(fName, lName, str, city, st, zip, aType);
	}
	
	public double getBalance() {
	 	return(balance);
	}
 
	public void deposit(double amt) {
		balance += amt;
	}
	
	public void withdrawal(double amt) {
		// to be overriden
	}

	public String toString() {
		String accountString;
		accountString = cust.toString();
		accountString += "Current balance is: $" + df.format(balance);
		return(accountString);
	}
 }