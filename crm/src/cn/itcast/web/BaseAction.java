package cn.itcast.web;

import java.util.Map;

import javax.annotation.Resource;

import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

import cn.itcast.service.ICustomerService;
import cn.itcast.service.IDepartmentService;
import cn.itcast.service.IEmployeeService;
import cn.itcast.service.ITraceHistoryService;
import cn.itcast.service.ITransferHistoryService;

import com.opensymphony.xwork2.ActionSupport;

/**
 * BaseAction, 
 * 	1. 所有的表示域的map在接收接收
 *  2. 所有的Service，都在这里接收IOC容器注入结果
 * @author AdminTH
 *
 */
public class BaseAction extends ActionSupport implements RequestAware,SessionAware,ApplicationAware{

	// map
	protected Map<String, Object> request;	// 保存struts在运行时期注入的表示request的map
	protected Map<String, Object> session;	// 保存struts在运行时期注入的表示session的map
	protected Map<String, Object> application;	// 保存struts在运行时期注入的表示application的map
	
	// Service
	// 注入Service对象
	@Resource   		//alt + shift + z 复制当前光标定位行
	protected IDepartmentService departmentService;		// 部门
	@Resource 
	protected IEmployeeService employeeService;			// 营销人员
	@Resource 
	protected ICustomerService customerService;			// 客户
	@Resource 
	protected ITraceHistoryService traceHistoryService;	// 客户跟进
	@Resource 
	protected ITransferHistoryService transferHistoryService;	// 客户移交
	
	
	
	
	
	public void setRequest(Map<String, Object> request) {
		this.request = request;
	}
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
	public void setApplication(Map<String, Object> application) {
		this.application = application;
	}

}
