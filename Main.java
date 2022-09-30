import java.util.Scanner;

import utility.Admin;
import utility.Employee;

public class Main {

	public static void main(String[] args) {
		
		
	
		
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
									+ "██╗░░██╗██████╗░  ███╗░░░███╗░█████╗░███╗░░██╗░█████╗░░██████╗░███████╗███╗░░░███╗███████╗███╗░░██╗████████╗\r\n"
									+ "██║░░██║██╔══██╗  ████╗░████║██╔══██╗████╗░██║██╔══██╗██╔════╝░██╔════╝████╗░████║██╔════╝████╗░██║╚══██╔══╝\r\n"
									+ "███████║██████╔╝  ██╔████╔██║███████║██╔██╗██║███████║██║░░██╗░█████╗░░██╔████╔██║█████╗░░██╔██╗██║░░░██║░░░\r\n"
									+ "██╔══██║██╔══██╗  ██║╚██╔╝██║██╔══██║██║╚████║██╔══██║██║░░╚██╗██╔══╝░░██║╚██╔╝██║██╔══╝░░██║╚████║░░░██║░░░\r\n"
									+ "██║░░██║██║░░██║  ██║░╚═╝░██║██║░░██║██║░╚███║██║░░██║╚██████╔╝███████╗██║░╚═╝░██║███████╗██║░╚███║░░░██║░░░\r\n"
									+ "╚═╝░░╚═╝╚═╝░░╚═╝  ╚═╝░░░░░╚═╝╚═╝░░╚═╝╚═╝░░╚══╝╚═╝░░╚═╝░╚═════╝░╚══════╝╚═╝░░░░░╚═╝╚══════╝╚═╝░░╚══╝░░░╚═╝░░░"
									+"\r\n"
									+ "█░█░█ █▀▀ █░░ █▀▀ █▀█ █▀▄▀█ █▀▀   ▀█▀ █▀█   █░█ █▀█   █▀▄▀█ ▄▀█ █▄░█ ▄▀█ █▀▀ █▀▀ █▀▄▀█ █▀▀ █▄░█ ▀█▀   █▀ █▄█ █▀ ▀█▀ █▀▀ █▀▄▀█\r\n"
									+ "▀▄▀▄▀ ██▄ █▄▄ █▄▄ █▄█ █░▀░█ ██▄   ░█░ █▄█   █▀█ █▀▄   █░▀░█ █▀█ █░▀█ █▀█ █▄█ ██▄ █░▀░█ ██▄ █░▀█ ░█░   ▄█ ░█░ ▄█ ░█░ ██▄ █░▀░█"
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
					
							
							String login = "suraj";
							String pass = "1234";
							
							Scanner sc = new Scanner(System.in);
						
							
							
							
//	
							while(true) {
				           
								System.out.println("┌───── •✧✧• ───────────┐\r\n"
										+ " 1 - ADMIN LOGIN- \r\n"
										+ " 2 - EMPLOYEE LOGIN      \r\n"
										+ " 3 - EXIT                \r\n"
										+ "└───── •✧✧• ───────────┘");
							
								System.out.println("Enter your choice");
							
							int ch = sc.nextInt();
							switch (ch) {
							case 1: 
								System.out.println("Enter admin username");
								String uname= sc.next();
								
								System.out.println("Enter password");
								String upass = sc.next();
								
								if(uname.equals(login) && upass.equals(pass)) {
									System.out.println("Welcome to admin pannel");
									Admin.admin();
									
								}
								else {
									System.out.println("Wrong credintials");
								
								}
								break;
							case 2:
						     boolean flag = 	Employee.authenticate();
						     if(flag) {
						    	 Employee.employee();
						     }
						     else {
						    	 System.out.println("Wrong Credintial");
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
