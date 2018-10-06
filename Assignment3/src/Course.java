import java.util.Scanner;

public class Course {
	private String courseName;
	private int maximumCapacity;
	private int noOfStudents;
	private Student[] Students;

	public Course(String courseName) {
		this.courseName = courseName;
		this.noOfStudents = 0;
		this.Students = new Student[10];
		this.maximumCapacity = 10; // Maximum students can be enrolled in course are 10.
	}

	public int getNoOfStudents() {
		return noOfStudents;
	}

	public void setNoOfStudents(int noOfStudents) {
		this.noOfStudents = noOfStudents;
	}

	public Course() {
		// TODO Auto-generated constructor stub
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public Student[] getStudents() {
		return Students;
	}

	public void setStudents(Student[] students) {
		Students = students;
	}

	boolean isFull() {
		return noOfStudents >= maximumCapacity;
	}

	public void registerStudent(Student Student) {
		if (isFull()) {
			System.out.println("The course capacity has reached to maximum limit. Can not register");
		} else {
			Students[noOfStudents] = Student;
			noOfStudents++;
			System.out.println("The student " + Student.getStudentName() + " is registered ");

		}
	}

}
