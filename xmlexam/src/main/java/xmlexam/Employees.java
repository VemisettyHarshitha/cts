package xmlexam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class Employees {
	int id;
	String name;
     
	Department department;
	public Employees() {
	}
	public Employees(int id, String name, Department department) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
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
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "Employees [id=" + id + ", name=" + name + ", department=" + department + "]";
	}
	
	
}
