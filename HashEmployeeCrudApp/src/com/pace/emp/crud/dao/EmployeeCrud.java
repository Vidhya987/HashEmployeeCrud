package com.pace.emp.crud.dao;

import java.util.HashSet;

import com.pace.emp.crud.bean.Employee;

public class EmployeeCrud {
	HashSet <Employee>empList=new HashSet<Employee>();
	public void addEmployee(Employee emp) {
		empList.add(emp);
	}
	public void showEmpList() {
		for(Employee emp:empList) {
			System.out.println(emp.getId());
			System.out.println(emp.getName());
			System.out.println(emp.getSalary());
			System.out.println("===================================================");
		}
	}
	public void updateSalary() {
		for(Employee emp:empList) {
			float salary=emp.getSalary();
			salary=salary+salary*20/100;
			emp.setSalary(salary);
			System.out.println("Salary has been Updated Sucessfully");
		}
	}
	public void deletedEmployee(int id) {
		boolean isAvalible=false;
		for(Employee emp:empList) {
			if(id==emp.getId()) {
				empList.remove(emp);
				isAvalible=true;
				break;
				
			}
		}if(isAvalible==true) {
			System.out.println("The employee with "+id+" has been deleted sucessfully!");
		}
		else {
			System.out.println("the employee with"+id+" has not found");
		}
	}
	
}
