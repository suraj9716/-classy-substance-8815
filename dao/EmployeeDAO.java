package dao;

import exception.EmployeeException;
import model.Employee;

public interface EmployeeDAO {

	public String registerEmployee(Employee employee);
	public Employee viewProfile(Employee employee) throws EmployeeException;
	public String changePassword(Employee employee)  throws EmployeeException;
	public String updateProfile(Employee employee) throws EmployeeException;
	public String transferDepartment(Employee employee) throws EmployeeException;
}
