package usecase;

import java.util.Collections;
import java.util.List;

import javax.sound.midi.VoiceStatus;

import com.mysql.cj.x.protobuf.MysqlxCrud.Collection;

import dao.EmployeeLeaveDAO;
import dao.EmployeeLeaveDaoImpl;
import model.LeaveDTO;

public class ViewAllLeaves {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EmployeeLeaveDAO emp = new EmployeeLeaveDaoImpl();
		 List<LeaveDTO> list = emp.viewAllLeaves();
//		syso
		 System.out.println("｡☆✼★━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━★✼☆｡");
		                               list.forEach(s-> System.out.println("||"+s+  "||"));
		  System.out.println("｡☆✼★━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━★✼☆｡");
		  
//		  Collections.sort(list, (a,b)-> a.getName().compareTo(b.getName()));
//		  
//		  list.forEach(s-> System.out.println("||"+s+  "||"));
		  
		  
	}

}
