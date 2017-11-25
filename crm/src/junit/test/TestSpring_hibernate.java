package junit.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.itcast.pojo.Department;
import cn.itcast.service.IDepartmentService;

@RunWith(SpringJUnit4ClassRunner.class)  // 通过junit指定测试的容器类
@ContextConfiguration("/bean.xml")       // 指定容器路径
public class TestSpring_hibernate {
	
	// 从容器获取对象注入
	@Resource
	private IDepartmentService departmentService;
	

	@Test
	public void testSave() throws Exception {
		Department d = new Department();
		d.setDepartmentName("开发部");
		d.setManager("班长");
		d.setRemark("刚创建.....");
		departmentService.save(d);
	}
}
