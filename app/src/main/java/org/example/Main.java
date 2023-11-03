package org.example;

import org.example.Entities.User;
import org.example.Repositories.ObjectifRepository;
import org.example.Services.Objectif.ObjectifService;
import org.example.Services.User.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        UserService userService = context.getBean("userService",UserService.class);

        ObjectifService objectifService = context.getBean("objectifService",ObjectifService.class);

        User user = new User("moha");
        userService.saveUser(user);
    }
}
