package dao;

public interface EmployeeLeaveDAO {
	
	public String requestLeave(int id, String startDate, String endDate);
	public String approveLeave(int id);
	public String rejectLeave(int id);

}