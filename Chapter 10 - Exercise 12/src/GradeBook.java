
public class GradeBook {
	int[][] grades;
	int numStud, numTest;
	
	public GradeBook(int numOfStudents, int numOfTest) {
		numStud = numOfStudents;
		numTest = numOfTest;
		grades = new int[numStud][numTest];
	}
	
	public void setGrades(int studentNumber, int testNumber, int score) {
		grades[studentNumber][testNumber] = score;
	}
	
	public void getGrades(int testNumber) {
			System.out.println("\nGrades of Student for Test #" +testNumber);
			for(int numOfStud = 0; numOfStud < numStud; numOfStud++) {
				System.out.print("\nStudent #" +(numOfStud+1)+ ": "+grades[numOfStud][(testNumber-1)]);
			}	
	}
	
	public void showGrades() {
		for(int numOfStud = 0; numOfStud < numStud; numOfStud++) {
			System.out.println("\nGrades of Student #" +(numOfStud+1));
			for(int numOfTest = 0; numOfTest < numTest; numOfTest++) {
				System.out.println("Test #" +(numOfTest+1)+ ": "+grades[numOfStud][numOfTest]);
			}
		}
	}
	
	public int studentAvg(int studentNumber) {
		int averageScore = 0;
		System.out.println("\nGrades of Student #" +(studentNumber));
		for(int numOfTest = 0; numOfTest < numTest; numOfTest++) {
			System.out.println("Test #" +(numOfTest+1)+ ": "+grades[studentNumber-1][numOfTest]);
			averageScore += grades[(studentNumber-1)][numOfTest];
		}
		averageScore = (averageScore/numTest);
		System.out.print("\nAverage grade of student #" +studentNumber+ ": ");
		return averageScore;
	}
	
	public int testAvg(int testNumber) {
		int averageTestScore = 0;
		System.out.println("\nGrades of Students for Test #" +(testNumber));
		for(int numOfStud = 0; numOfStud < numStud; numOfStud++) {
			System.out.println("Student #" +(numOfStud+1)+ ": "+grades[numOfStud][(testNumber-1)]);
			averageTestScore += grades[numOfStud][(testNumber-1)];
		}
		averageTestScore = (averageTestScore/numStud);
		System.out.print("\nAverage grade for Test #" +testNumber+ ": ");
		return averageTestScore;
	}
}
