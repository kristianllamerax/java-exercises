
public class Score {
	int[][] firstScore;
    int[][] secondScore;
    int[][] Points;
    
	public Score(int num, int frame) {
		firstScore = new int[num][frame];
	    secondScore = new int[num][frame];
	    Points = new int[num][frame];
	}
	
	public void setFirstBowl(int player, int frame, int score) {
		firstScore[player][frame] = score;
	}
	
	public void setSecondBowl(int player, int frame, int score) {
		secondScore[player][frame] = score;
	}		
	
	public void setPoints(int player, int frame, int points) {
		Points[player][frame] = points;
	}
	
	public int getFirstBowl(int player, int frame) {
		return firstScore[player][frame];
	}
	
	public int getSecondBowl(int player, int frame) {
		return secondScore[player][frame];
	}	
	
	public int getPoints(int player, int frame) {
		return Points[player][frame];
	}
}
