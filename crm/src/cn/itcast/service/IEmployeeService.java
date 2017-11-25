package cn.itcast.service;

import java.util.List;

import cn.itcast.pojo.Employee;


// 员工Service接口， 通过功能都继承父接口
public interface IEmployeeService extends IBaseService<Employee>{
	
	// 登陆业务处理方法
	Employee login(Employee employee);
}
