package com.yzx.springboot.mapper;

import com.yzx.springboot.bean.Department;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @program: springboot-01-cache
 * @description: todo
 * @author: yanzhixian
 * @create: 2020-07-07 20:01
 */
@Mapper
public interface DepartmentMapper {
    @Select("select * from department where id=#{id}")
    Department getDeptById(Integer id);
}
