package com.ly.spring.text;

import com.ly.spring.test.Main;
import com.ly.spring.test.entity.User;
import com.ly.spring.test.sercice.UserService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test_tx {
    private AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Main.class);

    @Test
    public void testSaveTx() throws Exception {
        UserService userService = (UserService) context.getBean("userService");
        User user = User.builder()
                .id("abc")
                .age(10)
                .name("罗勇").build();

        userService.addUser(user);
    }
}
