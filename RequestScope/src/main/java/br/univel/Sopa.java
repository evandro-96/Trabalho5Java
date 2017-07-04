package br.univel;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;

@RequestScoped
public class Sopa {

    private String nome = "Sopa do dia";

    @PostConstruct
    public void afterCreate() {
        System.out.println("Sopa feita");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
