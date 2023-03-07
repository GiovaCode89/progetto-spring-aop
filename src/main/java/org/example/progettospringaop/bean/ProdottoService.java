package org.example.progettospringaop.bean;

public class ProdottoService {

    public void datiProdotto(){
        System.out.println("TV sony bravia");
    }

    public String getStringa(){
        System.out.println("Sono in getStringa()");
        return "hello_world";
    }

    public void metodoProva(){
        System.out.println("Sono in metodoProva()");
        throw new IllegalArgumentException();
    }
}
