package br.empresa.lp1.aulajpa;

import br.empresa.lp1.aulajpa.model.Marca;
import br.empresa.lp1.aulajpa.repository.MarcaRepository;
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

    @Override
    public void run(String... args) {
        for (Marca m : repos.findAll()) {
            System.out.println("->" + m.getNome());
        }

        Marca m1 = new Marca();
        m1.setId(5);
        m1.setNome("Toyota");

        repos.save(m1);
    }
}
