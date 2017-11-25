package cn.itcast.web;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;

// 主要是访问/WEB-INF下的资源的action
@Controller
@Scope("prototype")
public class MainAction extends ActionSupport{
	

	public String execute()  {
		return SUCCESS;
	}
	
	
	// 对应页面顶部
	public String top()  {
		return "top";
	}
	
	// 对应页面左侧菜单
	public String menu()  {
		return "menu";
	}
	
	// 对应页面右边
	public String index()  {
		return "index";
	}
	
	public String test()  {
		return "test";
	}
	
}
