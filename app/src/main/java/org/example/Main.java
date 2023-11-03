package org.example;

import org.example.Entities.User;
import org.example.Services.User.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        UserService userService = context.getBean("userService",UserService.class);

        User user = new User("moha");
        userService.saveUser(user);
    }
}
