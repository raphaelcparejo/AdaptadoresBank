package br.com.adaptadores.service;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import fluent.api.End;

public class InsertBuilderImpl {

	@NotNull(message = "codigoLayoutArquivoSaida, campo não pode ser nulo")
	@NotEmpty(message = "codigoLayoutArquivoSaida, campo não pode ser vazio")
	private String codigoLayoutArquivoSaida;
	private int numeroOrdemAtributoArquivo = 0;
	@NotNull(message = "nomeCampoFisico, campo não pode ser nulo")
	@NotEmpty(message = "nomeCampoFisico, campo não pode ser vazio")
	private String nomeCampoFisico;
	@NotNull(message = "nomeCampoFisicoOrigem, campo não pode ser nulo")
	@NotEmpty(message = "nomeCampoFisicoOrigem, campo não pode ser vazio")
	private String nomeCampoFisicoOrigem;
	@NotNull(message = "codigoTipoRegistroSaida, campo não pode ser nulo")
	@NotEmpty(message = "codigoTipoRegistroSaida, campo não pode ser vazio")
	private String codigoTipoRegistroSaida;

	public InsertBuilderImpl incluirCodigoLayoutArquivoSaida(String codigoLayoutArquivoSaida) {
		this.codigoLayoutArquivoSaida = codigoLayoutArquivoSaida;

		return this;
	}

	public InsertBuilderImpl incluirNomeCampoFisico(String nomeCampoFisico) {
		this.nomeCampoFisico = nomeCampoFisico;

		return this;
	}

	public InsertBuilderImpl incluirNomeCampoFisicoOrigem(String nomeCampoFisicoOrigem) {
		this.nomeCampoFisicoOrigem = nomeCampoFisicoOrigem;

		return this;
	}

	public InsertBuilderImpl incluirCodigoTipoRegistroSaida(String codigoTipoRegistroSaida) {
		this.codigoTipoRegistroSaida = codigoTipoRegistroSaida;

		return this;
	}

	@End
	public String gerarInsertTBW6197() {

		incremetarNumeroOrdemAtributoArquivo();

		return new StringBuilder().append("INSERT INTO TABELAnOME VALUES ( ")
				.append(codigoLayoutArquivoSaida).append(", ")
				.append(numeroOrdemAtributoArquivo).append(", '")
				.append(nomeCampoFisico).append("', '")
				.append(nomeCampoFisicoOrigem).append("', '")
				.append(codigoTipoRegistroSaida).append("');").toString();
	}

	private int incremetarNumeroOrdemAtributoArquivo() {
		return this.numeroOrdemAtributoArquivo++;

	}
}
