package br.com.alura.escola;

import br.com.alura.escola.usecases.aluno.matricular.MatricularAluno;
import br.com.alura.escola.usecases.aluno.matricular.MatricularAlunoDto;
import br.com.alura.escola.repository.aluno.RepositorioDeAlunosEmMemoria;

public class MatricularAlunoPorLinhaDeComando {
	
	public static void main(String[] args) {
		String nome = "Fulano da Silva";
		String cpf = "123.456.789-00";
		String email = "fulano@email.com";
		
		MatricularAluno matricular = new MatricularAluno(new RepositorioDeAlunosEmMemoria());
		matricular.executa(
				new MatricularAlunoDto(nome, 
						cpf, 
						email));
	}

}
