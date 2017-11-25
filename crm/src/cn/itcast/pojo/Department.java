package cn.itcast.pojo;

/**
 * 实体类
 * POJO: Persistent Object Java Object 持久化的javabean对象
 * @author AdminTH
 *
 */
public class Department {
	
	// 主键
	private Long id;
	// 部门名称
	private String departmentName;
	// 部门负责人
	private String manager;
	// 部门备注
	private String remark;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getManager() {
		return manager;
	}
	public void setManager(String manager) {
		this.manager = manager;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	
	@Override
	public String toString() {
		return "Department [departmentName=" + departmentName + ", id=" + id
				+ ", manager=" + manager + ", remark=" + remark + "]";
	}
}
