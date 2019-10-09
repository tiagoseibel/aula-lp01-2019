package br.empresa.lp1.aulajpa;

import br.empresa.lp1.aulajpa.model.LancamentoContabil;
import br.empresa.lp1.aulajpa.model.Marca;
import br.empresa.lp1.aulajpa.model.Transacao;
import br.empresa.lp1.aulajpa.model.enums.TipoLancamento;
import br.empresa.lp1.aulajpa.repository.MarcaRepository;
import br.empresa.lp1.aulajpa.services.TransacaoService;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AulajpaApplication
        implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(AulajpaApplication.class, args);
    }

    @Autowired
    private MarcaRepository repos;

    @Autowired
    private TransacaoService tservice;
    
    
    @Override
    public void run(String... args) {
        for (Marca m : repos.findAll()) {
            System.out.println("->" + m.getNome());
        }

        Marca m1 = new Marca();
        m1.setId(5);
        m1.setNome("Toyota");

        repos.save(m1);
        /*
        Transacao t = new Transacao();
        t.setDataLancamento(LocalDate.now());
        t.setHistorico("Compra de smartphone");
        t.setValor(850.00);
        
        LancamentoContabil ld = new LancamentoContabil();
        ld.setTipo(TipoLancamento.DEBITO);
        ld.setContaContabil("Caixa");
        ld.setValor(850.00);
        
        LancamentoContabil lc = new LancamentoContabil();
        lc.setTipo(TipoLancamento.CREDITO);
        lc.setContaContabil("Fornecedores");
        lc.setValor(850.00);
        
        t.setLancamentos(new ArrayList<>());
        
        t.getLancamentos().add(ld);
        t.getLancamentos().add(lc);
        
        tservice.insere(t);
          */      
        for(Transacao item : tservice.findByHistorico("%smart-tv%")) {
            System.out.println("-- -> " + item.getHistorico() );
        }
        
    }
}
