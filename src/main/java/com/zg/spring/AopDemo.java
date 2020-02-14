package com.zg.spring;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;


/******
 * Spring AOP代码
 */
@Component
@Aspect
public class AopDemo {
    /*****
     * 声明 切入点
     * execution 声明连接点
     */
    @Pointcut("execution(* com.abc.service..*.*(..))")
    public void poinCut(){
        System.out.println("=======实际业务代码========="+Thread.currentThread().getName());

    }

    /******
     * 切入点的通知。这里直接写是切入点的方法名
     * 比如说 开启事务
     */
    @Before("poinCut()")
    public void before(JoinPoint joinPoint){
        System.out.println("===========方法前调用======="+Thread.currentThread().getName());
    }
    /******
     * 切入点的通知。这里直接写是切入点的方法名
     * 比如说 提交事务
     */
    @After("poinCut()")
    public void after(JoinPoint joinPoint){
        System.out.println("=============方法后调用==============="+Thread.currentThread().getName());
    }
}


