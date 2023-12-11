package pojo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EMP {

	
	@Id
	int emp_id;
	
	String emp_name;
	
	int Salary;
	
	String city;

	public EMP() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EMP(int emp_id, String emp_name, int salary, String city) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		Salary = salary;
		this.city = city;
	}

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public int getSalary() {
		return Salary;
	}

	public void setSalary(int salary) {
		Salary = salary;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "EMP [emp_id=" + emp_id + ", emp_name=" + emp_name + ", Salary=" + Salary + ", city=" + city + "]";
	}
	
	
	
	
	
	
}
