package br.com.arturtcs.zup.demo.repositories;

import br.com.arturtcs.zup.demo.entities.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {



}
