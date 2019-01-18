package com.yd93.spring.aop.aspectj;

import org.aspectj.lang.annotation.*;

/**
 * @Description:此版本要求aspectjweaver-1.8.10.jar包达到1.8.10或以上才可以，否则就报类找不到的异常
 * @Author：yd93
 * @Create on：2019-01-17 15:07:06
 *
 **/
@Aspect
public class Logging {

    //下面是选择所有可用方法的切点的一个定义，因此建议将会被所有方法调用
    @Pointcut("execution(* com.yd93.spring.aop.aspectj.*.*(..))")
    private void selectAll(){}

    //这个切入点是我感兴趣的，将会在被选择的方法之前执行
    @Before("selectAll()")
    public void beforeAdvice(){
        System.out.println("将进入类中。。。");
    }
    //这个切入点是我感兴趣的，将会在被选择的方法之后执行
    @After("selectAll()")
    public void afterAdvice(){
        System.out.println("类已经被执行");
    }
    //这个切入点是我感兴趣的，将会在一些方法返回的时候执行
    @AfterReturning(pointcut = "selectAll()",returning = "retVal")
    public void afterReturningAdvice(Object retVal){
        System.out.println("Returning：" + retVal.toString());
    }
    //这个切入点是我感兴趣的，将会在发生异常的时候执行
    @AfterThrowing(pointcut = "selectAll()", throwing = "ex")
    public void AfterThrowingAdvice(IllegalArgumentException ex){
        System.out.println("有个异常发生了，这是自己造的异常" + ex.toString());
    }
}
