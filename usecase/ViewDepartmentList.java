package usecase;

import java.util.List;

import dao.DepartmentDAO;
import dao.DepartmentDaoImpl;
import exception.DepartmentException;
import model.Department;

public class ViewDepartmentList {

	public static void main(String[] args) {
		  final String ANSI_RESET = "\u001B[0m";
			 final String ANSI_YELLOW = "\u001B[35m";
		// TODO Auto-generated method stub

		DepartmentDAO dao = new DepartmentDaoImpl();
		
		try {
		List<Department> dept = dao.viewDepartment();
		System.out.println("▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄\r\n"
				+ "█▀███▀██▄██░▄▄█░███░███░▄▀█░▄▄█▀▄▄▀█░▄▄▀█░▄▄▀█▄░▄█░▄▀▄░█░▄▄█░▄▄▀█▄░▄\r\n"
				+ "██░▀░███░▄█░▄▄█▄▀░▀▄███░█░█░▄▄█░▀▀░█░▀▀░█░▀▀▄██░██░█▄█░█░▄▄█░██░██░█\r\n"
				+ "███▄███▄▄▄█▄▄▄██▄█▄████▄▄██▄▄▄█░████▄██▄█▄█▄▄██▄██▄███▄█▄▄▄█▄██▄██▄█\r\n"
				+ "▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀\r\n"
				+ "");
		
		dept.forEach(s-> System.out.println(ANSI_YELLOW + s + ANSI_RESET));
		
		} catch (DepartmentException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}

}
