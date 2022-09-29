package usecase;

import java.util.Scanner;

import dao.EmployeeDAO;
import dao.EmployeeDaoImpl;
import exception.EmployeeException;
import model.Employee;

public class ViewEmployeeProfile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your first name");
		String fname = sc.next();
		
		System.out.println("Enter your password");
		String pass = sc.next();
		
		Employee employee = new Employee();
		employee.setFirstName(fname);
		employee.setPassword(pass);
		
		EmployeeDAO emp = new EmployeeDaoImpl();
		try {
			Employee empView = emp.viewProfile(employee);
			System.out.println(empView);
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}

}
