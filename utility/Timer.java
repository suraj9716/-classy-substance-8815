package utility;

public class Timer {
	
	public static void loding() {
		  final String ANSI_RESET = "\u001B[0m";
		  final String ANSI_YELLOW = "\u001B[32m";
		  
		  
    	System.out.println();
    	System.out.print(ANSI_YELLOW+"Loading"+ANSI_RESET);
        for(int i=0; i<5; i++) {
        	System.out.print(ANSI_YELLOW +"."+ANSI_RESET);
        	try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
    }

}
