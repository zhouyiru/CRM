package cn.itcast.service;

import java.util.List;

import cn.itcast.pojo.Customer;


public interface ICustomerService extends IBaseService<Customer>{
	// 显示作为的客户
	List<Customer> getByStatus(int status);
}
