import java.util.Scanner;

import exception.EmployeeException;
import utility.Admin;
import utility.Employee;
import utility.Timer;

public class Main {

	public static void main(String[] args)  {
		  final String ANSI_RESET = "\u001B[0m";
			 final String ANSI_YELLOW = "\u001B[31m";
			 final String ANSI_YE = "\u001B[33m";
		
	
		
							System.out.println("                             \r\n"
									+ "               ██████████             \r\n"
									+ "              ████████████             \r\n"
									+ "              ██        ██              \r\n"
									+ "              ██▄▄▄▄▄▄▄▄▄█              \r\n"
									+ "              ██▀███─███▀█              \r\n"
									+ "█             ▀█        █▀            \r\n"
									+ "██                 █                  \r\n"
									+ " █              ██                    \r\n"
									+ "█▄            ████ ██  ████              \r\n"
									+ " ▄███████████████  ██  ██████          \r\n"
									+"         |                 |             \r\n"
						+ ANSI_YE+    "██╗░░██╗██████╗░  ███╗░░░███╗░█████╗░███╗░░██╗░█████╗░░██████╗░███████╗███╗░░░███╗███████╗███╗░░██╗████████╗\r\n"
									+ "██║░░██║██╔══██╗  ████╗░████║██╔══██╗████╗░██║██╔══██╗██╔════╝░██╔════╝████╗░████║██╔════╝████╗░██║╚══██╔══╝\r\n"
									+ "███████║██████╔╝  ██╔████╔██║███████║██╔██╗██║███████║██║░░██╗░█████╗░░██╔████╔██║█████╗░░██╔██╗██║░░░██║░░░\r\n"
									+ "██╔══██║██╔══██╗  ██║╚██╔╝██║██╔══██║██║╚████║██╔══██║██║░░╚██╗██╔══╝░░██║╚██╔╝██║██╔══╝░░██║╚████║░░░██║░░░\r\n"
									+ "██║░░██║██║░░██║  ██║░╚═╝░██║██║░░██║██║░╚███║██║░░██║╚██████╔╝███████╗██║░╚═╝░██║███████╗██║░╚███║░░░██║░░░\r\n"
									+ "╚═╝░░╚═╝╚═╝░░╚═╝  ╚═╝░░░░░╚═╝╚═╝░░╚═╝╚═╝░░╚══╝╚═╝░░╚═╝░╚═════╝░╚══════╝╚═╝░░░░░╚═╝╚══════╝╚═╝░░╚══╝░░░╚═╝░░░"+ ANSI_RESET
									+"\r\n"
						 +ANSI_YELLOW+ "█░█░█ █▀▀ █░░ █▀▀ █▀█ █▀▄▀█ █▀▀   ▀█▀ █▀█   █░█ █▀█   █▀▄▀█ ▄▀█ █▄░█ ▄▀█ █▀▀ █▀▀ █▀▄▀█ █▀▀ █▄░█ ▀█▀   █▀ █▄█ █▀ ▀█▀ █▀▀ █▀▄▀█\r\n"
									+ "▀▄▀▄▀ ██▄ █▄▄ █▄▄ █▄█ █░▀░█ ██▄   ░█░ █▄█   █▀█ █▀▄   █░▀░█ █▀█ █░▀█ █▀█ █▄█ ██▄ █░▀░█ ██▄ █░▀█ ░█░   ▄█ ░█░ ▄█ ░█░ ██▄ █░▀░█ "+ ANSI_RESET
									+"          |                |          \r\n"
									+"          |                |          \r\n"
									+ "    █████████████  ██  █████████\r\n"
									+ "             ████  ██ █████  ███\r\n"
									+ "              ███  ██ █████  ███\r\n"
									+ "              ███     █████████\r\n"
									+ "              ██    ████████▀\r\n"
									+ "                ██████████\r\n"
									+ "                ██████████\r\n"
									+ "                 ████████\r\n"
									+ "                  ██████████▄▄\r\n"
									+ "                   █████████▀\r\n"
									+ "                    ████  ███\r\n"
									+ "                    ▄████▄  ██\r\n"
									+ "                    ██████   ▀\r\n"
									+ "                    ▀▄▄▄▄▀\r\n"
									+ ""
									+ "");
					
//							admin credintials
							String login = "suraj";
							String pass = "1234";
							
							Scanner sc = new Scanner(System.in);
	
//	
							while(true) {
				           
								System.out.println(ANSI_YELLOW+"┌───── •✧✧• ───────────┐\r\n"
										+ " 1 - ADMIN LOGIN- \r\n"
										+ " 2 - EMPLOYEE LOGIN      \r\n"
										+ " 3 - EXIT                \r\n"
										+ "└───── •✧✧• ───────────┘"+ANSI_RESET);
								
								
							
								System.out.println("Enter your choice");
							
							int ch = sc.nextInt();
							switch (ch) {
							case 1: 
								System.out.println("Enter admin username");
								String uname= sc.next();
								
								System.out.println("Enter password");
								String upass = sc.next();
								 Timer.loding();
								  System.out.println("\n");
								
								if(uname.equals(login) && upass.equals(pass)) {
									System.out.println("Welcome to admin pannel");
									Admin.admin(null);
								}
								else {
									System.out.println("Wrong credintials");
								
								}
								break;
							case 2:
								try {
									model.Employee emp = Employee.authenticate();
									
									if(emp == null) {
										System.out.println("Worng Crenditials");
									}
									else {
										Employee.employee(emp);
									}
									
								} catch (EmployeeException e) {
									// TODO Auto-generated catch block
									System.out.println(e.getMessage());
								}
						     
						    
						     break;
							case 3:
								System.out.println("Thanks for choosing Suraj HR managenet system");
								return;
								
							default:
								System.out.println("wrong Credintials");
								
							}
							}
	}
	

}
