package usecase;

import java.util.Scanner;

import dao.EmployeeDAO;
import dao.EmployeeDaoImpl;
import exception.EmployeeException;
import model.Employee;

public class UpdateEmployeeProfile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EmployeeDAO emp = new EmployeeDaoImpl();
		Employee employee = new Employee();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your employee ID");
		int id = sc.nextInt();
		employee.setId(id);
		
	    try {
			String result =	emp.updateProfile(employee);
			System.out.println(result);
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
