package br.com.alura.escola.dominio.aluno.VO;

public class CpfVo {

	private String numero;

	public CpfVo(String numero) {
		if (numero == null || 
				!numero.matches("\\d{3}\\.\\d{3}\\.\\d{3}\\-\\d{2}")) {
			throw new IllegalArgumentException("CPF invalido!");
		}
		this.numero = numero;

		/*if (cpf == null && !cpf.matches("\\\\d{3}\\\\.\\\\d{3}\\\\.\\\\d{3}\\\\-\\\\d{2}")) {
			throw new IllegalArgumentException("CPF invalido.");
		}
		this.cpf = cpf;*/
	}
	
	public String getNumero() {
		return numero;
	}
	
}
