package cn.itcast.service.impl;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import cn.itcast.dao.IDepartmentDao;
import cn.itcast.pojo.Department;
import cn.itcast.service.IDepartmentService;
@Repository
// Service接口实现
public class DepartmentService implements IDepartmentService{

	@Resource 
	private IDepartmentDao departmentDao;
	
	// 事务控制是在Service的方法上
	public void save(Department department) {
		departmentDao.save(department);
	}
	
	public Department findById(Serializable id) {
		return departmentDao.findById(id);
	}

	
	public void delete(Serializable id) {
		departmentDao.delete(id);
	}

	
	public List<Department> getAll() {
		return departmentDao.getAll();
	}

	
	public void update(Department department) {
		departmentDao.update(department);
	}

}
