package model;

public class LeaveDTO {
	private int id;
	private String name;
	private String leavefrom;
	private String leavetill;
	private String status;
	public LeaveDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LeaveDTO(int id, String name, String leavefrom, String leavetill, String status) {
		super();
		this.id = id;
		this.name = name;
		this.leavefrom = leavefrom;
		this.leavetill = leavetill;
		this.status = status;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLeavefrom() {
		return leavefrom;
	}
	public void setLeavefrom(String leavefrom) {
		this.leavefrom = leavefrom;
	}
	public String getLeavetill() {
		return leavetill;
	}
	public void setLeavetill(String leavetill) {
		this.leavetill = leavetill;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "LeaveDTO [id=" + id + ", name=" + name + ", leavefrom=" + leavefrom + ", leavetill=" + leavetill
				+ ", status=" + status + "]";
	}
	
	

}
