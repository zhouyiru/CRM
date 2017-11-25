package cn.itcast.dao;

import java.io.Serializable;
import java.util.List;

// 所有dao公用方法的接口定义
public interface IBaseDao<T> {
	// 保存
	void save(T t);
	// 更新
	void update(T t);
	// 删除
	void delete(Serializable id);
	// 主键查询
	T findById(Serializable id);
	// 查询全部
	List<T> getAll();
	// 条件条件
	List<T> getByCondition(String hql,Object...parmas);
}
