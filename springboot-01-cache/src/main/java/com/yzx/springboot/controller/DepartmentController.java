package com.yzx.springboot.controller;

import com.yzx.springboot.bean.Department;
import com.yzx.springboot.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: springboot-01-cache
 * @description: todo
 * @author: yanzhixian
 * @create: 2020-07-08 23:06
 */
@RestController
public class DepartmentController {

    @Autowired
    DepartmentService departmentService;

    @GetMapping("/dept/{id}")
    public Department getDept(@PathVariable("id") Integer id) {
        return departmentService.getDeptById(id);
    }

}
