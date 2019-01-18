package com.yd93.spring.aop.xmlframework;

/**
 * @Description: 这里的方法都是我感兴趣的切面
 * @Author：yd93
 * @Create on：2019-01-15 13:56:49
 **/
public class Logging {

     //在切面方法之前执行
    public void beforeAdvice(){
        System.out.println("进入指定的类");
    }

    //切面方法之后执行
    public void afterAdvice(){
        System.out.println("指定类已经执行");
    }

    //切面方法返回之后执行
    public void afterReturningAdvice(Object retVal){
        System.out.println("返回值：" + retVal.toString());
    }

    //发生异常时执行
    public void afterThrowingAdvice(IllegalArgumentException ex){
        System.out.println("发生了一个异常：" + ex.toString());
    }
}
