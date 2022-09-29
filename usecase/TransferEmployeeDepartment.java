package usecase;

import java.util.Scanner;

import dao.EmployeeDAO;
import dao.EmployeeDaoImpl;
import exception.EmployeeException;
import model.Employee;

public class TransferEmployeeDepartment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		EmployeeDAO emp = new EmployeeDaoImpl();
		
		Employee employee = new Employee();
		System.out.println("Enter employee id to change department");
		int eid = sc.nextInt();
		
//		employee.setDepartmentID(did);
		employee.setId(eid);
		
		try {
			String res = emp.transferDepartment(employee);
			System.out.println(res);
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
	}

}
