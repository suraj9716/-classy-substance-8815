package dao;

import java.util.List;

import exception.EmployeeException;
import model.Employee;
import model.EmployeeDepartmentDTO;

public interface EmployeeDAO {

	public String registerEmployee(Employee employee);
	public Employee viewProfile(Employee employee) throws EmployeeException;
	public String changePassword(Employee employee)  throws EmployeeException;
	public String updateProfile(Employee employee) throws EmployeeException;
	public String transferDepartment(Employee employee) throws EmployeeException;
	public List<Employee> getAllEmployee() throws EmployeeException;
	public List<EmployeeDepartmentDTO> viewEmployeeDepartment() throws EmployeeException;
}
