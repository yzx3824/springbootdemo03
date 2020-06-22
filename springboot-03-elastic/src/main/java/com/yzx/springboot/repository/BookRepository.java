package com.yzx.springboot.repository;

import com.yzx.springboot.bean.Book;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

/**
 * @program: springboot-03-elastic
 * @description: todo
 * @author: yanzhixian
 * @create: 2020-06-22 22:28
 */
public interface BookRepository extends ElasticsearchRepository<Book,Integer> {
    //参照
    // https://docs.spring.io/spring-data/elasticsearch/docs/3.0.6.RELEASE/reference/html/
    public List<Book> findByBookNameLike(String bookName);
}
