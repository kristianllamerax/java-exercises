
public class Customer {
    private String firstName, lastName, street, city, state, zip;
    private int acctType;
    
    public Customer(String fName, String lName, String str, String c, String s, String z, int t) {
        firstName = fName;
        lastName = lName;
        street = str;
        city = c;
        state = s;
        zip = z;
        acctType = t;
    }
    
    public int CheckAcctType() {
        return acctType;
    }
    
    public String toString() {
        String custString;
        custString = "\n" + firstName + " " + lastName + "\n";
        custString += street + "\n";
        custString += city + ", " + state + " " + zip + "\n";
        switch(CheckAcctType()) {
       case 1:
           custString += "Account Type: Personal Account\n";
           break;
       case 2:
           custString += "Account Type: Business Account\n";
           break;
       }
        return(custString);
        }
   }
