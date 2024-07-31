package br.com.alura.escola.dominio.aluno;

import br.com.alura.escola.dominio.aluno.VO.CpfVo;

public class AlunoNaoEncontrado extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public AlunoNaoEncontrado(CpfVo cpfVo) {
		super("Aluno nao encontrado com CPF: " + cpfVo.getNumero());
	}

}
