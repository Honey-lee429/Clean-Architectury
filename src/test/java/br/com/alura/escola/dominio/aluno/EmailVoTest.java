package br.com.alura.escola.dominio.aluno;

import static org.junit.jupiter.api.Assertions.*;

import br.com.alura.escola.dominio.aluno.VO.EmailVo;
import org.junit.jupiter.api.Test;

class EmailVoTest {

	@Test
	void naoDeveriaCriarEmailsComEnderecosInvalidos() {
		assertThrows(IllegalArgumentException.class,
				() -> new EmailVo(null));
		
		assertThrows(IllegalArgumentException.class,
				() -> new EmailVo(""));
		
		assertThrows(IllegalArgumentException.class,
				() -> new EmailVo("emailinvalido"));
	}

	@Test
	void deveriaPermitirCriarEmailComEnderecoValido() {
		String endereco = "fulano@alura.com.br";
		EmailVo emailVo = new EmailVo(endereco);
		assertEquals(endereco, emailVo.getEndereco());
	}

}
