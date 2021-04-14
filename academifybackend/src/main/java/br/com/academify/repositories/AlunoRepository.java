package br.com.academify.repositories;

import br.com.academify.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Integer> {

    Aluno findById(long id);
}
