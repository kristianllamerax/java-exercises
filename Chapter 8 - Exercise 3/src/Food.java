
public class Food {
	private String food;
	private double price;
	private double fat;
	private double carbs;
	private double fiber;
	
	public Food(String currentfood, double currentprice, double currentfat, double currentcarbs, double currentfiber) {
		food = currentfood;
		price = currentprice;
		fat = currentfat;
		carbs = currentcarbs;
		fiber = currentfiber;
	}
	
	public String getItem() {
		return food;
	}
	
	public double getPrice() {
		return price;
	}
	
	public double getFat() {
		return fat;
	}
	
	public double getCarbs() {
		return carbs;
	}
	
	public double getFiber() {
		return fiber;
	}
	
}
