package org.example.progettospringaop.aop;

import java.util.List;

public class MercatoProxy implements Mercato {

    private Mercato prodotto;

    public MercatoProxy(Mercato prodotto) {
        this.prodotto=prodotto;
    }

    public String getProdotto(int i) {
        return prodotto.getProdotto(i);
    }

    public List<String> getProdottoList() {
        return prodotto.getProdottoList();
    }
}
