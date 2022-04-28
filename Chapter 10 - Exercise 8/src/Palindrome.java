import java.util.Scanner;

public class Palindrome {
	static String word, newWord;
	static char[] convertedWordtoArray;
	static boolean loop = true;
	static boolean isEqual = true;
	
	
	public static void main(String[] args) {	
		
		
		Scanner input = new Scanner(System.in);  // Create a Scanner object
	    System.out.print("Enter a string : ");
	    word = input.nextLine();
	    
	    ConvertText convert = new ConvertText(word);
	    newWord = convert.getConvertedText();
	    
	    char[] convertedWordtoArray = new char[newWord.length()];
	    		
	    for(int x = 0; x < newWord.length(); x++) {
	    	convertedWordtoArray[x] = newWord.toLowerCase().charAt(x);
	    }
	    // convertedWordtoArray = newWord.toLowerCase().toCharArray();
	    int dividedLength = convertedWordtoArray.length / 2;

    	int dividedLenghtCounter = convertedWordtoArray.length;
	    while(loop) {
	    for(int currChar = 0; currChar < dividedLength; currChar++) {
	    	if(convertedWordtoArray[currChar] == convertedWordtoArray[dividedLenghtCounter-1]) {
	    		dividedLenghtCounter--;
	    		isEqual = true;
	    		}
	    	else {
	    		currChar = currChar+convertedWordtoArray.length;
	    		isEqual = false;
	    		}
	    	}
	    loop = false;
	    }
	    
	    if(isEqual == true) {
	    	System.out.println("A palindrome!");
	    }
	    else {
	    	System.out.println("Not a palindrome!");
	    } 
	    input.close();
	  }
}
