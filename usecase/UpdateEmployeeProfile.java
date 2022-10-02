package usecase;

import java.util.Scanner;

import dao.EmployeeDAO;
import dao.EmployeeDaoImpl;
import exception.EmployeeException;
import model.Employee;

public class UpdateEmployeeProfile {

	public static void main(Employee emp) {
		// TODO Auto-generated method stub

		EmployeeDAO emp1 = new EmployeeDaoImpl();
		
	    try {
			String result =	emp1.updateProfile(emp);
			System.out.println(result);
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
