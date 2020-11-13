package br.com.adaptadores.service;

public class NomeFisicoCampoOrigemEhCodRgtoArqu implements ValorRetornoParaNomeFisicoCampoOrigem {

	private ValorRetornoParaNomeFisicoCampoOrigem proximoRetorno;

	public String obterRetorno(String nomeFisicoCampoOrigem) {
		if (nomeFisicoCampoOrigem.equals("COD_TIPO_RGTO_ARQU")) {
			return nomeFisicoCampoOrigem;
		} else {
			return proximoRetorno.obterRetorno(nomeFisicoCampoOrigem);
		}
	}

	@Override
	public void setProximoRetorno(ValorRetornoParaNomeFisicoCampoOrigem proximoRetorno) {
		this.proximoRetorno = proximoRetorno;
	}

}
