package usecase;

import java.util.Scanner;

import dao.EmployeeLeaveDAO;
import dao.EmployeeLeaveDaoImpl;

public class RequestLeave {

	public static void main(int id) {
		// TODO Auto-generated method stub

		EmployeeLeaveDAO emp = new EmployeeLeaveDaoImpl();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter start date of leave in yyyy-mm-dd format");
		String leavefrom = sc.next();
		
		System.out.println("Enter end date of leave in yyyy-mm-dd format");
		String leavetill = sc.next();
		
		String res =  emp.requestLeave(id, leavefrom, leavetill);
		System.out.println(res);
	}

}
