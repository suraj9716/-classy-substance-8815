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

	public static void main(Employee emp) {
		// TODO Auto-generated method stub

		EmployeeDAO d1 = new EmployeeDaoImpl();
		
		
		try {
			String res = d1.changePassword(emp);
		    System.out.println(res);
		
		} catch (EmployeeException e) {
			System.out.println(e.getMessage());
		}
	}

}
