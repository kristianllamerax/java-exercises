import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
	static double balance;
	static String firstName, lastName, street, city, state, zip;
	static int acctType;
	static boolean loop = true;
	static Account account;
	
	static PersonalAcct personalAcct;
	static BusinessAcct businessAcct;
	
	private static final DecimalFormat df = new DecimalFormat("0.00");
	
	public static void main(String[] args) {
		
		Scanner inputAmnt = new Scanner(System.in);  // Create a Scanner object
	    System.out.print("Enter initial deposit amount: ");
	    balance = inputAmnt.nextDouble();
	    
	    Scanner inputFName = new Scanner(System.in);  // Create a Scanner object
	    System.out.print("Enter First Name: ");
	    firstName = inputFName.next();
	    
	    Scanner inputLName = new Scanner(System.in);  // Create a Scanner object
	    System.out.print("Enter Last Name: ");
	    lastName = inputLName.next();
	    
	    Scanner inputStreet = new Scanner(System.in);  // Create a Scanner object
	    System.out.print("Enter Street: ");
	    street = inputStreet.next();
	    
	    Scanner inputCity = new Scanner(System.in);  // Create a Scanner object
	    System.out.print("Enter City: ");
	    city = inputCity.next();
	    
	    Scanner inputState = new Scanner(System.in);  // Create a Scanner object
	    System.out.print("Enter State: ");
	    state = inputState.next();
	    
	    Scanner inputZip = new Scanner(System.in);  // Create a Scanner object
	    System.out.print("Enter Zip code: ");
	    zip = inputZip.next();
	    
	    Scanner inputAcctType = new Scanner(System.in);  // Create a Scanner object
	    System.out.print("Enter Account Type (1 - Personal / 2 - Business): ");
	    acctType = inputAcctType.nextInt();
	    
	    switch(acctType) {
		case 1:	
			account = new PersonalAcct(balance, firstName, lastName, street, city, state, zip, acctType);
			break;
		case 2:
			account = new BusinessAcct(balance, firstName, lastName, street, city, state, zip, acctType);
			break;
		}
	    
	    while(loop) {
	    System.out.print("\nEnter Transaction:");
	    System.out.print("\n1) - View Account Details");
	    System.out.print("\n2) - Deposit");
	    System.out.print("\n3) - Withdraw");
	    System.out.print("\n4) - Check Balance");
	    System.out.print("\nEnter 0 to exit\n");
	    
	    Scanner option = new Scanner(System.in);  // Create a Scanner object
	    System.out.print("Enter option: ");
	    int selectedOption = option.nextInt();
	    
	    switch(selectedOption) {
	    	case 1:
	    		System.out.println(account.toString());
	    		break;
	    	
	    	case 2:
	    		System.out.print("\nEnter amount to deposit: $");
	    		Scanner inputDeposit = new Scanner(System.in);
	    		Double inputDepositMoney = inputDeposit.nextDouble();
	    		System.out.println("\nSuccessfully deposited $"+inputDepositMoney);
	    		account.deposit(inputDepositMoney);
	    		System.out.println("New Balance: $" +df.format(account.getBalance()));
		    	break;
		    	
	    	case 3:
	    		System.out.print("\nEnter amount to withdraw: $");
	    		Scanner inputWithdraw = new Scanner(System.in);
	    		Double inputWithdrawMoney = inputWithdraw.nextDouble();
	    		System.out.println("\nSuccessfully withdrawn $"+inputWithdrawMoney);
	    		switch(acctType) {
	    		case 1:	
	    			account.withdrawal(inputWithdrawMoney);
	    			break;
	    		case 2:
	    			account.withdrawal(inputWithdrawMoney);
	    			break;
	    		}
	    		System.out.println("New Balance: $" +df.format(account.getBalance()));
		    	break;
		    	
	    	case 4:
		    	System.out.println("\nCurrent balance is: $" +df.format(account.getBalance()));
		    	break;
		    	
	    	case 0:
		    	loop = false;
		    	break;
	    	}
	    }
	}
}
