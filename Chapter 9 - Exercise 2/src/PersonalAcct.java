import java.text.DecimalFormat;

public class PersonalAcct extends Account{
	public double minimumAmount = 100.00;
	public double charge = 2.00;

	private static final DecimalFormat df = new DecimalFormat("0.00");
	
	public PersonalAcct(double bal, String fName, String lName, String str, String city, String st, String zip, int aType) {
		super(bal, fName, lName, str, city, st, zip, aType);
	}
	@Override
	public void withdrawal(double amt) {
		
		if (amt < balance) {
			if(balance - amt < minimumAmount) {
				balance -= amt;
				balance -= charge;
				System.out.println("Deducted $" +df.format(charge)+ " due to balance has fallen below minimum amount.");
			} else {
				this.balance -= amt;
			}
		} else {
			System.out.println("Not enough money in Personal account.");
		}
	}
}
