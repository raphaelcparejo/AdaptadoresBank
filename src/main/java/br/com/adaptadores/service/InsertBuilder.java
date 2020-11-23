package br.com.adaptadores.service;

import fluent.api.End;

public interface InsertBuilder {

	public InsertBuilderImpl incluirCodigoLayoutArquivoSaida(String codigoLayoutArquivoSaida);

	@End
	void store();
}
