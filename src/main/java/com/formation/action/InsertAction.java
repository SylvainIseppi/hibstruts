package com.formation.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;
import org.apache.struts2.convention.annotation.Results;
import org.springframework.beans.factory.annotation.Autowired;

import com.formation.daos.EmployeeDAO;
import com.formation.entity.EmployeeEntity;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

@Action("/insert")
@ResultPath("/WEB-INF/pages")
@Results({
	@Result(name = "success", type="redirectAction", params={"namespace","/" ,"actionName" ,"/index" }),	
})
public class InsertAction extends ActionSupport implements ModelDriven<EmployeeEntity>{

	private static final long serialVersionUID = 1L;
	private EmployeeEntity employe;
	
	@Autowired
	private EmployeeDAO employeDAO ;
	
	public EmployeeDAO getEmployeDAO() {
		return employeDAO;
	}

	public void setEmployeDAO(EmployeeDAO employeDAO) {
		this.employeDAO = employeDAO;
	}

	@Override
	public String execute()throws Exception {
		EmployeeEntity employee = new EmployeeEntity(this.employe.getFirstname(), this.employe.getLastname(), this.employe.getEmail());
		employeDAO.addEmployee(employee);
		
		return SUCCESS;
	}

	public EmployeeEntity getEmploye() {
		return employe;
	}

	public void setEmploye(EmployeeEntity employe) {
		this.employe = employe;
	}

	@Override
	public EmployeeEntity getModel() {
		// TODO Auto-generated method stub
		return employe;
	}


	
	
}
