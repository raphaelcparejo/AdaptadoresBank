package br.com.adaptadores.service;

public class CadeiaDeRetornos {

	public String cadeia(String parametro) {
		ValorRetornoParaNomeFisicoCampoOrigem nomeFisicoCampoOrigem = new NomeFisicoCampoOrigemEhCodRgtoArqu();
		ValorRetornoParaNomeFisicoCampoOrigem proximo = new NomeFisicoCampoOrigemEhCodRgtoArqu();
		nomeFisicoCampoOrigem.setProximoRetorno(proximo);
		return nomeFisicoCampoOrigem.obterRetorno(parametro);

	}

}
