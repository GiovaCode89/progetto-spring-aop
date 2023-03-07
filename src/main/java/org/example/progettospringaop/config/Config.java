package org.example.progettospringaop.config;


import org.example.progettospringaop.bean.AziendaService;
import org.example.progettospringaop.bean.ProdottoService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

//@EnableAspectJAutoProxy = permette all'applicazione di utilizzare aspectJ

@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = "org.example.progettospringaop.aop")
public class Config {

    @Bean(name = "azienda")
    public AziendaService getAziendaService(){
        return new AziendaService();
    }

    @Bean(name="prodotto")
    public ProdottoService getProdottoService(){
        return new ProdottoService();
    }
}
