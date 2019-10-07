package com.ly.spring.test.sercice;

import com.ly.spring.test.dao.UserDao;
import com.ly.spring.test.entity.User;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
public class PersonService {
    @Autowired
    private UserDao userDao;

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public User addRandomUser() {
        User user = User.builder()
                .id(StringUtils.replace(UUID.randomUUID().toString(), "-", ""))
                .age(10)
                .name("luoyong haha").build();
        return userDao.addUser(user);
    }
}
