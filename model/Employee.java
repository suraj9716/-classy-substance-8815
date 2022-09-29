package model;

import java.sql.Date;

public class Employee {
	
	private int id;
	private String firstName;
	private String lastName;
	private String password;
	private String mobile;
	private String email;
	private String dateOfBirth;
	private String address;
	private int salary;
	private String hireDate;
	private int departmentID;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String firstName, String lastName, String password, String mobile, String email,
			String dateOfBirth, String address, int salary, String hireDate, int departmentID) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.mobile = mobile;
		this.email = email;
		this.dateOfBirth = dateOfBirth;
		this.address = address;
		this.salary = salary;
		this.hireDate = hireDate;
		this.departmentID = departmentID;
	}
	
	public Employee(String firstName, String lastName, String password, String mobile, String email,
			String dateOfBirth, String address, int salary, String hireDate, int departmentID) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.mobile = mobile;
		this.email = email;
		this.dateOfBirth = dateOfBirth;
		this.address = address;
		this.salary = salary;
		this.hireDate = hireDate;
		this.departmentID = departmentID;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getHireDate() {
		return hireDate;
	}
	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}
	public int getDepartmentID() {
		return departmentID;
	}
	public void setDepartmentID(int departmentID) {
		this.departmentID = departmentID;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", password=" + password
				+ ", mobile=" + mobile + ", email=" + email + ", dateOfBirth=" + dateOfBirth + ", address=" + address
				+ ", salary=" + salary + ", hireDate=" + hireDate + ", departmentID=" + departmentID + "]";
	}
	
	
	

}
