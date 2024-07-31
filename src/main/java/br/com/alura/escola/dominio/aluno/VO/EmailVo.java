package br.com.alura.escola.dominio.aluno.VO;

public class EmailVo {
	
	private String endereco;

	public EmailVo(String endereco) {
		if (endereco == null || 
				!endereco.matches("^[a-zA-Z0-9._]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")) {
			throw new IllegalArgumentException("E-mail invalido!");
		}

		this.endereco = endereco;

		/*
		 if (endereco == null || !endereco.matches("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$")) {
            throw new IllegalArgumentException("e-mail invalido.");
        }
        this.endereco = endereco;*/
	}
	
	public String getEndereco() {
		return endereco;
	}

}
