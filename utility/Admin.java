package utility;

import java.util.Scanner;

import usecase.ApproveEmployeeLeave;
import usecase.GetAllEmployee;
import usecase.GetEmployeesDepartment;
import usecase.InsertDepartment;
import usecase.RegisterEmployee;
import usecase.RejectEmployeeLeave;
import usecase.TransferEmployeeDepartment;
import usecase.UpdateDepartment;
import usecase.ViewAllLeaves;
import usecase.ViewDepartmentList;
import usecase.pendingLeave;

public class Admin {
	
	public static void admin(model.Employee emp) {
		  final String ANSI_RESET = "\u001B[0m";
		  final String ANSI_YELLOW = "\u001B[31m";
		Scanner sc = new Scanner(System.in);
		
	
		while(true) {
			
			System.out.println(ANSI_YELLOW +"┌───── •✧✧• ─────────────────────────┐\r\n"
					+ " 1 - To add new Department- \r\n"
					+ " 2 - View all Departments      \r\n"
					+ " 3 - Update Department       \r\n"
					+ " 4 - Register new employee       \r\n"
					+ " 5 - Transfer employee to another department       \r\n"
					+ " 6 - View leave Request       \r\n"
					+ " 7 - View all leaves       \r\n"
					+ " 8 - View Employee Department       \r\n"
					+ " 9 - View All Employee     \r\n"
					+ " 10 - Exit             \r\n"
					+ "└───── •✧✧• ─────────────────────────┘"+ ANSI_RESET);
			
			
//			System.out.println("1 - To add new Department");
//			System.out.println("2 - View all Departments");
//			System.out.println("3 - Update Department");
//			System.out.println("4 - Register new employee");
//			System.out.println("5 - Transfer employee to another department");
//			System.out.println("6 - View leave request");
//			System.out.println("7 - Reject Employee Leave");
//			System.out.println("7 - Exit");
//			System.out.println("***************************************************");
			int ch = sc.nextInt();
			if(ch==1) {
				InsertDepartment.main(null);
			}
			if(ch==2) {
				ViewDepartmentList.main(null);
			}
			if(ch==3) {
				UpdateDepartment.main(null);
			}
			if(ch==4) {
				RegisterEmployee.main(null);
			}
			if(ch==5) {
				TransferEmployeeDepartment.main(null);
			}
			if(ch==6) {
				pendingLeave.main(null);
			}
			if(ch==7) {
				ViewAllLeaves.main(null);
			}
			if(ch==8) {
				GetEmployeesDepartment.main(null);
			}
			if(ch==9) {
				GetAllEmployee.main(emp);
			}
			if(ch==10) {
				return;
			}
			
		}
	}

}
