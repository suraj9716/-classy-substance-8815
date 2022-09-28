package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import exception.DepartmentException;
import model.Department;
import model.Employee;
import utility.DButil;

public class DepartmentDaoImpl implements DepartmentDAO{
	
//	register a new department
	@Override
	public String registerDepartment(Department department) {
		 String message = "not Inserted";
		 
		 try(Connection con = DButil.getConnection()) {
		 PreparedStatement ps =	 con.prepareStatement("insert into department(name) values(?)");
			 ps.setString(1,department.getName());
			 int x = ps.executeUpdate();
			 if(x>0) {
				 System.out.println("New Deraptment Added Successfully");
			 }
			
		} catch (SQLException e) {
			message = e.getMessage();
		}
		 
		 return message;
	}

	
//view all department
	@Override
	public List<Department> viewDepartment() throws DepartmentException {
		List<Department> deptList = new ArrayList<>();
		
		try(Connection con = DButil.getConnection()) {
			 PreparedStatement ps =	 con.prepareStatement("select * from department");
			ResultSet rs =  ps.executeQuery();
			while(rs.next()) {
				int did = rs.getInt("id");
				String dname = rs.getString("name");
				
				Department dept = new Department(did,dname);
				deptList.add(dept);
			}
			
		} catch (SQLException e) {
			throw new DepartmentException(e.getMessage());
		}
		
		if(deptList.size()==0) {
			throw new DepartmentException("No department found");
		}
		
		return deptList;
		
		
		
	}


	@Override
	public String updateDepartment(Department department) throws DepartmentException {
		String message = "No department found";
		
		try(Connection con = DButil.getConnection()) {
			
		PreparedStatement ps = 	con.prepareStatement(" update department set name = ? where id = ?;");
			ps.setString(1, department.getName());
			ps.setInt(2, department.getId());
			
			int x  = ps.executeUpdate();
			if(x>0) {
				message = "department updated";
			}
		
		} catch (Exception e) {
			throw new DepartmentException(e.getMessage());
		}
		
		return message;
	}


	@Override
	public String registerEmployee(Employee employee) {
		String message = "Not Inserted";
		
		try(Connection con = DButil.getConnection()) {
			
			con.prepareStatement("insert into employee(firstName,lastName,password,mobile,email,password,dateOfBirth,address,salary,hireDate,departmentID) values(?,?,?,?,?,?,?,?,?,?,?)");
			
			 ps.setString(1, employee.getFirstName());
				ps.setString(2, employee.getLastName());
				ps.setString(3, employee.getMobile());
				ps.setString(4, employee.getEmail());
				ps.setString(5, employee.getPassword());
				ps.setString(6, employee.getDateOfBirth());
				ps.setString(7, employee.getAddress());
				ps.setInt(8, employee.getSalary());
				ps.setString(9, employee.getHireDate());
				ps.setInt(10, employee.getDepartmentID());
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return message;
		
		
	}




}
