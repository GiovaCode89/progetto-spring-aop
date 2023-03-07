package org.example.progettospringaop.test;

import org.example.progettospringaop.aop.MercatoImpl;
import org.example.progettospringaop.aop.MercatoProxy;
import org.example.progettospringaop.bean.AziendaService;
import org.example.progettospringaop.bean.ProdottoService;
import org.example.progettospringaop.config.Config;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Test {

    public static void main(String[] args) {
        //proxy();
        aspect();
    }

    public static void proxy() {
        MercatoProxy mProxy = new MercatoProxy(new MercatoImpl());
        System.out.println(mProxy.getProdotto(2));
        List<String> listProdotti = mProxy.getProdottoList();
    }

    public static void aspect() {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        ProdottoService prodottoService = context.getBean("prodotto", ProdottoService.class);
        AziendaService aziendaService = context.getBean("azienda", AziendaService.class);


//       prodottoService.datiProdotto();
//       System.out.println("---------");
//       aziendaService.stampa();

//        Long x= new Long(2);
//        aziendaService.provaArgs((x));

//        prodottoService.getStringa();


        try {
            prodottoService.metodoProva();
        }catch (IllegalArgumentException i)
        {}
        System.out.println("programma terminato!");

    }
}
