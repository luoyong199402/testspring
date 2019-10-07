package com.ly.spring.test.aspectj;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;


@Aspect
@Slf4j
public class LogAspectj {
    @Pointcut("execution(* com.ly.spring.test.bean.Calculator.cal(..))")
    public void point() {
    }

    @Before("point()")
    public void before(JoinPoint joinPoint) {
        log.info("before {} ", joinPoint.getSignature().getName());
    }

    @After("point()")
    public void after(JoinPoint joinPoint) {
        log.info("after {} ", joinPoint.getSignature().getName());
    }

    @AfterReturning("point()")
    public void afterReturning(JoinPoint joinPoint) {
        log.info("afterReturning {} ", joinPoint.getSignature().getName());
    }

    @AfterThrowing(value = "point()", throwing = "exception")
    public void exception(JoinPoint joinPoint, Exception exception) {
        log.info("exception {} ", joinPoint.getSignature().getName());
        log.info("exception info {}", exception.toString());
    }

    @Around("point()")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        log.info("around {} ", proceedingJoinPoint.getSignature().getName());
        return proceedingJoinPoint.proceed();
    }

}
