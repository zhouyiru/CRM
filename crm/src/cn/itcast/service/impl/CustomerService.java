package cn.itcast.service.impl;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import cn.itcast.dao.ICustomerDao;
import cn.itcast.pojo.Customer;
import cn.itcast.service.ICustomerService;

@Service
public class CustomerService implements ICustomerService {
	
	// 注入dao
	@Resource      // 先根据注解下面字段的名称去容器中招对象注入； 没有找到按照类型去IOC容器找； 如果类型重复报错！没有找到也报错！
	private ICustomerDao customerDao;
	

	
	public void delete(Serializable id) {
		customerDao.delete(id);
	}

	
	public Customer findById(Serializable id) {
		return customerDao.findById(id);
	}

	public List<Customer> getAll() {
		List<Customer> list = customerDao.getAll();
		return list;
	}

	public void save(Customer t) {
		customerDao.save(t);
	}

	public void update(Customer t) {
		customerDao.update(t);
	}
	
	public List<Customer> getByStatus(int status) {
		String hql = "from Customer where status=?";
		return customerDao.getByCondition(hql, status);
	}

}







