package demo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* demo.ShoppingCart.checkOut(..))")
    public void beforeLogger(JoinPoint jp){

//        System.out.println(jp.getSignature());
        String arg = jp.getArgs()[0].toString();
        System.out.println("beforeLogger with arguments "+arg);
    }

    @After("execution(* *.*.checkOut(..))")
    public void afterLogger(){
        System.out.println("afterLogger");
    }


    @Pointcut("execution(* demo.ShoppingCart.quantity())")
    public void afterReturningPointCut(){}

    @AfterReturning(pointcut = "afterReturningPointCut()", returning = "retVal")
    public void afterReturning(String retVal){
        System.out.println("after returning "+retVal);
    }
}
