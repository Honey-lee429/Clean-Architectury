package br.com.alura.escola.repository.aluno;

import br.com.alura.escola.dominio.aluno.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioDeAlunosJPA extends JpaRepository<Aluno, String> {

}
