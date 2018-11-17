package Question2;
import java.util.Vector;

public class StudentController {
	Vector<StudentModel> vec;
	public StudentController() {
		
	   this.vec=new Vector<>();
	}
	public Vector<StudentModel> getVec() {
		return vec;
	}
	public void addStudent(String id,String firstname,String lastname,  String gender)
	{
		StudentModel model= new StudentModel(id,firstname,lastname, StudentModel.Gender.valueOf(gender));
		vec.add(model);
		System.out.println("Student added successfully");
	}
	

}
