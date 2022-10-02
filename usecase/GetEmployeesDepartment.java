package usecase;

import java.util.List;

import dao.EmployeeDAO;
import dao.EmployeeDaoImpl;
import exception.EmployeeException;
import model.EmployeeDepartmentDTO;

public class GetEmployeesDepartment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeDAO emp = new EmployeeDaoImpl();
	try {
		List<EmployeeDepartmentDTO> list =	emp.viewEmployeeDepartment();
		list.forEach(s-> System.out.println(s));
		
		
	} catch (EmployeeException e) {
		// TODO Auto-generated catch block
		System.out.println(e.getMessage());
	}
	

	}

}
