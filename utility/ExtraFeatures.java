package utility;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import model.Employee;
import usecase.GetAllEmployee;

public class ExtraFeatures {
	
	public static void sortBySalary(List<Employee> emp){
		Collections.sort(emp, (a,b) -> b.getSalary() - a.getSalary());
//        System.out.println(emp);
		GetAllEmployee.main(emp);
	}
	
	public static void sortByName(List<Employee> emp){
		Collections.sort(emp, (a,b) -> a.getFirstName().compareTo(b.getFirstName()));
		
//        System.out.println(emp);
		GetAllEmployee.main(emp);
	}
	
	public static void filterBySalary(List<Employee> emp){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter salary of Employee Result will give you All employee list salary greater than that");
		int sal = sc.nextInt();
		Stream<Employee> em  = emp.stream();
		List<Employee> emp1 = em.filter(s -> s.getSalary()>sal).collect(Collectors.toList());
//        System.out.println(emp);
		GetAllEmployee.main(emp1);
	}
	


}
