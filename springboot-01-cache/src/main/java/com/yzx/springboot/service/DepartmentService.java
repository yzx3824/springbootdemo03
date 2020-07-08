package com.yzx.springboot.service;

import com.yzx.springboot.bean.Department;
import com.yzx.springboot.mapper.DepartmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cache.Cache;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.stereotype.Service;

/**
 * @program: springboot-01-cache
 * @description: todo
 * @author: yanzhixian
 * @create: 2020-07-08 22:55
 */
//@CacheConfig(cacheManager="deptCacheManager")
@Service
public class DepartmentService {
    @Autowired
    DepartmentMapper departmentMapper;

    //明确指定使用那个缓存管理器
    @Qualifier("deptCacheManager")
    @Autowired
    RedisCacheManager deptCacheManager;

    /**
     *  缓存的数据能存入redis；
     *  第二次从缓存中查询就不能反序列化回来；
     *  存的是dept的json数据;CacheManager默认使用RedisTemplate<Object, Employee>操作Redis
     * @param id
     * @return
     */
    @Cacheable(cacheNames = "dept",cacheManager = "deptCacheManager")
    public Department getDeptById(Integer id){
        System.out.println("查询部门"+id);
        Department department = departmentMapper.getDeptById(id);
        return department;
    }

    // 使用缓存管理器得到缓存，进行api调用
//    public Department getDeptById(Integer id){
//        System.out.println("查询部门"+id);
//        Department department = departmentMapper.getDeptById(id);
//
//        //获取某个缓存
//        Cache dept = deptCacheManager.getCache("dept");
//        dept.put("dept:1",department);
//
//        return department;
//    }
}
