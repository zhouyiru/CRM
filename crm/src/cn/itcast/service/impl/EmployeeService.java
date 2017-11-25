package cn.itcast.service.impl;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.itcast.dao.IEmployeeDao;
import cn.itcast.pojo.Employee;
import cn.itcast.service.IEmployeeService;
@Service
// 员工服务层接口
public class EmployeeService implements IEmployeeService {
	
	@Resource 
	private IEmployeeDao employeeDao;
	

	
	public void delete(Serializable id) {
		employeeDao.delete(id);
	}

	
	public Employee findById(Serializable id) {
		return employeeDao.findById(id);
	}

	
	public List<Employee> getAll() {
		List<Employee> list = employeeDao.getAll();
		return list;
	}

	
	public void save(Employee t) {
		employeeDao.save(t);
	}

	
	public void update(Employee t) {
		employeeDao.update(t);
	}
	
	
	public Employee login(Employee employee) {
		// hql
		String hql = "from Employee where name=? and password=?";
		// 调用dao条件查询的方法
		List<Employee> list = employeeDao.getByCondition(hql, employee.getName(),employee.getPassword());
		// 判断
		if (list != null && list.size() > 0) {
			// 登陆成功，返回集合的第一个元素
			return list.get(0);
		}
		// 登陆失败
		return null;
	}

}







