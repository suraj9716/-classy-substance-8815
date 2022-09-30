package utility;

public class Timer {
	
	public static void loding() {
    	System.out.println();
    	System.out.print("Loading");
        for(int i=0; i<10; i++) {
        	System.out.print(".");
        	try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
    }

}
