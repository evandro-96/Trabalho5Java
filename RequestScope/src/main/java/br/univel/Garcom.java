package br.univel;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
public class Garcom {

    @Inject
    private Sopa sopa;

    @EJB
    private Chef chef;

    public String orderSopa(String nome) {
        sopa.setNome(nome);
        return chef.prepareSopa().getNome();
    }

}
