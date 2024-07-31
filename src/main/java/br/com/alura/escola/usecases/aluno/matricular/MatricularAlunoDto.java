package br.com.alura.escola.usecases.aluno.matricular;

import br.com.alura.escola.dominio.aluno.Aluno;
import br.com.alura.escola.dominio.aluno.VO.CpfVo;
import br.com.alura.escola.dominio.aluno.VO.EmailVo;

public class MatricularAlunoDto {

	private String nomeAluno;
	private String cpfAluno;
	private String emailAluno;
	
	public MatricularAlunoDto(String nomeAluno, String cpfAluno, String emailAluno) {
		this.nomeAluno = nomeAluno;
		this.cpfAluno = cpfAluno;
		this.emailAluno = emailAluno;
	}

	public Aluno criarAluno() {
		return new Aluno(
				new CpfVo(cpfAluno),
				nomeAluno, 
				new EmailVo(emailAluno));
	}
	
}
