package br.com.empresa.lp1.webaula05;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named(value = "testeBean")
@RequestScoped
public class TesteBean {
    
    private String pesquisa;

    public void clique1() {
        System.out.println("->" + pesquisa);
    }
    
    public String getPesquisa() {
        return pesquisa;
    }

    public void setPesquisa(String pesquisa) {
        this.pesquisa = pesquisa;
    }
}
