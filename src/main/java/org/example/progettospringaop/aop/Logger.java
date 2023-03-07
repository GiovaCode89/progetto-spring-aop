package org.example.progettospringaop.aop;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class Logger {

    //value= viene indicato il pointcut
    @Before(value = "execution(* org.example.progettospringaop.bean.ProdottoService.datiProdotto())")
    public void logBefore(JoinPoint joinPoint){
        System.out.println("Sono nel metodo logBefore");
    }

    @Before(value = "args(java.lang.Long)")
    public void otherLogBefore(JoinPoint joinPoint){
        System.out.println("Heyyyyy, sono nel metodo logBefore");
    }

    @After(value = "within(org.example.progettospringaop.bean..*)")
    public void logAfter(JoinPoint joinPoint){
        System.out.println("Sono nel metodo logAfter");
    }

    @After(value = "bean(prodotto)")
    public void otherLogAfter(){
        System.out.println("Buonasera, Sono nel metodo otherLogAfter");
    }

    @AfterReturning(value="execution(* org.example.progettospringaop.bean.ProdottoService.getStringa())",
                    returning ="ret")
    public void logAfterReturning(JoinPoint joinPoint, Object ret){
        System.out.println ("Sono nel metodo __logAfterReturning__, "+((String)ret));
    }

    @AfterThrowing(value="execution(* org.example.progettospringaop.bean.ProdottoService.metodoProva())",
                    throwing = "ill")
    public void logAfterThrowing(JoinPoint joinPoint, IllegalArgumentException ill){
            System.out.println("Salve, sono nel metodo logAfterThrowing");
    }

    //Pointcut:
    //execution,within,args,bean,this,target

    //Advice(vengono eseguiti in un determinato momento considerando i pointcut):
    //before,after,afterReturning,afterThrowing,around
}
