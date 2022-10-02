package model;

public class Leave {
	
	int employeeId;
	String startDate;
	String endDate;
	String status;
	
	public Leave() {
		// TODO Auto-generated constructor stub
	}

	public Leave(int employeeId, String startDate, String endDate, String status) {
		super();
		this.employeeId = employeeId;
		this.startDate = startDate;
		this.endDate = endDate;
		this.status = status;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Leave [employeeId=" + employeeId + ", startDate=" + startDate + ", endDate=" + endDate + ", status="
				+ status + "]";
	}
	
	

}