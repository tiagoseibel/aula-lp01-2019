package br.empresa.lp1.aulajpa.repository;

import br.empresa.lp1.aulajpa.model.Transacao;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface TransacaoRepository extends JpaRepository<Transacao, Integer> {

    //public List<Transacao> findByHistorico(String historico);
    
    @Query("from Transacao as t where t.historico like ?1")
    public List<Transacao> findByHistorico(String historico);
}
