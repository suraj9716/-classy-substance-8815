package usecase;

import java.util.List;

import dao.DepartmentDAO;
import dao.DepartmentDaoImpl;
import exception.DepartmentException;
import model.Department;

public class ViewDepartmentList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DepartmentDAO dao = new DepartmentDaoImpl();
		
		try {
		List<Department> dept = dao.viewDepartment();
		
		dept.forEach(s-> System.out.println(s));
		
		} catch (DepartmentException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}

}
