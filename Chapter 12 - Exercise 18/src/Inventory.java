import java.util.Scanner;

public class Inventory {
	
	static InventoryClass invClass = new InventoryClass();
	static boolean loop = true;
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		invClass.readInventory();	
		while(loop) {	
		System.out.println("\n=== Menu ===");
		System.out.println("1) - Add Item");
		System.out.println("2) - Discontinue Item");
		System.out.println("3) - Display stock amount");
		System.out.println("Enter 0 to exit");
		
		
		System.out.print("Enter option: ");
		int inputOption = input.nextInt();
		
		switch(inputOption) {
		case 1:
			AddNewItem();
			break;
		case 2:
			DiscontinueAnItem();
			break;
		case 3:
			try {
			invClass.displayInventory();
			} catch(NullPointerException e) {
			}
			break;
		case 0:
			invClass.saveInventory();
			loop = false;
			break;
		default:
			System.out.println("INVALID INPUT!");
			}
		}
	  }
	
		public static void DiscontinueAnItem() {
			
			if(invClass.item.size() == 0) {
				System.out.println("\nNo items in inventory!");
			} else {
				Scanner input = new Scanner(System.in);
				System.out.print("Enter item ID: ");
				String inputName = input.next();
				invClass.DiscontinueItem(inputName);
			}
		}
	
		public static void AddNewItem() {
			Scanner input = new Scanner(System.in);
			System.out.print("Enter item name: ");
			String inputName = input.next();
			
			System.out.print("Enter item stocks: ");
			String inputStock = input.next();
			
			invClass.AddItem(inputName, inputStock);
		}
}
