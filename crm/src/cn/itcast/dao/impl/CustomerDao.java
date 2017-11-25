package cn.itcast.dao.impl;

import org.springframework.stereotype.Repository;

import cn.itcast.dao.ICustomerDao;
import cn.itcast.pojo.Customer;

//@Repository("customerDao")
@Repository				// 把对象加入IOC容器
public class CustomerDao extends BaseDao<Customer> implements ICustomerDao {
}
