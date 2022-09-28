package dao;

import java.sql.Connection;
import java.sql.SQLException;

import model.Employee;
import utility.DButil;

public class EmployeeDaoImpl implements EmployeeDAO {

	@Override
	public String registerEmployee(Employee employee) {
		String message = "Not registered";
		
		try(Connection con = DButil.getConnection()) {
			
			con.prepareCall("insert into employee(firstname)");
			
			
		} catch (SQLException e) {
			// TODO: handle exception
		}
		
		
		
		return message;
	}

}
