package cn.itcast.web;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.itcast.pojo.Department;
import cn.itcast.pojo.Employee;

/*
 * 员工模块
 * 1. 进入添加员工页面
 * 2. 列表功能
 * 3. 添加员工信息
 * 4. 修改功能
 * 	  
 */
@Controller
@Scope("prototype")
public class EmployeeAction extends BaseAction {
	
	public EmployeeAction(){
		System.out.println("-----------------> EmployeeAction.EmployeeAction()");
	}
	
	// 封装请求数据
	private Employee employee;
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public Employee getEmployee() {
		return employee;
	}

	@Override
	public String execute() throws Exception {
		return super.execute();
	}
	
	
	// 1. 进入添加员工页面 
	public String viewEdit(){
		
		/********判断是否是进入编辑页面，如果是那就根据主键查询，最后jsp在数据回显**********/
		if (employee != null) {
			// 主键查询
			employee = employeeService.findById(employee.getId());
		}
		
		/********进入添加页面**********/
		// 查询所有的部门
		List<Department> listDept = departmentService.getAll();
		// 保存
		request.put("listDept", listDept);
		// 跳转到添加页面
		return "viewEdit";
	}
	
	// 2. 员工列表
	public String list(){
		// 查询所有员工信息
		List<Employee> listEmp = employeeService.getAll();
		listEmp.size();
		// 保存
		request.put("listEmp", listEmp);
		return "list";
	}
	
	// 3. 添加员工信息
	public String save() {
		employeeService.save(employee);
		return "edit";
	}
	
	// 4. 修改
	public String update() {
		employeeService.update(employee);
		return "edit";
	}
}













