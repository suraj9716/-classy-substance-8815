package usecase;

import java.util.Scanner;

import dao.DepartmentDAO;
import dao.DepartmentDaoImpl;
import dao.EmployeeDAO;
import dao.EmployeeDaoImpl;
import model.Employee;

public class RegisterEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employee first name");
		String fname = sc.next();

		System.out.println("Enter employee last name");
		String lname = sc.next();
		
		System.out.println("Enter employee password");
		String pass = sc.next();
		
		System.out.println("Enter employee Mobile number");
		String mobile = sc.next();
		
		System.out.println("Enter employee email id");
		String email = sc.next();
		
		System.out.println("Enter employee date of birth in yyyy-mm-dd format");
		String dob = sc.next();
		
		System.out.println("Enter employee address");
		String add = sc.next();
		
		System.out.println("Enter employee salary");
		int salary = sc.nextInt();
		
		System.out.println("Enter employee hire date in yyyy-mm-dd format ");
		String hiredate = sc.next();
		
		System.out.println("Enter department Id");
		int did = sc.nextInt();
		
		Employee e1 = new Employee(fname, lname, pass, mobile, email, dob, add, salary, hiredate, did);
		
		EmployeeDAO d1 = new EmployeeDaoImpl();
	  String res =	d1.registerEmployee(e1);
	  System.out.println(res);	
		
	}

}
