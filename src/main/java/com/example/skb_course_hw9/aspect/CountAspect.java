package com.example.skb_course_hw9.aspect;

import com.example.skb_course_hw9.controllers.CountController;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;
import org.springframework.stereotype.Component;

@Aspect
@Component
@ConfigurationProperties(prefix = "aspect")
public class CountAspect {

    private int count;
    private int maxCount = 5;

    public void SetCount(int count) {
        this.count = count;
    }


    @Around("execution(* com.example.skb_course_hw9.controllers.CountController.count())")
    public Object beforeGetCount(ProceedingJoinPoint pjp) throws Throwable {
        if (count < maxCount) {
            count += 1;
            return pjp.proceed();
        }
        else {
            return "max method invocation count";
        }
    }
}
