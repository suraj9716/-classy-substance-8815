package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.mysql.cj.protocol.Resultset;

import exception.EmployeeException;
import model.Employee;
import model.EmployeeDepartmentDTO;
import utility.DButil;

public class EmployeeDaoImpl implements EmployeeDAO {

	@Override
	public String registerEmployee(Employee employee) {
		String message = "Not Inserted";
		
		try(Connection con = DButil.getConnection()) {
			
			
		PreparedStatement ps=con.prepareStatement("insert into employee(firstName,lastName,password,mobile,email,dateOfBirth,address,salary,hireDate,departmentID) values(?,?,?,?,?,?,?,?,?,?)");
			
			    ps.setString(1, employee.getFirstName());
				ps.setString(2, employee.getLastName());
				ps.setString(3, employee.getPassword());
				ps.setString(4, employee.getMobile());
				ps.setString(5, employee.getEmail());
				
				ps.setString(6, employee.getDateOfBirth());
				ps.setString(7, employee.getAddress());
				ps.setInt(8, employee.getSalary());
				ps.setString(9, employee.getHireDate());
				ps.setInt(10, employee.getDepartmentID());
				
				int x = ps.executeUpdate();
				if(x>0) {
					message = "Record inserted Successfully";
				}
				else {
					message = "Check all parameter correctly";
				}
			
		} catch (Exception e) {
			message = e.getMessage();
		}
		
		return message;
		
		
	}	

	@Override
	public Employee viewProfile(Employee employee) throws EmployeeException {
	
		
		try(Connection con = DButil.getConnection()){

			
		PreparedStatement ps = con.prepareStatement("select * from employee where firstname = ? and password = ?");
		ps.setString(1, employee.getFirstName());
		ps.setString(2, employee.getPassword());
//		firstName,lastName,password,mobile,email,dateOfBirth,address,salary,hireDate,departmentID
		ResultSet rs = ps.executeQuery();
		if(rs.next()) {
			int roll = rs.getInt("id");
			String fname = rs.getString("firstname");
			String lname = rs.getString("lastname");
			String pass = rs.getString("password");
			String mobile = rs.getString("mobile");
			String dob = rs.getString("dateOfBirth");
			String add = rs.getString("address");
			int sal = rs.getInt("Salary");
			String hdate = rs.getString("hireDate");
			int did = rs.getInt("departmentID");
			
			employee = new Employee(did, fname, lname, pass, mobile, dob, hdate, add, sal, hdate, did);
			
		}
		else {
			throw new EmployeeException("Employee with this name and password does not exist");
		}
		
			
		} catch (SQLException e) {
			throw new EmployeeException("Employee with this name and password does not exist");
			
		}
		return employee;
	}

	@Override
	public String changePassword(Employee employee) throws EmployeeException {
		
		String message = "password is incorrect";
		try (Connection con = DButil.getConnection()){
			PreparedStatement ps = con.prepareStatement("select * from employee where id = ?");
		    ps.setInt(1, employee.getId());
//			ps.setString(2, employee.getPassword());
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				
				Scanner sc = new Scanner(System.in);
				
				System.out.println("Enter existing password");
				String pass = sc.next();
				if(pass.equals(rs.getString("password"))) {
					message = changePass(employee);
				}
				else {
					message = "Incorrect password";
				}

			}
			else {
				return "Employee Id not found";
			}
			
			
		} catch (Exception e) {
		System.out.println(e.getMessage());
		}
		
		return message;
		
	}

	private String changePass(Employee employee) {
		String msg = "password not updated";
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter new password");
		String npass = sc.next();
		employee.setPassword(npass);
		
		try (Connection con = DButil.getConnection()){
		PreparedStatement ps = con.prepareStatement("update employee set password =? where id = ?");
		ps.setString(1, employee.getPassword());
		ps.setInt(2, employee.getId());
		
		int rs = ps.executeUpdate();
		if(rs>0) {
			msg = "password updated sucessfully";
		}
	
			
		} catch (Exception e) {
		 msg = e.getMessage();
		}
		
	   return msg;
		
	}

	@Override
	public String updateProfile(Employee employee) throws EmployeeException {
		 String message = null;
		 
		 try(Connection con = DButil.getConnection()) {
			 
		PreparedStatement ps = con.prepareStatement("select * from employee where id = ?");
			 ps.setInt(1, employee.getId());
			 
			ResultSet rs =  ps.executeQuery();
			if(rs.next()) {
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter your password");
				String pass = sc.next();
				if(pass.equals(rs.getString("password"))) {
//					update profile logic
					
					try(Connection con1 = DButil.getConnection()) {
						
						System.out.println("┌───── •✧✧• ──────────────────────────────┐\r\n"
								+ " 1 - Change your First name  - \r\n"
								+ " 2 - Change your Last name     \r\n"
								+ " 3 - Change your password       \r\n"
								+ " 4 - Change your Mobile Number       \r\n"
								+ " 5 - Change your Email id       \r\n"
								+ " 6 - Change your DOB put in yyyy-mm-dd Format       \r\n"
								+ " 7 - Change your Address      \r\n"
								+ " 8 - Exit       \r\n"
								+ "└───── •✧✧• ──────────────────────────────┘");
					
						while(true) {
							System.out.println("Enter your choice what you want to update");
							int ch = sc.nextInt();
//						first name updation
							if(ch==1) {
							
						PreparedStatement ps1 = con.prepareStatement(" update employee set firstname =? where id = ?");
						System.out.println("Enter New First Name");
						String nn = sc.next();
						ps1.setString(1, nn);
						ps1.setInt(2, employee.getId());
						
					      int x = ps1.executeUpdate();
					      
					      if(x>0) {
					    	System.out.println("First name updated");
					    	 
					      }
					      else {
					    	  throw new EmployeeException("unable to update");
					      }
						}
//							second name updation
							if(ch==2) {
								
								PreparedStatement ps1 = con.prepareStatement(" update employee set lastname =? where id = ?");
								System.out.println("Enter New Second Name");
								String nn = sc.next();
								ps1.setString(1, nn);
								ps1.setInt(2, employee.getId());
								
							      int x = ps1.executeUpdate();
							      
							      if(x>0) {
							    	System.out.println("Second name updated");
							    	 
							      }
							      else {
							    	  throw new EmployeeException("unable to update");
							      }
								}
							
//							update password
	                              if(ch==3) {
								
								PreparedStatement ps1 = con.prepareStatement(" update employee set password =? where id = ?");
								System.out.println("Enter new password");
								String nn = sc.next();
								ps1.setString(1, nn);
								ps1.setInt(2, employee.getId());
								
							      int x = ps1.executeUpdate();
							      
							      if(x>0) {
							    	System.out.println("Password updated");
							    	 
							      }
							      else {
							    	  throw new EmployeeException("unable to update");
							      }
								}
	                              
//	                        mobile update
	                              if(ch==4) {
	  								
	  								PreparedStatement ps1 = con.prepareStatement(" update employee set mobile =? where id = ?");
	  								System.out.println("Enter New Mobile Number");
	  								String nn = sc.next();
	  								ps1.setString(1, nn);
	  								ps1.setInt(2, employee.getId());
	  								
	  							      int x = ps1.executeUpdate();
	  							      
	  							      if(x>0) {
	  							    	System.out.println("Mobile number updated");
	  							    	 
	  							      }
	  							      else {
	  							    	  throw new EmployeeException("unable to update");
	  							      }
	  								}
//	                              update email
	                              if(ch==5) {
		  								
		  								PreparedStatement ps1 = con.prepareStatement(" update employee set email =? where id = ?");
		  								System.out.println("Enter New Email ID Number");
		  								String nn = sc.next();
		  								ps1.setString(1, nn);
		  								ps1.setInt(2, employee.getId());
		  								
		  							      int x = ps1.executeUpdate();
		  							      
		  							      if(x>0) {
		  							    	System.out.println("Email ID updated");
		  							    	 
		  							      }
		  							      else {
		  							    	  throw new EmployeeException("unable to update");
		  							      }
		  								}
//	                              update date of birth
	                              if(ch==6) {
		  								
		  								PreparedStatement ps1 = con.prepareStatement(" update employee set dateofbirth =? where id = ?");
		  								System.out.println("Enter Date of birth in yyyy-mm-dd format");
		  								String nn = sc.next();
		  								ps1.setString(1, nn);
		  								ps1.setInt(2, employee.getId());
		  								
		  							      int x = ps1.executeUpdate();
		  							      
		  							      if(x>0) {
		  							    	System.out.println("Date of birth updated");
		  							    	 
		  							      }
		  							      else {
		  							    	  throw new EmployeeException("unable to update");
		  							      }
		  								}
//	                              address update
	                              if(ch==7) {
		  								
		  								PreparedStatement ps1 = con.prepareStatement(" update employee set address =? where id = ?");
		  								System.out.println("Enter your new address");
		  								String nn = sc.next();
		  								ps1.setString(1, nn);
		  								ps1.setInt(2, employee.getId());
		  								
		  							      int x = ps1.executeUpdate();
		  							      
		  							      if(x>0) {
		  							    	System.out.println("Address updated");
		  							    	 
		  							      }
		  							      else {
		  							    	  throw new EmployeeException("unable to update");
		  							      }
		  								}
	                              if(ch==8) {
	                            	  return "Thankyou";
	                            	  
	                              }
							
						}
						
					} catch (Exception e) {
						// TODO: handle exception
					}
			
					
				}
				else {
					message = "Incorrect password";
				}

			}
			else {
				return "Employee Id not found";
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return message;
	}

//	@Override
//	public String transferDepartment(Employee employee) throws EmployeeException {
//		String message = null;
//		
//		try(Connection con = DButil.getConnection()){
//			
//			PreparedStatement ps = con.prepareStatement("update employee set departmentid = ? where id =?");
//			ps.setInt(1, employee.getDepartmentID());
//			ps.setInt(2, employee.getId());
//			
//			int x = ps.executeUpdate();
//			if(x>0) {
//				message = "Department changed successfully";
//			}
//			else {
//				throw new EmployeeException("No employee exist with this id");
//			}
//			
//			
//		} catch ( SQLException e) {
//			message = e.getMessage();
//		}
//		
//		return message;
//		
//		
//	}
	@Override
	public String transferDepartment(Employee employee) throws EmployeeException {
		String message = null;
		Scanner sc = new Scanner(System.in);
		try(Connection con = DButil.getConnection()){
			
			PreparedStatement ps = con.prepareStatement("select * from employee where id =?");
			ps.setInt(1, employee.getId());
			
		ResultSet rs = 	ps.executeQuery();
		if(rs.next()) {
//			message = "connected";

		System.out.println("Enter department number in which you want to transfer");
		 int did = sc.nextInt();
		 PreparedStatement ps1 = con.prepareStatement("update employee set departmentid = ? where id =?");
		 ps1.setInt(1, did);
		 ps1.setInt(2, employee.getId());
		 int x = ps1.executeUpdate();
		 if(x>0) {
			 message = "Employee Department changed successfully";
		 }
		 else {
			 throw new EmployeeException("Employee already in same department");
		 }
			
		}
		else {
			return "Employee Id not found";
		}
			
			
		} catch ( SQLException e) {
			message = "No department found";
		}
		
		return message;
		
		
	}
	
	
	public List<Employee> getAllEmployee() throws EmployeeException {
		List<Employee> list=new ArrayList<>();
		
		try(Connection con=DButil.getConnection()) {
			
			PreparedStatement ps=con.prepareStatement("select * from employee");
			
			ResultSet rs=ps.executeQuery();
			
			while(rs.next()) {
				Employee e=new Employee();
				e.setId(rs.getInt("id"));
				e.setFirstName(rs.getString("firstName"));
				e.setLastName(rs.getString("lastName"));
				e.setMobile(rs.getString("mobile"));
				e.setEmail(rs.getString("email"));
				e.setPassword(rs.getString("password"));
				e.setDateOfBirth(rs.getString("dateOfBirth"));
				e.setAddress(rs.getString("address"));
				e.setSalary(rs.getInt("salary"));
				e.setHireDate(rs.getString("hireDate"));
				e.setDepartmentID(rs.getInt("departmentID"));
				
				list.add(e);
			}
			
		} catch (SQLException e) {
			throw new EmployeeException(e.getMessage());
		}
		
		if(list.size()==0) {
			throw new EmployeeException("List is empty");
		}
		
		return list;
	}

	@Override
	public List<EmployeeDepartmentDTO> viewEmployeeDepartment() throws EmployeeException {
		List<EmployeeDepartmentDTO> list = new ArrayList<>();
		
		try(Connection con = DButil.getConnection()){
			PreparedStatement ps=con.prepareStatement("select e.id, e.firstname, d.name from employee e, department d where d.id = e.departmentid");
			
		ResultSet rs =	ps.executeQuery();
		while(rs.next()) {
			EmployeeDepartmentDTO emp = new EmployeeDepartmentDTO();
			emp.setId(rs.getInt("id"));
			emp.setName(rs.getString("firstname"));
			emp.setDept(rs.getString("name"));
			list.add(emp);
		}
			
			
		}catch (SQLException e) {
			throw new EmployeeException(e.getMessage());
		}
		if(list.size()==0) {
			throw new EmployeeException("List is empty");
		}
		
		return list;
	}


}
