package utility;

import java.util.Scanner;

import usecase.ApproveEmployeeLeave;
import usecase.InsertDepartment;
import usecase.RegisterEmployee;
import usecase.RejectEmployeeLeave;
import usecase.TransferEmployeeDepartment;
import usecase.UpdateDepartment;
import usecase.ViewDepartmentList;

public class Admin {
	
	public static void admin() {
		Scanner sc = new Scanner(System.in);
	
		while(true) {
			
			System.out.println("┌───── •✧✧• ─────────────────────────┐\r\n"
					+ " 1 - To add new Department- \r\n"
					+ " 2 - View all Departments      \r\n"
					+ " 3 - Update Department       \r\n"
					+ " 4 - Register new employee       \r\n"
					+ " 5 - Transfer employee to another department       \r\n"
					+ " 6 - Approve Employee Leave       \r\n"
					+ " 7 - Reject Employee Leave       \r\n"
					+ " 8 - Exit             \r\n"
					+ "└───── •✧✧• ─────────────────────────┘");
			
//			System.out.println("1 - To add new Department");
//			System.out.println("2 - View all Departments");
//			System.out.println("3 - Update Department");
//			System.out.println("4 - Register new employee");
//			System.out.println("5 - Transfer employee to another department");
//			System.out.println("6 - Approve Employee Leave");
//			System.out.println("7 - Reject Employee Leave");
//			System.out.println("8 - Exit");
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
				ApproveEmployeeLeave.main(null);
			}
			if(ch==7) {
				RejectEmployeeLeave.main(null);
			}
			if(ch==8) {
				return;
			}
		}
	}

}
