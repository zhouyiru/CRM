package cn.itcast.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import cn.itcast.dao.IEmployeeDao;
import cn.itcast.pojo.Employee;
@Repository
public class EmployeeDao extends BaseDao<Employee> implements IEmployeeDao {
	
}
