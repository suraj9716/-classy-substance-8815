package usecase;

import java.util.Scanner;

import dao.DepartmentDAO;
import dao.DepartmentDaoImpl;
import dao.EmployeeDAO;
import dao.EmployeeDaoImpl;
import exception.DepartmentException;
import exception.EmployeeException;
import model.Department;
import model.Employee;

public class UpdateEmployeePassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EmployeeDAO d1 = new EmployeeDaoImpl();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Employee id");
		int eid = sc.nextInt();
//		System.out.println("Enter your Password");
//		String pass = sc.next();
		
		Employee emp = new Employee();
		
		emp.setId(eid);
		
//		emp.setPassword(pass);
		
		try {
			String res = d1.changePassword(emp);
		    System.out.println(res);
		
		} catch (EmployeeException e) {
			System.out.println(e.getMessage());
		}
	}

}
