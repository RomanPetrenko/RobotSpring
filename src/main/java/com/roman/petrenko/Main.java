package com.roman.petrenko;

import com.roman.petrenko.impls.robot.R2D2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppContext.class);
        R2D2 robot = context.getBean(R2D2.class);
        robot.action();
        System.out.println(robot);

    }
}
