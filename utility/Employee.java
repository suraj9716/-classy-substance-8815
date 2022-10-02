package utility;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import exception.EmployeeException;
import usecase.RequestLeave;
import usecase.UpdateEmployeePassword;
import usecase.UpdateEmployeeProfile;
import usecase.ViewEmployeeProfile;

public class Employee {
	static Scanner sc = new Scanner(System.in);
	
	   public static model.Employee authenticate() throws EmployeeException {
		   
		   model.Employee emp = new model.Employee();
		   System.out.println("Enter your Email");
		   String email = sc.next();
		   
		   System.out.println("Enter your password");
		   String pass = sc.next();
		   Timer.loding();
		   System.out.println("\n");
		   try (Connection con = DButil.getConnection()){
			   
			PreparedStatement ps = con.prepareStatement("select * from employee where email =? and password=?");
			ps.setString(1, email);
			ps.setString(2, pass);
		   ResultSet rs = 	ps.executeQuery();
		
		   if(rs.next()) {
				emp.setId(rs.getInt("id"));
				emp.setFirstName(rs.getString("firstName"));
				emp.setLastName(rs.getString("lastName"));
				emp.setMobile(rs.getString("mobile"));
				emp.setEmail(rs.getString("email"));
				emp.setPassword(rs.getString("password"));
				emp.setDateOfBirth(rs.getString("dateOfBirth"));
				emp.setAddress(rs.getString("address"));
				emp.setSalary(rs.getInt("salary"));
				emp.setHireDate(rs.getString("hireDate"));
				emp.setDepartmentID(rs.getInt("departmentID"));
				return emp;  
		  }
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		   
		   return null;
	   }


		public static void employee(model.Employee emp) {
			  final String ANSI_RESET = "\u001B[0m";
			  final String ANSI_YELLOW = "\u001B[31m";
		
			while(true) {
				
				
				System.out.println(ANSI_YELLOW+"┌───── •✧✧• ─────────────────────┐\r\n"
						+ " 1 - To View Profile  - \r\n"
						+ " 2 - Update your profile     \r\n"
						+ " 3 - Change your password       \r\n"
						+ " 4 - Request For leave       \r\n"
						+ " 5 - Exit       \r\n"
						+ "└───── •✧✧• ─────────────────────┘"+ANSI_RESET);
				
				
				int ch = sc.nextInt();
				if(ch==1) {
					ViewEmployeeProfile.main(emp);
				}
				if(ch==2) {
					UpdateEmployeeProfile.main(emp);
				}
				if(ch==3) {
					UpdateEmployeePassword.main(emp);
				}
				if(ch==4) {
					RequestLeave.main(emp.getId());
				}
				if(ch==5) {
					return;
				}
	
			}
		}

}
