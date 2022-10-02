package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Leave;
import model.LeaveDTO;
import utility.DButil;
import utility.Employee;

public class EmployeeLeaveDaoImpl implements EmployeeLeaveDAO {

	@Override
	public String requestLeave(int id, String startDate, String endDate) {
		String message="not applied for leave";
		  
		
		try (Connection con=DButil.getConnection()){
			
			PreparedStatement ps=con.prepareStatement("insert into leaves(empID,leavefrom,leavetill) values(?,?,?);");
			
			ps.setInt(1, id);
			ps.setString(2, startDate);
			ps.setString(3, endDate);
			
			int x=ps.executeUpdate();
			
			if(x>0) {
				message="Successfully applied for leave";
			}
			
		} catch (SQLException e) {
			message=e.getMessage();
		}
	  
	 
		
		return message;
	}

	@Override
	public String approveLeave(int id) {
		String message="Not Approved";
		try(Connection con = DButil.getConnection()) {
			
		PreparedStatement ps = 	con.prepareStatement("update leaves set status='Approved' where empid=?");
		ps.setInt(1, id);
		int x =  ps.executeUpdate();
		if(x>0) {
			message="Approved";
		}	
			
		} catch (SQLException e) {
			message = e.getMessage();
		}
		
		return message;
	}

	@Override
	public String rejectLeave(int id) {
		String message="Not Rejected";
		
    try(Connection con=DButil.getConnection()) {
			
			PreparedStatement ps=con.prepareStatement("update leaves set status='Rejected' where empid=?");
			
			ps.setInt(1, id);
			
			int x=ps.executeUpdate();
			if(x>0) {
				message="Rejected";
			}
			
		} catch (SQLException e) {
			message=e.getMessage();
		}
		return message;
		
	}

	@Override
	public List<Leave> pendingLeaves() {
		List<Leave> list=new ArrayList<>();
		
		try(Connection con=DButil.getConnection()) {
			
			PreparedStatement ps=con.prepareStatement("select * from Leaves where status='not approved';");
			
			ResultSet rs=ps.executeQuery();
			
			while(rs.next()) {
				Leave leave=new Leave();
				leave.setEmployeeId(rs.getInt("empid"));
				leave.setStartDate(rs.getString("leavefrom"));
				leave.setEndDate(rs.getString("leavetill"));
				leave.setStatus(rs.getString("status"));
				
				list.add(leave);
			}
			
		} catch (SQLException e) {}
		
		return list;
	}

	@Override
	public List<LeaveDTO> viewAllLeaves() {
		List<LeaveDTO> list = new ArrayList<>();
		
		try(Connection con = DButil.getConnection()) {
			  PreparedStatement ps =   con.prepareStatement("select e.id, e.firstname, l.leavefrom,l.leavetill,l.status from employee e, leaves l where e.id=l.empid");
			 ResultSet rs =  ps.executeQuery();
			 while(rs.next()) {
				 LeaveDTO leave = new LeaveDTO();
				 leave.setId(rs.getInt("id"));
				 leave.setName(rs.getString("firstname"));
				 leave.setLeavefrom(rs.getString("leavefrom"));
				 leave.setLeavetill(rs.getString("leavetill"));
				 leave.setStatus(rs.getString("status"));
				 
				 list.add(leave);
			 }
			  
		} catch ( SQLException e) {
			// TODO: handle exception
		}
		
		return list;
	}

}
