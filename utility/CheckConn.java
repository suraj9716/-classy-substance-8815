package utility;

import java.sql.Connection;

public class CheckConn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection con = DButil.getConnection();
		if(con!=null) {
			System.out.println("connected");
		}
		else {
			System.out.println("not conn");
		}
	}

}
