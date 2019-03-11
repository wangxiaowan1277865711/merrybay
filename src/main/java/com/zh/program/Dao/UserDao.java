package com.zh.program.Dao;

import com.zh.program.Entrty.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<User, Integer> {
    User findByName(String name);
}
