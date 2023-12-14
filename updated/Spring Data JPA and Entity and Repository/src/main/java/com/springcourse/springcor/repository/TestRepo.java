package com.springcourse.springcor.repository;

import com.springcourse.springcor.entity.TestEntity;
import org.springframework.data.jpa.repository.JpaRepository;

// C r u d  Repository Create read update delete
public interface TestRepo extends JpaRepository<TestEntity , Integer > {

}
