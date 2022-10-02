package dao;

import java.util.List;

import model.Leave;
import model.LeaveDTO;

public interface EmployeeLeaveDAO {
	
	public String requestLeave(int id, String startDate, String endDate);
	public String approveLeave(int id);
	public String rejectLeave(int id);
	public List<Leave> pendingLeaves();
	public List<LeaveDTO> viewAllLeaves();

}
