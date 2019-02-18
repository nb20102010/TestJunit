package c05_DesignTests;

public class EmpBusinessLogic {
	
	public double calculateYearlySalary(EmployeeDetails employeeDetails) {
		return employeeDetails.getMonthlySalary() * 12;		
	}
	
	public double calculateAppraisal(EmployeeDetails employeeDetails) {
		return employeeDetails.getMonthlySalary() < 10000 ? 500 : 1000;
	}
	
}
