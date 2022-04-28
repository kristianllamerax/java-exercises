
public class PiggyBank {
	private float savings;
	int penny = 0;
	int nickel = 0;
	int dime = 0;
	int quarter = 0;
	
	public PiggyBank(float currentSavings) {
		savings = currentSavings;
	}
	
	public float getSavings() {
		return savings;
	}
	
	public void addPenny() {
		savings += 0.01;
	}
	
	public void addNickel() {
		savings += 0.05;
	}
	
	public void addDime() {
		savings += 0.10;
	}
	
	public void addQuarter() {
		savings += 0.25;
	}
	
	public float getPenny() {
		return penny;
	}
	
	public float getNickel() {
		return nickel;
	}
	
	public float getDime() {
		return dime;
	}
	
	public float getQuarter() {
		return quarter;
	}

	public void takeOutMoney() {
		savings = 0;
	}
}