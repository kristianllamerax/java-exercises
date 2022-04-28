import java.text.DecimalFormat;
import java.util.Scanner;

public class LunchOrder {
	static String[] food = {"hamburger", "salad", "french fries", "soda"};
	static double[] price = {1.85, 2.00, 1.30, 0.95};
	static double[] fat = {9, 1, 11, 0};
	static double[] carbs = {33, 11, 36, 38};
	static double[] fiber = {1, 5, 4, 0};
	
	static double totalPrice;
	
	private static final DecimalFormat df = new DecimalFormat("0.0");
	private static final DecimalFormat df2 = new DecimalFormat("0.00");
	
	static Scanner quantity = new Scanner(System.in); 
	 
	public static void main(String[] args) {
		for(int i = 0; i < 4; i++) {
			Food item = new Food(food[i], price[i], fat[i], carbs[i], fiber[i]);
			 // Create a Scanner object
		    System.out.print("Enter number of " + item.getItem() +"s : ");
		    int inputQuantity = quantity.nextInt(); 
		
		    totalPrice += inputQuantity * item.getPrice();
		    System.out.println("Each "+item.getItem()+ " has " +df.format(item.getFat())+ "g of fat, " +df.format(item.getCarbs())+ "g of carbs, and " +df.format(item.getFiber())+ "g of fiber. \n");
		}
		System.out.println("Your order comes to: $" +df2.format(totalPrice));
		quantity.close();
	}
}
