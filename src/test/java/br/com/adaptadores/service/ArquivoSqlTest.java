package br.com.adaptadores.service;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.adaptadores.model.ArquivoSql;


@RunWith(SpringRunner.class)
public class ArquivoSqlTest {

	@Test
	public void deveContruirLinhaComSucesso() throws IOException {

//	   	Arrange
		String nomeArquivo = "nomeTeste.sql";
		String linha = "INSERT INTO tabelaTeste (colunaTeste, colunaTeste2 ) VALUES ('valorTeste', 1);";

		ArquivoSql arquivoSqlEsperado = new ArquivoSql(linha, nomeArquivo);

//		Act
		ArquivoSql arquivoSql = new LinhaBuilder().nomearArquivo(nomeArquivo).incluirLinha(linha)
				.inserirLinhaNoArquivoSql();

//		Assert
		 

	}

	@Test(expected = FileNotFoundException.class)
	public void deveLancarIOException() throws IOException {

//	   	Arrange
		String nomeArquivo = "z:/nomeTeste.sql";
		String linha = "INSERT INTO tabelaTeste (colunaTeste, colunaTeste2 ) VALUES ('valorTeste', 1);";

		ArquivoSql arquivoSqlEsperado = new ArquivoSql(linha, nomeArquivo);

//		Act
		ArquivoSql arquivoSql = new LinhaBuilder().nomearArquivo(nomeArquivo).incluirLinha(linha)
				.inserirLinhaNoArquivoSql();

//		Assert	
	}

}
