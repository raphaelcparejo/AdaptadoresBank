package br.com.adaptadores.controller;

import java.util.Objects;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.adaptadores.service.*;

@RunWith(SpringRunner.class)
public class NomeFisicoCampoOrigemEhCodRgtoArquTest {

	@InjectMocks
	private NomeFisicoCampoOrigemEhCodRgtoArqu nomeFisicoCampoOrigemEhCodRgtoArqu;
	
	@Mock
	private ValorRetornoParaNomeFisicoCampoOrigem proximoRetorno ;

	@Test
	public void RetornaNomeFisicoCampoOrigemParaObterRetorno() {

		// Arrange
		String nomeFisicoCampoOrigem = "COD_TIPO_RGTO_ARQU";

		// Act
		String resultado = nomeFisicoCampoOrigemEhCodRgtoArqu.obterRetorno(nomeFisicoCampoOrigem);

		// Assert
		Assertions.assertThat(Objects.equals(resultado, nomeFisicoCampoOrigem)).isTrue();

	}

	@Test
	public void RetornaProximoRetornoParaObterRetorno() throws Exception {

		// Arrange
		String nomeFisicoCampoOrigem = "ProximaPalavra";
		Mockito.when(proximoRetorno.obterRetorno(nomeFisicoCampoOrigem)).thenReturn("ProximaPalavra");

		// Act
		String resultado = nomeFisicoCampoOrigemEhCodRgtoArqu.obterRetorno(nomeFisicoCampoOrigem);

		// Assert
		Assertions.assertThat(Objects.equals(resultado, nomeFisicoCampoOrigem)).isTrue();

	}
}
