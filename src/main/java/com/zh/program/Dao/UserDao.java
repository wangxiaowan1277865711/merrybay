package com.zh.program.Dao;

import com.zh.program.Entrty.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao extends JpaRepository<User, Integer> {
    User findByName(String name);

    @Query("select u from User u where u.name=:name1")
    List<User> query(@Param("name1") String name);

    @Query(nativeQuery = true, value = "select * from user u where u.name=:name1")
    List<User> query1(@Param("name1") String name);
}
