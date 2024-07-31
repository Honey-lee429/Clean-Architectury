package br.com.alura.escola.dominio.aluno;

import br.com.alura.escola.dominio.aluno.VO.CpfVo;
import br.com.alura.escola.dominio.aluno.VO.EmailVo;
import br.com.alura.escola.dominio.aluno.VO.TelefoneVo;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
	
	private CpfVo cpfVo;
	private String nome;
	
	private EmailVo emailVo;
	
	private List<TelefoneVo> telefoneVos = new ArrayList<>();
	
	private String senha;
	
	public Aluno(CpfVo cpfVo, String nome, EmailVo emailVo) {
		this.cpfVo = cpfVo;
		this.nome = nome;
		this.emailVo = emailVo;
	}

	public void adicionarTelefone(String ddd, String numero) {
		this.telefoneVos.add(new TelefoneVo(ddd, numero));
	}
	
	public String getCpf() {
		return cpfVo.getNumero();
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getEmail() {
		return emailVo.getEndereco();
	}
	
	public List<TelefoneVo> getTelefones() {
		return telefoneVos;
	}

	public String getSenha() {
		return senha;
	}
	
}






