package usecase;

import java.util.Scanner;

import dao.DepartmentDAO;
import dao.DepartmentDaoImpl;
import exception.DepartmentException;
import model.Department;

public class UpdateDepartment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DepartmentDAO d1 = new DepartmentDaoImpl();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter which department number you want to update");
		int deptno = sc.nextInt();
		
		System.out.println("Enter new department name");
		String dname = sc.next();
		
		try {
			String res = d1.updateDepartment(new Department(deptno,dname));
			System.out.println(res);
		} catch (DepartmentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
