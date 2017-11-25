package cn.itcast.web;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;

import cn.itcast.pojo.Employee;
import cn.itcast.utils.UserContext;

/**
 * 登陆
 * @author AdminTH
 *
 */
@Controller
@Scope("prototype")
public class LoginAction extends BaseAction{
	
	// 封装登陆员工信息
	private Employee employee;
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public Employee getEmployee() {
		return employee;
	}

	// 登陆
	public String login()  {
		// 调用service登陆
		Employee emp = employeeService.login(employee);
		// 判断
		if (emp != null) {
			// 登陆成功, 保存到session
			UserContext.setUser(emp);
			return SUCCESS;
		}else {
			// 登陆失败，需要更多的输入(input)
			return INPUT;
		}
	}
	
	// 退出
	public String out()  {
		// 退出
		UserContext.out();
		// 退出后去到登陆页面
		return INPUT;  
	}
}








