package usecase;

import java.util.Scanner;

import dao.EmployeeLeaveDAO;
import dao.EmployeeLeaveDaoImpl;

public class ApproveEmployeeLeave {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		EmployeeLeaveDAO emp = new EmployeeLeaveDaoImpl();
		
		System.out.println("Enter the Employee id which you want to Approve the leave");
		int eid = sc.nextInt();
		
		String res = emp.approveLeave(eid);
		System.out.println(res);
	}

}
