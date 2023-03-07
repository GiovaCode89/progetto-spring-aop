package org.example.progettospringaop.aop;

import java.util.ArrayList;
import java.util.List;

public class MercatoImpl implements Mercato {
    private List<String> listaProdotti;

    public MercatoImpl() {
        listaProdotti=new ArrayList<String>();
        addElements();
    }

    public void addElements(){
        listaProdotti.add("Smartphone");
        listaProdotti.add("tv");
        listaProdotti.add("mobile");
        listaProdotti.add("libro");
    }

    public String getProdotto(int i) {
        if (i<listaProdotti.size()) {
            return listaProdotti.get(i);
        }
        return null;
    }

    public List<String> getProdottoList() {
        return listaProdotti;
    }
}
