package junit.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.itcast.web.DepartmentAction;
import cn.itcast.web.EmployeeAction;


public class TestSpring_end {

	// 创建容器对象，再从容器获取对象
	@Test
	public void testApp() throws Exception {
		ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
		DepartmentAction d1 = (DepartmentAction) ac.getBean("departmentAction");
		DepartmentAction d2 = (DepartmentAction) ac.getBean("departmentAction");
		EmployeeAction d3 = (EmployeeAction) ac.getBean("employeeAction");
		
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
	}

}
