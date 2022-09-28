package dao;

import java.util.List;

import exception.DepartmentException;
import model.Department;
import model.Employee;

public interface DepartmentDAO {

	public String registerDepartment(Department department);
	public List<Department> viewDepartment() throws DepartmentException;
	public String updateDepartment(Department department) throws DepartmentException;
	public String registerEmployee(Department department);
}
