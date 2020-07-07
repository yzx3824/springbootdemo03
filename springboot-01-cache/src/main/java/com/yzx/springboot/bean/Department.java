package com.yzx.springboot.bean;

/**
 * @program: springboot-01-cache
 * @description: todo
 * @author: yanzhixian
 * @create: 2020-07-07 19:51
 */
public class Department {

    private Integer id;
    private String departmentName;

    public Department() {
        super();
        // TODO Auto-generated constructor stub
    }
    public Department(Integer id, String departmentName) {
        super();
        this.id = id;
        this.departmentName = departmentName;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getDepartmentName() {
        return departmentName;
    }
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
    @Override
    public String toString() {
        return "Department [id=" + id + ", departmentName=" + departmentName + "]";
    }
}
