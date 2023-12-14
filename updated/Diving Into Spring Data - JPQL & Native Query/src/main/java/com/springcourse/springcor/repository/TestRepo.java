package com.springcourse.springcor.repository;

import com.springcourse.springcor.entity.TestEntity;
import jakarta.transaction.Transactional; // updated from JDK +17 and Spring Boot 3 / Spring Framework 6
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;


import java.util.List;

// C r u d  Repository Create read update delete
public interface TestRepo extends JpaRepository<TestEntity, Integer> {

    @Query(value = "SELECT t FROM TestEntity t ")
    List<TestEntity> getAllUsers();


    @Query(value = "SELECT t FROM TestEntity t WHERE t.userId =:id  ")
    TestEntity getUserById(Integer id);


    @Modifying
    @Transactional
    @Query(value = "UPDATE TestEntity  t SET t.password =:password WHERE t.userId = :userId ")
    void resetPassword(String password, Integer userId);

    @Modifying
    @Transactional
    @Query(value = "DELETE FROM TestEntity  t WHERE t.userId = :userId")
    void deleteUserById(Integer userId);

    @Query(value = "select * from users order by user_id desc", nativeQuery = true)
    List<TestEntity> getAllUsersByNativeQuery();

}
