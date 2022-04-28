import java.util.Scanner;

public class Main{
	
		static UEmployee newU = new UEmployee();
public static void main(String[] args) {
	Faculty e = new Faculty();
	Staff r = new Staff();
	
    	Scanner department = new Scanner(System.in);  // Create a Scanner object
	    System.out.print("Enter Department : ");
	    String Department = department.next();  
	    
	    e.setDepartmentName(Department);
	
	    Scanner title = new Scanner(System.in);  // Create a Scanner object
	    System.out.print("Enter Title : ");
	    String Title = title.next(); 
	    
	    r.setJobTitle(Title);
	    
	   
    	
    	System.out.println(newU.toString() + e.toString() + r.toString());
    
		}

}