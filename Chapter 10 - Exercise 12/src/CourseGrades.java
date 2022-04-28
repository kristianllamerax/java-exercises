import java.util.Scanner;

public class CourseGrades {
	static int numberOfStudents = 12;
	static int numberOfTests = 5;
	static GradeBook gradebook;
	static int inputGrades[][];
	
	static boolean loop = true;
	
	public static void main(String[] args) {
		
		gradebook = new GradeBook(numberOfStudents, numberOfTests);
		inputGrades = new int[numberOfStudents][numberOfTests];
		
		for(int currentStudentNumber = 0; currentStudentNumber < numberOfStudents; currentStudentNumber++) {
			for(int currentTestNumber = 0; currentTestNumber < numberOfTests; currentTestNumber++) {
				
				Scanner grade = new Scanner(System.in);  // Create a Scanner object
				System.out.print("Input grade for Student #"+(currentStudentNumber+1)+ " for Test #"+(currentTestNumber+1)+ ": ");
				gradebook.setGrades(currentStudentNumber, currentTestNumber, grade.nextInt()); 
			}
			System.out.print("\n");
		}
		
		while(loop) {
		System.out.print("\n");
		System.out.print("\n1) - Show grades for selected test for all students");
		System.out.print("\n2) - Show all grades of students");
		System.out.print("\n3) - Show average grade of a student");
		System.out.print("\n4) - Show average grade of a selected test");
		System.out.print("\nEnter 0 to exit");
		
		Scanner input = new Scanner(System.in);
		System.out.print("\nInput option: ");
		int inputOption = input.nextInt(); 
		
		switch(inputOption) {
		case 1:
			Scanner student = new Scanner(System.in);
			System.out.print("Input test number: ");
			int selectedStudent = student.nextInt(); 
			gradebook.getGrades(selectedStudent);
			break;
			
		case 2:
			gradebook.showGrades();
			break;
			
		case 3:
			Scanner studentNum = new Scanner(System.in);
			System.out.print("Input student number: ");
			int selectedStudentNum = studentNum.nextInt(); 
			System.out.println(gradebook.studentAvg(selectedStudentNum)+ "");
			break;
			
		case 4:
			Scanner testNum = new Scanner(System.in);
			System.out.print("Input test number: ");
			int selectedTestNum = testNum.nextInt(); 
			System.out.println(gradebook.testAvg(selectedTestNum)+ "");
			break;
		
		case 0:
			loop = false;
			break;
		
		default:
			System.out.print("INPUT INVALID!");
			}
		
		}
		
	}
}
