package br.com.alura.escola.dominio.aluno;

import br.com.alura.escola.dominio.aluno.VO.CpfVo;

import java.util.List;

public interface RepositorioDeAlunos {
	
	void matricular(Aluno aluno);
	
	Aluno buscarPorCPF(CpfVo cpfVo);
	
	List<Aluno> listarTodosAlunosMatriculados();
	
	//...

}
