package javaeight.predicate;

public class Employee {
	public String ename;
	public Long Salary;
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String ename, Long salary) {
		super();
		this.ename = ename;
		Salary = salary;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Long getSalary() {
		return Salary;
	}
	public void setSalary(Long salary) {
		Salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [ename=" + ename + ", Salary=" + Salary + "]";
	}	
	
	
	
}
