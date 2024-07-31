package br.com.alura.escola.dominio.aluno;

import static org.junit.jupiter.api.Assertions.*;

import br.com.alura.escola.dominio.aluno.VO.CpfVo;
import org.junit.jupiter.api.Test;

class CPFTest {

	@Test
	void naoDeveriaCriarCPFComNumerosInvalidos() {
		assertThrows(IllegalArgumentException.class,
				() -> new CpfVo(null));
		
		assertThrows(IllegalArgumentException.class,
				() -> new CpfVo(""));
		
		assertThrows(IllegalArgumentException.class,
				() -> new CpfVo("12345678900"));
	}

	@Test
	void deveriaPermitirCriarCPFComNumeroValido() {
		String numero = "123.456.789-00";
		CpfVo cpfVo = new CpfVo(numero);
		assertEquals(numero, cpfVo.getNumero());
	}

}
