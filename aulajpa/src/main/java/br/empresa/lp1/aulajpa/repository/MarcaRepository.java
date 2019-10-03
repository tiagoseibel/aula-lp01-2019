package br.empresa.lp1.aulajpa.repository;

import br.empresa.lp1.aulajpa.model.Marca;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MarcaRepository
        extends JpaRepository<Marca, Integer> {

}
