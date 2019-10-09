package br.empresa.lp1.aulajpa.services;

import br.empresa.lp1.aulajpa.model.LancamentoContabil;
import br.empresa.lp1.aulajpa.model.Transacao;
import br.empresa.lp1.aulajpa.repository.LancamentoContabilRepository;
import br.empresa.lp1.aulajpa.repository.TransacaoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TransacaoService {

    @Autowired
    private TransacaoRepository transacaoRepository;

    @Autowired
    private LancamentoContabilRepository lcRepository;

    @Transactional
    public void insere(Transacao transacao) {

        transacaoRepository.save(transacao);

        transacao.getLancamentos().forEach((i) -> {
            i.setTransacao(transacao);

            lcRepository.save(i);
        });

    }

    public List<Transacao> findByHistorico(String historico) {
        return transacaoRepository.findByHistorico(historico);
    }
}
