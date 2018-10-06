import java.util.Scanner;

public class Student {
	private String studentName;
	private int studentID;

	public Student(String studentName, int studentID) {
		this.studentName = studentName;
		this.studentID = studentID;
	}

	public Student() {

	}

	public String toString() {
		return studentName + " " + studentID;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

}
