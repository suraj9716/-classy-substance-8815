package utility;

public class Loading {
	
	public static void loding() {
		
    	System.out.println();
    	System.out.print("Loading");
        for(int i=0; i<5; i++) {
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
