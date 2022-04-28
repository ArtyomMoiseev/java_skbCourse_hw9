package com.example.skb_course_hw9.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class CountAspect {

    private int count = 0;
    @Value("${aspect.maxCount}")
    private int maxCount;

    @Around("execution(* com.example.skb_course_hw9.controller.CountController.count())")
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
