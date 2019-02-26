package com.fast.xinyue.repository;

import com.fast.xinyue.domain.Request;
import org.springframework.data.jpa.repository.JpaRepository;


// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete
//这将由Spring自动实现为名为userRepository的Bean
// CRUD指的是创建，读取，更新，删除

public interface RequestRepository extends JpaRepository<Request, Long> {

}
