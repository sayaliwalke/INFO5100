package Question2;

public class StudentModel {
	private String FirstName;
	private String LastName;
	private String studentID;
	Gender gender;
	
	enum Gender {
		MALE,FEMALE;
	}

	public StudentModel(String studentID,String firstname,String lastname,Gender g) {
		this.studentID = studentID;
		this.FirstName = firstname;
		this.LastName = lastname;
		this.gender=g;
		
	}
	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public StudentModel() {

	}
	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String studentName) {
		this.FirstName = studentName;
	}

	public String getStudentID() {
		return studentID;
	}

	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}

}


