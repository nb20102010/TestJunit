package c05_DesignTests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class TestEmployeeDetails {
	
	EmployeeDetails employee = new EmployeeDetails();
	EmpBusinessLogic empBusinessLogic = new EmpBusinessLogic();
	
	@Test
	public void testCalculateAppriasal() {
		
		employee.setName("Rajeev");
		employee.setAge(25);
		employee.setMonthlySalary(8000);
		
		double appraisal = empBusinessLogic.calculateAppraisal(employee);
	//	System.out.println(appraisal);
		assertEquals(500, appraisal, 0.00001);
	
	}
	
	@Test
	public void testCalculateYearlySalary() {
		
		employee.setName("Rajeev");
		employee.setAge(25);
		employee.setMonthlySalary(8000);
		
		double salary = empBusinessLogic.calculateYearlySalary(employee);
		assertEquals(96000, salary, 0.000001);
	}

}
