package usecase;

import java.util.List;
import java.util.Scanner;

import dao.EmployeeLeaveDAO;
import dao.EmployeeLeaveDaoImpl;
import model.Leave;

public class pendingLeave {

	public static void main(String[] args) {
		
		EmployeeLeaveDAO lev=new EmployeeLeaveDaoImpl();
		List<Leave>list=lev.pendingLeaves();
		
		if(list.size()==0) {
			System.out.println("No Leave Request");
			return;
		}
		for(Leave leave:list) {
			System.out.println(leave);
		}
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("1. Approve leave");
			System.out.println("2. Reject leave");
			System.out.println("3. Go Back");
			int ch=sc.nextInt();
			
			switch(ch) {
			case 1:
				System.out.println("Enter ID of Employee");
				int id1=sc.nextInt();
				ApproveEmployeeLeave.main(id1);
				break;
			case 2:
				System.out.println("Enter ID of Employee");
				int id2=sc.nextInt();
				RejectEmployeeLeave.main(id2);
				break;
			case 3:
				return;
			default :
				System.out.println("Wrong Input");
			}
		}

	}

}