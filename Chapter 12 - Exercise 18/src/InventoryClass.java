import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class InventoryClass {
	
	int stockNumber = 1000;
	
	ArrayList<ArrayList<String>> item;
	ArrayList<String> stockIdNumber;
	ArrayList<String> itemName;
	ArrayList<String> stocks;
	
	File saveInv = new File("Inventory.txt");
	FileWriter writer;
	Scanner scan;
	
	FileReader in;
	BufferedReader readFile;
	
	public InventoryClass() {
		item = new ArrayList<ArrayList<String>>();
		stockIdNumber = new ArrayList<String>();
		itemName = new ArrayList<String>();
		stocks= new ArrayList<String>();
	}
	
	public void displayInventory() {
		if(item.size() == 0) {
			System.out.println("\nNo items in inventory!");
		} else {
			System.out.println("\n  Stock ID  |  Item Name  | Number of stocks");
			for(int i = 0; i < stockIdNumber.size(); i++) {
				System.out.printf("%8s %12s %15s", stockIdNumber.get(i), itemName.get(i),  stocks.get(i));
				System.out.println("");
			}
		}
	}
	
	public void DiscontinueItem(String SelectedItemID) {
		if(item.size() == 0) {
			System.out.println("\nNo items in inventory!");
		} else {
			boolean itemFound = false;
			for(int i = 0; i < stockIdNumber.size(); i++) {
				if(SelectedItemID.equals(stockIdNumber.get(i))) {
					itemFound = true;
				}
			}
			if(itemFound) {
				for(int i = 0; i < stockIdNumber.size(); i++) {
					if(SelectedItemID.equals(stockIdNumber.get(i))) {
				System.out.println("\nDiscontinued Item - Stock ID: "+ stockIdNumber.get(i));
				System.out.println("");
				
				itemName.set(i, "     Discontinued");
				stocks.set(i, "0");
					}
				}
			} else {
				System.out.println("\nNo such item in inventory!");
			}
		}
	}
	
	public void AddItem(String inputName, String inputStocks) {
		stockIdNumber.add(""+stockNumber);
		itemName.add(inputName);
		stocks.add(inputStocks);
		
		item.add(stockIdNumber);
		item.add(itemName);
		item.add(stocks);
		
		System.out.println("\nNew item added - Stock Number: "+stockNumber+ " | Item Name: "+inputName+" | Number of Stocks: "+inputStocks);
		stockNumber++;
	}
	
	public void saveInventory() {
		if(!saveInv.exists()) {
			try {
				saveInv.createNewFile();
				writer = new FileWriter("Inventory.txt", false);
				for(int a = 0; a < stockIdNumber.size(); a++) {
					writer.append(stockIdNumber.get(a) + " " +itemName.get(a)+ " " + stocks.get(a) + "\n");
				}
				writer.close();
			} catch (IOException e) {
				System.out.println("File could not be created");
			}
		} else {
			try {
				 writer = new FileWriter("Inventory.txt", false);
					for(int a = 0; a < stockIdNumber.size(); a++) {
						writer.append(stockIdNumber.get(a) + " " +itemName.get(a)+ " " + stocks.get(a) + "\n");
					}
					writer.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}			
	}	
	
	public void readInventory() {
		if(saveInv.exists()) {
		try {
			in = new FileReader(saveInv);
			readFile = new BufferedReader(in);
			scan = new Scanner(readFile);
			int i = 0;
	        while(scan.hasNext()){
	        	stockIdNumber.add(scan.next());
	            itemName.add(scan.next());
	            stocks.add(scan.next());
	            
	            item.add(stockIdNumber);
	    		item.add(itemName);
	    		item.add(stocks);
	            
	            i++;
	        }
	        scan.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			} 
		this.stockNumber = Integer.parseInt(stockIdNumber.get(stockIdNumber.size()-1));
		stockNumber++;
			
		}
	}

}
