package com.roman.petrenko;

import com.roman.petrenko.impls.robot.R2D2;
import com.roman.petrenko.impls.siements.Body;
import com.roman.petrenko.impls.siements.Hand;
import com.roman.petrenko.impls.siements.Head;
import com.roman.petrenko.impls.siements.Leg;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppContext {
    @Bean
    public R2D2 r2D2() {
        return new R2D2(new Hand(), new Head(), new Leg(), new Body());
    }
}