package cn.itcast.dao.impl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.itcast.dao.IBaseDao;

/**
 * 所有dao公用方法的实现
 * 注意：
 * 	  一定要把sessionFactory对象传入父类！
 *  这样在BaseDao才可以用getHibernateTemplate()方法操作数据库！
 */
public abstract class BaseDao<T> extends HibernateDaoSupport implements IBaseDao<T> {
	
	
	@Resource(name="sessionFactory")
	public void setSessionFactory1(SessionFactory sessionFactory){
		super.setSessionFactory(sessionFactory);
	}
	
	// 当前操作的模块
	private Class<T> clazz;
	// 构造函数
	public BaseDao(){
//		System.out.println("当前运行类：" + this);// 具体的子类
		System.out.println("当前运行字节码：" + this.getClass());
//		System.out.println("当前运行类父类：" + this.getClass().getSuperclass());
//		System.out.println("当前运行类泛型父类：" + this.getClass().getGenericSuperclass()); // 参数化类型
		
		// 获取当前运行类泛型父类类型，即为参数化类型，有所有类型公用的高级接口Type接收！
		Type type = this.getClass().getGenericSuperclass();
		// 强转为“参数化类型”
		ParameterizedType pt = (ParameterizedType) type; // BaseDao<Department>
		// 获取参数化类型中，实际类型的定义
		Type[] ts = pt.getActualTypeArguments();
		// 转换
		this.clazz = (Class<T>) ts[0];
	}
	


	public void save(T t) {
		getHibernateTemplate().save(t);		
	}
	
	
	public T findById(Serializable id) {
		return getHibernateTemplate().get(clazz, id);
	}


	public void delete(Serializable id) {
		// 先查询
		T t = findById(id);
		// 再删除
		if (t != null) {
			getHibernateTemplate().delete(t);
		}
	}


	public List<T> getAll() {
		return getHibernateTemplate().loadAll(clazz);
	}
	public List<T> getByCondition(String hql, Object... parmas) {
		return getHibernateTemplate().find(hql,parmas);
	}

	public void update(T t) {
		getHibernateTemplate().update(t);
	}
}
