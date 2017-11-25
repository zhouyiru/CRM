package junit.test.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.itcast.pojo.Department;
import cn.itcast.service.IDepartmentService;

// 测试部门的服务类

@RunWith(SpringJUnit4ClassRunner.class)  // 通过junit指定测试的容器类
@ContextConfiguration("/bean.xml")       // 指定容器路径
public class Test_DepartmentService{

	@Resource
	private IDepartmentService departmentService;
	
	@Test
	public void delete() {
		System.out.println(departmentService);
		departmentService.delete(4L);
	}

	@Test
	public void findById() {
		Department d = departmentService.findById(1L);
		System.out.println(d);
	}

	
	@Test
	public void getAll() {
		 List<String> list = new ArrayList<String>(); // ArrayList<String>   ParameterizedType
		
		 System.out.println(departmentService.getAll());
	}

	@Test
	public void save() {
		//departmentService.save(new Department());
	}

	@Test
	public void update() {
		Department d = new Department();
		d.setId(5L);
		d.setDepartmentName("NewTest");
		departmentService.update(d);
	}

}
