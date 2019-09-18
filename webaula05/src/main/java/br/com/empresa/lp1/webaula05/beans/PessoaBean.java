package br.com.empresa.lp1.webaula05.beans;

import br.com.empresa.lp1.webaula05.model.Pessoa;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named
@SessionScoped
public class PessoaBean implements Serializable {

    private Pessoa pessoa = new Pessoa();
    private List<Pessoa> lista = new ArrayList<>();

    public void adicionar() {
        lista.add(pessoa);
        pessoa = new Pessoa();
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public List<Pessoa> getLista() {
        return lista;
    }

    public void setLista(List<Pessoa> lista) {
        this.lista = lista;
    }
}
