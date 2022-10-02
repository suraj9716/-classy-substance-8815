package usecase;

import java.util.Scanner;

import dao.EmployeeDAO;
import dao.EmployeeDaoImpl;
import exception.EmployeeException;
import model.Employee;

public class ViewEmployeeProfile {

	public static void main(Employee emp) {
		// TODO Auto-generated method stub

//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter your first name");
//		String fname = sc.next();
//		
//		System.out.println("Enter your password");
//		String pass = sc.next();
		
//		Employee employee = new Employee();
//		employee.setFirstName(fname);
//		employee.setPassword(pass);
		
		EmployeeDAO emp1 = new EmployeeDaoImpl();
		try {
			Employee empView = emp1.viewProfile(emp);
//			System.out.println(empView);
			System.out.println("▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄\r\n"
					+ "██ ███ ██▄██ ▄▄█ ███ ███▀▄▄▀█ ▄▄▀█▀▄▄▀█ ▄▄██▄██ ██ ▄▄\r\n"
					+ "███ █ ███ ▄█ ▄▄█▄▀ ▀▄███ ▀▀ █ ▀▀▄█ ██ █ ▄███ ▄█ ██ ▄▄\r\n"
					+ "███▄▀▄██▄▄▄█▄▄▄██▄█▄████ ████▄█▄▄██▄▄██▄███▄▄▄█▄▄█▄▄▄\r\n"
					+ "▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀\r\n"
					+ "");
			
			System.out.println("╔════════════════════════════╗\r\n");
			
			System.out.println("ID = " + empView.getId());
			System.out.println("First Name = " + empView.getFirstName());
			System.out.println("Last Name = " + empView.getLastName());
			System.out.println("Password = " + empView.getPassword());
			System.out.println("Mobile No = " + empView.getMobile());
			System.out.println("Email ID = " + empView.getEmail());
			System.out.println("DOB = " + empView.getDateOfBirth());
			System.out.println("Address = " + empView.getAddress());
			System.out.println("Salary = " +  empView.getSalary());
			System.out.println("Hire Date = " + empView.getHireDate());
			System.out.println("Department no = " + empView.getDepartmentID());
			
			System.out.println("╚════════════════════════════╝");
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}

}
