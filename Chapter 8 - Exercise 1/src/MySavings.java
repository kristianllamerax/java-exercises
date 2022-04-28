import java.text.DecimalFormat;
import java.util.Scanner;

public class MySavings {

	static float money = 0; // current money
	static boolean loop = true; // loop for running code
	private static final DecimalFormat df = new DecimalFormat("0.00");
	static PiggyBank save = new PiggyBank(money);
	static Scanner option = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		while(loop == true) {
		System.out.println("\n1 - Show total in bank.");
		System.out.println("2 - Add a penny."); // 0.01
		System.out.println("3 - Add a nickel"); // 0.05
		System.out.println("4 - Add a dime."); // 0.10
		System.out.println("5 - Add a quarter."); // 0.25
		System.out.println("6 - Take money out of bank.");
		System.out.println("Enter 0 to quit");
		
		  // Create a Scanner object
	    System.out.print("Enter your choice: ");
	    int inputOption = option.nextInt(); 
	    
	    switch(inputOption) {
	    case 1:
	    	System.out.println("\nCurrent money on the piggy bank: $" + df.format(save.getSavings()) + ".");
	    	break;
	    	
	    case 2:
	    	System.out.println("\nAdded a penny on the piggy bank");
	    	save.addPenny();
	    	break;
	    
		case 3:
	    	System.out.println("\nAdded a nickel on the piggy bank");
	    	save.addNickel();
	    	break;
	    	
		case 4:
	    	System.out.println("\nAdded a dime on the piggy bank");
	    	save.addDime();
	    	break;
	    	
		case 5:
	    	System.out.println("\nAdded a quarter on the piggy bank");
	    	save.addQuarter();
	    	break;
	    	
		case 6:
			System.out.println("\nTook out $" +save.getSavings());
	    	save.takeOutMoney();
	    	break;
	    	
		case 0:
	    	System.exit(0);
	    	break;
	    	
	    default:
	    	System.out.println("Invalid input!");
	    	}
	    
		}
		option.close();
	}
}
