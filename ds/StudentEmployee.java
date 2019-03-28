package ds;

public class StudentEmployee implements StudentInterface, EmployeeInterface {
	private double gpa, wages;
	
	public StudentEmployee(double gpa, double wages) {
		this.gpa = gpa;
		this.wages = wages;
	}
	public double getGpa() {
		return gpa;
	}
	public double getWages() {
		return wages;
	}
}
