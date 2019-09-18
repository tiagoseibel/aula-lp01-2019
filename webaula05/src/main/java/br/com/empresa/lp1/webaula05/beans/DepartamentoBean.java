package br.com.empresa.lp1.webaula05.beans;

import br.com.empresa.lp1.webaula05.model.Departamento;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class DepartamentoBean {

    private List<Departamento> lista = new ArrayList<>();

    @PostConstruct
    public void init() {
        Departamento d1 = new Departamento();
        d1.setId(1);
        d1.setNome("Informática");
        lista.add(d1);
    }

    public List<Departamento> getLista() {
        return lista;
    }

    public void setLista(List<Departamento> lista) {
        this.lista = lista;
    }

}
