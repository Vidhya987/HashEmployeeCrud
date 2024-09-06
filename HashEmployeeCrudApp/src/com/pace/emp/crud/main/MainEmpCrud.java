package com.pace.emp.crud.main;

import com.pace.emp.crud.bean.Employee;
import com.pace.emp.crud.dao.EmployeeCrud;
public class MainEmpCrud {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee vidhya=new Employee(1234,"vidhya",25000.25f);
		Employee arjun=new Employee(1245,"arjun",2500.34f);
		Employee arha=new Employee(1246,"arha",2488.45f);
		EmployeeCrud empCrud =new EmployeeCrud();
		empCrud.addEmployee(vidhya);
		empCrud.addEmployee(arjun);
		empCrud.addEmployee(arha);
		empCrud.showEmpList();
		empCrud.updateSalary();
		empCrud.showEmpList();
		empCrud.deletedEmployee(1234);
		empCrud.showEmpList();
		
		}
	

}
