package com.ly.spring.test.sercice;

import com.ly.spring.test.dao.UserDao;
import com.ly.spring.test.entity.User;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.rmi.server.ExportException;
import java.util.UUID;

@Service

public class UserService {

    @Autowired
    private UserDao userDao;

    @Autowired
    private PersonService personService;

    @Transactional
    public User addUser(User user) throws Exception {
        personService.addRandomUser();
        int i  = 1 / 0;
        user = userDao.addUser(user);
        return user;
    }

}
