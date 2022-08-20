package ch09;

public class EmpolyeeTest {
	public static void main(String[] args) {
		
		Employee employeeLee = new Employee();
		employeeLee.setEmpolyeeName("Lee");
		
		System.out.println(Employee.getSerialNum());
		
		Employee employeeKim = new Employee();
		employeeKim.setEmpolyeeName("김유신");
		
		System.out.println(employeeLee.getEmpolyeeName() + "님의 사번은 " + employeeLee.getEmployeeId());
		System.out.println(employeeKim.getEmpolyeeName() + "님의 사번은 " + employeeKim.getEmployeeId());
	}
}
