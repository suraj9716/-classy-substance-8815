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


	



}
