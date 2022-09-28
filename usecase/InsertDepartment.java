package usecase;

import java.util.Scanner;

import dao.DepartmentDAO;
import dao.DepartmentDaoImpl;
import model.Department;

public class InsertDepartment {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter new department to add");
		String deptName = sc.next();
		
		DepartmentDAO dao = new DepartmentDaoImpl();
		
		Department d1 = new Department();
		d1.setName(deptName);
		dao.registerDepartment(d1);
	}

}
