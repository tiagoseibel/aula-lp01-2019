package br.com.empresa.lp1.webaula05.beans;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named(value = "calculadoraBean")
@RequestScoped
public class CalculadoraBean {
    private Integer a;
    private Integer b;
    private Integer c;

    public void somar() {
        c = a + b;
    }
    
    public Integer getA() {
        return a;
    }

    public void setA(Integer a) {
        this.a = a;
    }

    public Integer getB() {
        return b;
    }

    public void setB(Integer b) {
        this.b = b;
    }

    public Integer getC() {
        return c;
    }

    public void setC(Integer c) {
        this.c = c;
    }    
}
