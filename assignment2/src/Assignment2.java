import javax.swing.SortingFocusTraversalPolicy;

class Employee
{
    String name;
    int age;
    Gender gender;
    double salary;// salary per month

    // Constructor. set all the data in constructor.
    public Employee(String name, int age, Gender gender, double salary) {
    		this.name= name;
    		this.age=age;
    		Gender g;
    		this.salary=salary;
    }
    public Employee() {
		// TODO Auto-generated constructor stub
	}
	public String tostring()
    {
    	return name+" "+age+""+ gender + ""+ salary+"";
    }
    // Getter for `name`. Return the current `name` data
    public String getName()
    {    
    	return name;
    }
    // Setter for `name`. Set `name` data
    public void setName(String newname)
    {
    	name=newname;	
    }
    public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getAge() {
		return age;													//getters and setters for other attributes
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	} 
	public void raiseSalary(double byPercent)
	{
		double raisedSalary;
		raisedSalary = salary*byPercent/100;
		raisedSalary= raisedSalary+salary;
		System.out.println("The raised salary of "+ getName()+ " by "+ byPercent+ " percent is " +raisedSalary);
		
	}
}

enum Gender {
    MALE,
    FEMALE;
}


public class Assignment2 {
	//calculates social security class
	public double socialSecurityTax(Employee employee) 
    {	
         double tax=0; 
    
    	if (employee != null && employee.getSalary()<=8900)
    	{
    		tax=0.062*employee.getSalary();
    		System.out.println("The social security tax for "+employee.getName() +" is " +tax);
    	}
    	else
    	{
    		tax= 0.062*106800;
    		System.out.println("The social security tax for "+employee.getName() +" is " +tax);
    	}
    	
    	return tax;
     }
   //Calculates insurance coverage
   public double insuranceCoverage(Employee employee)
   
   {   
	   double insuranceCoverage=0;
	   if (employee != null && employee.age<35)
   	{
   		insuranceCoverage=0.003*employee.getSalary();
   		System.out.println("The contribution for insurance coverage by "+employee.getName() +" is " +insuranceCoverage);
   	}
   	else if(employee != null && employee.age>=35 && employee.age<=50)
   	{
   		insuranceCoverage=0.004*employee.getSalary();
   		System.out.println("The contribution for insurance coverage by "+employee.getName() +" is " +insuranceCoverage);
   	}
   	else if(employee != null && employee.age>50 && employee.age<60)
   	{
   		insuranceCoverage=0.005*employee.getSalary();
   		System.out.println("The contribution for insurance coverage by "+employee.getName() +" is " +insuranceCoverage);
   	}
   	else 
   	{
   		insuranceCoverage=0.006*employee.getSalary();
   		System.out.println("The contribution for insurance coverage by "+employee.getName() +" is " +insuranceCoverage);
   	}
   	
	return insuranceCoverage;
       
    }
   	//sorts in a ascending order according to salary
    public void sortSalary(Employee e1, Employee e2, Employee e3)
    {
       System.out.println("\n ***The list of employees in ascending order acoording to their salary*** \n");
    	Employee[] employeeArray = new Employee[3];
       
       employeeArray[0]=e1;
       employeeArray[1]=e2;
       employeeArray[2]=e3;
       int n= employeeArray.length;
       for(int i=0;i<n;i++)
       {
    	   for (int j = 0; j< n-i-1; j++) 
    	   {
    		     if (employeeArray[j].getSalary() >employeeArray[j + 1].getSalary())
    		     {
    		      Employee temp = employeeArray[j];
    		      employeeArray[j] = employeeArray[j + 1];
    		      employeeArray[j + 1] = temp;
    		     }
    	   }
       }
       for(int i=0;i<n;i++)
       {
       System.out.println("The salary of " +employeeArray[i].getName()+ " is " +employeeArray[i].salary);
       }
       
    }
   //triples the employee salary
    public void tripleSalary(Employee employee) 
    {

        employee.raiseSalary(500);
    	
    }
     /*
     In the previous code the arguments were passed by value hence, 
     the swap didn't work. Java doesn't pass method arguments by reference,
     it passes them by value.
    */
    public static void main(String[] args) {
    	Assignment2 assignment =new Assignment2();
        Employee a = new Employee("Jenny", 20, Gender.FEMALE, 5000);
        Employee b = new Employee("John", 30, Gender.MALE, 10000);
        Employee c = new Employee("Alica", 25, Gender.FEMALE, 25000);
        System.out.println("\n ***The calculated Social security Tax*** \n");
        assignment.socialSecurityTax(a);
        assignment.socialSecurityTax(b);
        assignment.socialSecurityTax(c);
        System.out.println("\n ***The calculated insurance coverage*** \n");
        assignment.insuranceCoverage(a);
        assignment.insuranceCoverage(b);
        assignment.insuranceCoverage(c);
        
        assignment.sortSalary(a,b,c);
        System.out.println("\n ***The calculated raised salary of an employee*** \n");
        assignment.tripleSalary(a);
        assignment.tripleSalary(b);
        assignment.tripleSalary(c);
        System.out.println("\n *** The result of swap function*** \n");
        System.out.println("Before: a=" + a.getName());
        System.out.println("Before: b=" + b.getName());
        swap(a, b); 										
        System.out.println("After: a=" + a.getName());
        System.out.println("After: b=" + b.getName());
    }
    //fixed code for swap
    public static void swap(Employee x, Employee y)
    {
    
		String employeeName;
		int employeeAge;
		double employeeSalary;
		Gender g;
		
		employeeName= x.getName();
		x.setName(y.getName());
		y.setName(employeeName);
		
		employeeAge= x.getAge();
		x.setAge(y.getAge());
		y.setAge(employeeAge);
		
		employeeSalary= x.getSalary();
		x.setSalary(y.getSalary());
		y.setSalary(employeeSalary);
		
		g= x.getGender();
		x.setGender(y.getGender());
		y.setGender(g);
	
    }
}


