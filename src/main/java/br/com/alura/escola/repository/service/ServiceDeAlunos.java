package br.com.alura.escola.repository.service;

import br.com.alura.escola.dominio.aluno.Aluno;
import br.com.alura.escola.repository.aluno.RepositorioDeAlunosJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceDeAlunos {

    @Autowired
    private RepositorioDeAlunosJPA alunosJPA;

    void matriculaAlunos(Aluno aluno) {
        alunosJPA.save(aluno);
    }

}
