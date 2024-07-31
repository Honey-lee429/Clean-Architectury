package br.com.alura.escola.dominio.aluno;

import br.com.alura.escola.dominio.aluno.VO.CpfVo;
import br.com.alura.escola.dominio.aluno.VO.EmailVo;


/* A criacao do construtor Aluno estava ficando complicada, pois todos os atributos sao String e no momento que
 * alguem fosse criar um aluno, não saberia a ordem dos atributos, poderia confundir.
 * Desta forma vamos criar uma fabrica de aluno para padronizar a criação do objeto Aluno*/
public class FabricaDeAluno {
	
	private Aluno aluno;

	public FabricaDeAluno comNomeCPFEmail(String nome, String cpf, String email) {
		this.aluno = new Aluno(new CpfVo(cpf), nome, new EmailVo(email));
		return this;
	}
	
	public FabricaDeAluno comTelefone(String ddd, String numero) {
		this.aluno.adicionarTelefone(ddd, numero);
		return this;
	}
	
	public Aluno criar() {
		return this.aluno;
	}
	
}
