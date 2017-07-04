package br.univel;

import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
public class Chef {

    @Inject
    private Sopa sopa;

    public Sopa prepareSopa() {
        return sopa;
    }
}
