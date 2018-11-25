package gradle_jdbc_erp.dto;

import java.util.Date;

public class Employee {
	private String empNo;
	private String empName;
	private Title titleNo;
	private int salary;
	private Gender gender;
	private Department deptNo;
	private Date joinDate;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String empNo, String empName, Title titleNo, int salary, Gender gender, Department deptNo,
			Date joinDate) {
		this.empNo = empNo;
		this.empName = empName;
		this.titleNo = titleNo;
		this.salary = salary;
		this.gender = gender;
		this.deptNo = deptNo;
		this.joinDate = joinDate;
	}

	public Employee(String empNo) {
		this.empNo = empNo;
	}

	public String getEmpNo() {
		return empNo;
	}

	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Title getTitleNo() {
		return titleNo;
	}

	public void setTitleNo(Title titleNo) {
		this.titleNo = titleNo;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public Department getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(Department deptNo) {
		this.deptNo = deptNo;
	}

	public Date getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((empNo == null) ? 0 : empNo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (empNo == null) {
			if (other.empNo != null)
				return false;
		} else if (!empNo.equals(other.empNo))
			return false;
		return true;
	}

}
