package com.ly.spring.test.dao;

import com.ly.spring.test.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public User addUser(User user) {
        String sql = "insert into `user`(id, age, `name`) VALUES(?, ?, ?)";
        jdbcTemplate.update(sql, user.getId(), user.getAge(), user.getName());

        return user;
    }
}
