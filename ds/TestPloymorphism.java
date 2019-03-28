package ds;

public class TestPloymorphism {
	public static void main(String[] args) {
		System.out.println(args[0]);
		System.out.println(args[1]);
		
		StudentEmployee joe = new StudentEmployee(3.29, 6.75);
		report((StudentInterface)joe);
		report((EmployeeInterface)joe);
	}
	static void report(StudentInterface student) {
		System.out.println("This student's gpa is : " + student.getGpa());
	}
	static void report(EmployeeInterface employee) {
		System.out.println("This employee's wages are : $" + employee.getWages());
	}
}