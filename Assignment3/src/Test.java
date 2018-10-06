import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args)

	{

		System.out.println(" The list of available courses:\n 1. Java \n 2. Database \n 3. Algorithms");
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the name of course you want to register: ");
		String courseName = in.nextLine();
		Course course = new Course(courseName);

		for (int i = 0; i <= 15; i++) {
			System.out.println("Enter the student name: ");
			Scanner in1 = new Scanner(System.in);
			String studentName = in1.nextLine();
			Student obj = new Student(studentName, 100 + i);
			course.registerStudent(obj);
			System.out.println("Do you want to add more students? Y/N only");
			Scanner reader = new Scanner(System.in);
			char answer = reader.findInLine(".").charAt(0);
			if (answer == 'N')
				break;
		}
		Student[] students = course.getStudents();
		System.out.println(" ******************************* ");
		System.out.println("\n The list registered students:  ");
		for (int i = 0; i < course.getNoOfStudents(); i++) {
			
			System.out.println("Name:" + students[i].getStudentName() + "  ID: " + students[i].getStudentID());

		}

	}
}
