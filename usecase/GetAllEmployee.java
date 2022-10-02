package usecase;

import java.util.List;
import java.util.Scanner;

import dao.EmployeeDAO;
import dao.EmployeeDaoImpl;
import exception.EmployeeException;
import model.Employee;
import utility.ExtraFeatures;

public class GetAllEmployee {
	
public static void main(model.Employee emp) {
		
		EmployeeDAO emp1=new EmployeeDaoImpl();
		
		try {
			List<Employee>list=emp1.getAllEmployee();
			main(list);
	       
			System.out.println("Extra Features");
			Scanner sc=new Scanner(System.in);
			  final String ANSI_RESET = "\u001B[0m";
				 final String ANSI_YELLOW = "\u001B[31m";
			while(true) {
				
				System.out.println(ANSI_YELLOW + "1. Sort Employee by Salary Highest First" + ANSI_RESET);
				System.out.println(ANSI_YELLOW+"2. Sort Employee by Name"+ ANSI_RESET);
				System.out.println(ANSI_YELLOW+"3. Filter Employee by salary"+ ANSI_RESET);
				System.out.println(ANSI_YELLOW + "4. Go Back"+ ANSI_RESET);
				int ch=sc.nextInt();
				
				switch(ch) {
				case 1:
				    ExtraFeatures.sortBySalary(list);
					break;
				case 2:
					ExtraFeatures.sortByName(list);
					break;
				case 3:
					ExtraFeatures.filterBySalary(list);
					break;
				case 4:
					return;
				default :
					System.out.println("Wrong Input");
				}
			}
			
		} catch (EmployeeException e) {
			System.out.println(e.getMessage());
		}

	}
	
	
	public static void main(List<Employee>list){  
 
		System.out.println("----------------------------------------------------------------------------------------------------------------------------------");  
		System.out.printf("%5s %5s %5s %5s %5s %5s %5s %5s %5s %5s %5s", "EMP ID | ", "FIRST NAME | ", "LAST NAME | ", "MOBILE | ", "E-MAIL ID | ", "PASSWORD | ","DATE OF BIRTH | ","ADDRESS | ", "SALARY | ","HIRE DATE | ","D ID");  
		System.out.println();  
		System.out.println("----------------------------------------------------------------------------------------------------------------------------------");  
		System.out.println();  
		for(Employee e: list){  
			System.out.format("%5s %12s %12s %12s %12s %10s %14s %10s %10s %14s %6s", e.getId(), e.getFirstName(), e.getLastName(), e.getMobile(), e.getEmail(), e.getPassword(), e.getDateOfBirth(),e.getAddress(),e.getSalary(),e.getHireDate(),e.getDepartmentID());  
			System.out.println(); 
			System.out.println();
		}  
		System.out.println("----------------------------------------------------------------------------------------------------------------------------------");  
	}  

}
