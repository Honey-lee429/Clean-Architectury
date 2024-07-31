package br.com.alura.escola.dominio.aluno;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import br.com.alura.escola.dominio.aluno.VO.TelefoneVo;
import org.junit.jupiter.api.Test;

class TelefoneVoTest {

	@Test
	void naoDeveriaCriarTelefoneComDDDsInvalidos() {
		assertThrows(IllegalArgumentException.class,
				() -> new TelefoneVo(null, "123456789"));
		
		assertThrows(IllegalArgumentException.class,
				() -> new TelefoneVo("", "123456789"));
		
		assertThrows(IllegalArgumentException.class,
				() -> new TelefoneVo("1", "123456789"));
	}

	@Test
	void naoDeveriaCriarTelefoneComNumerosInvalidos() {
		assertThrows(IllegalArgumentException.class,
				() -> new TelefoneVo("11", null));
		
		assertThrows(IllegalArgumentException.class,
				() -> new TelefoneVo("11", ""));
		
		assertThrows(IllegalArgumentException.class,
				() -> new TelefoneVo("11", "123"));
	}

	@Test
	void deveriaPermitirCriarTelefoneComDDDENumeroValidos() {
		String ddd = "11";
		String numero = "123456789";
		TelefoneVo telefoneVo = new TelefoneVo(ddd, numero);
		assertEquals(ddd, telefoneVo.getDdd());
		assertEquals(numero, telefoneVo.getNumero());
	}

}
