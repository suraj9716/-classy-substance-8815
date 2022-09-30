package utility;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;
import usecase.RequestLeave;
import usecase.UpdateEmployeePassword;
import usecase.UpdateEmployeeProfile;
import usecase.ViewEmployeeProfile;

public class Employee {
	static Scanner sc = new Scanner(System.in);
	   public static boolean authenticate() {
		   System.out.println("Enter your Email");
		   String email = sc.next();
		   
		   System.out.println("Enter your password");
		   String pass = sc.next();
		   
		   try (Connection con = DButil.getConnection()){
			   
			PreparedStatement ps = con.prepareStatement("select * from employee where email =?");
			ps.setString(1, email);
		  ResultSet rs = 	ps.executeQuery();
		  if(rs.next()) {
			  String dbpass = rs.getString("password");
			  if(pass.equals(dbpass)) {
				 
				  return true;
			  }
		  }
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		   
		   return false;
	   }


		public static void employee() {
			
		
			while(true) {
				
				
				System.out.println("┌───── •✧✧• ─────────────────────┐\r\n"
						+ " 1 - To View Profile  - \r\n"
						+ " 2 - Update your profile     \r\n"
						+ " 3 - Change your password       \r\n"
						+ " 4 - Request For leave       \r\n"
						+ " 5 - Exit       \r\n"
						+ "└───── •✧✧• ─────────────────────┘");
				
				
				int ch = sc.nextInt();
				if(ch==1) {
					ViewEmployeeProfile.main(null);
				}
				if(ch==2) {
					UpdateEmployeeProfile.main(null);
				}
				if(ch==3) {
					UpdateEmployeePassword.main(null);
				}
				if(ch==4) {
					RequestLeave.main(null);
				}
				if(ch==5) {
					return;
				}
	
			}
		}

}
