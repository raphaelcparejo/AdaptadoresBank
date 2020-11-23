package br.com.adaptadores.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import fluent.api.*;
import fluent.api.processors.EndProcessor;

@RunWith(SpringRunner.class)
public class InsertBuilderTest {

	@Test
	public void deveContruirLinhaComSucesso() {

//	   	Arrange
		String resultadoEsperado = "INSERT INTO TABELAnOME VALUES ( 2, 1, 'nomeCampoFisicoTeste', '/nomeCampoFisicoTeste', 'codigoTipoRegistroSaidaTeste');";
		String codigoLayoutArquivoSaida= "2";
		String nomeCampoFisico = "nomeCampoFisicoTeste";
		String nomeCampoFisicoOrigem = "/nomeCampoFisicoTeste";
		String codigoTipoRegistroSaida = "codigoTipoRegistroSaidaTeste";
 
//		Act
		String resultado = new InsertBuilderImpl()
				.incluirCodigoLayoutArquivoSaida(codigoLayoutArquivoSaida)
				.incluirNomeCampoFisico(nomeCampoFisico)
				.incluirNomeCampoFisicoOrigem(nomeCampoFisicoOrigem)
				.incluirCodigoTipoRegistroSaida(codigoTipoRegistroSaida)
				.gerarInsertTBW6197();

//		Assert

		assertEquals(resultadoEsperado, resultado);

	}

}
