package org.example.progettospringaop.bean;

public class AziendaService {


    public void stampa(){
        System.out.println("Sono un AziendaService");
    }

    public void provaArgs(Long x){
        System.out.println(x);
    }
}
