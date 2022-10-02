package usecase;

import java.util.Scanner;

import dao.EmployeeLeaveDAO;
import dao.EmployeeLeaveDaoImpl;

public class RejectEmployeeLeave {

	public static void main(int id) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		EmployeeLeaveDAO emp = new EmployeeLeaveDaoImpl();
		
//		System.out.println("Enter the Employee id which you want to Reject the leave");
//		int eid = sc.nextInt();
		
		String res = emp.rejectLeave(id);
		System.out.println(res);
	}

}
