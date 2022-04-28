import java.util.Random;
import java.util.Scanner;

public class Bowling {
	static int numberofBowlers, firstBowl, secondBowl, totalScore;
	static int numberofFrames = 10;
	static int numberofPins = 10;
	static int minScore = 1;
	
	public static void main(String[] args) {
		Scanner quantity = new Scanner(System.in);  // Create a Scanner object
	    System.out.print("Enter number of bowlers : ");
	    int numberofBowlers = quantity.nextInt(); 
	    
	    
	    
	    Score score = new Score(numberofBowlers, numberofFrames);
	    
	    for(int currentFrame = 0; currentFrame < numberofFrames; currentFrame++) {
	    	Random rand = new Random();
	    	System.out.println("\n===== Frame "+(currentFrame+1)+" ======");
	    	for(int currentPlayer = 0; currentPlayer < numberofBowlers; currentPlayer++) {
	    		int maxScore = numberofPins;
	    		firstBowl = rand.nextInt(11);
	    		System.out.println("Player "+(currentPlayer+1)+" 1st throw: " +firstBowl);
	    		maxScore = maxScore - firstBowl; // reduce score from max pins to score at second bowl
	    		
	    		score.setFirstBowl(currentPlayer, currentFrame, firstBowl);
	    		if(firstBowl == 10) {
	    			System.out.println("Player "+(currentPlayer+1)+" 2nd throw: x");
	    			score.setPoints(currentPlayer, currentFrame, 20);
	    		}
	    		else {
	    			secondBowl = rand.nextInt((maxScore - minScore) + 1)+minScore;
	    			if(firstBowl+secondBowl == 10) {
	    				System.out.println("Player "+(currentPlayer+1)+" 2nd throw: " +secondBowl);
	    				score.setSecondBowl(currentPlayer, currentFrame, secondBowl);
	    				score.setPoints(currentPlayer, currentFrame, 15);
	    			}
	    			else {
	    				System.out.println("Player "+(currentPlayer+1)+" 2nd throw: " +secondBowl);
	    				score.setSecondBowl(currentPlayer, currentFrame, secondBowl);
	    				score.setPoints(currentPlayer, currentFrame, firstBowl+secondBowl);
	    			}
	    		}
	    		System.out.println("\n");
	    	}
	    }
	    
	    System.out.println("================================================ Overall Result ===============================================");
	    for(int displayLoop = 0; displayLoop < numberofBowlers; displayLoop++) {
	    	System.out.print("Player "+(displayLoop+1)+":  ");
	    	for(int displayLoop2 = 0; displayLoop2 < numberofFrames; displayLoop2++) {
	    		System.out.print("| "+score.getFirstBowl(displayLoop, displayLoop2)+ " / " +score.getSecondBowl(displayLoop, displayLoop2)+ " | ");
	    		
	    	}
	    	System.out.print("\n");
	    	System.out.print("Score:     ");
	    	for(int displayLoop3 = 0; displayLoop3 < numberofFrames; displayLoop3++) {
	    		System.out.print("|   "+score.getPoints(displayLoop, displayLoop3)+ "   | ");
	    		totalScore += score.getPoints(displayLoop, displayLoop3);
	    	}
	    	System.out.print("  -> Total Score: " +totalScore);
	    	System.out.print("\n\n");
	    	totalScore = 0;
	    }
	    quantity.close();
	}
}
