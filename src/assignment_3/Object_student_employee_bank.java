package assignment_3;

class Student1{
	public void studentDetails(){
		System.out.println("Inside Student Block");
	}
}


class Employee{
	public void employeeDetails(){
		System.out.println("Inside Employee Block");
	}
}

class Bank{
	public void bankDetails(){
		System.out.println("Inside Bank Block");
	}
}

public class Object_student_employee_bank {

	public static void main(String[] args) {
		
		Student1 stud = new Student1();
		stud.studentDetails();
		
		
		Employee employ = new Employee();
		employ.employeeDetails();
		
		Bank bank = new Bank();
		bank.bankDetails();

	}

}
