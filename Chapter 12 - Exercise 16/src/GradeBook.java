import java.io.File;
import java.io.FileWriter;
import java.io.Serializable;
import java.util.Scanner;

public class GradeBook implements Serializable {
	int[][] grades;
	int numStud, numTest;
	
	File saveGrade = new File("Grades.txt");
	FileWriter writer;
	Scanner scan;
	
	public GradeBook(int numOfStudents, int numOfTest) {
		numStud = numOfStudents;
		numTest = numOfTest;
		grades = new int[numStud][numTest];
	}
	
	public GradeBook(int[][] grades, int numOfStudents, int numOfTest) {
		this.numStud = numOfStudents;
		this.numTest = numOfTest;
		this.grades = grades;
	}
	
	public void setGrades(int studentNumber, int testNumber, int score) {
		grades[studentNumber][testNumber] = score;
	}
	
	public void getGrades(int testNumber) {
		System.out.print("\nStud  #");
		for(int numOfStud = 0; numOfStud < numStud; numOfStud++) {
			System.out.printf("%7s","| " +(numOfStud+1)+ " |");
		}
		System.out.print("\n-------------------------------------------------------------------------------------------");
			System.out.print("\nTest #" +(testNumber));
			for(int numOfStud = 0; numOfStud < numStud; numOfStud++) {
				System.out.printf("%7s","| " +grades[numOfStud][testNumber-1]+ " |");
			}
		System.out.println("\n");
	}
	
	public void showGrades() {
		System.out.print("\nStud  #");
		for(int numOfStud = 0; numOfStud < numStud; numOfStud++) {
			System.out.printf("%7s","| " +(numOfStud+1)+ " |");
		}
		System.out.print("\n-------------------------------------------------------------------------------------------");
		for(int numOfTest = 0; numOfTest < numTest; numOfTest++) {
			System.out.print("\nTest #" +(numOfTest+1));
			for(int numOfStud = 0; numOfStud < numStud; numOfStud++) {
				System.out.printf("%7s","| " +grades[numOfStud][numOfTest]+ " |");
			}
		}
		System.out.println("\n");
	}
	
	public int studentAvg(int studentNumber) {
		int averageScore = 0;
		System.out.println("\nGrades of Student #" +(studentNumber));
		for(int numOfTest = 0; numOfTest < numTest; numOfTest++) {
			System.out.println("Test #" +(numOfTest+1)+ ": | "+grades[studentNumber-1][numOfTest]+ " |");
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
