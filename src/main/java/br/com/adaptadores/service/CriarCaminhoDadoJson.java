package br.com.adaptadores.service;

public class CriarCaminhoDadoJson {

	private String classificadorAvro;

	public CriarCaminhoDadoJson incluirClassificadorAvro(String classificadorAvro) {
		this.classificadorAvro = classificadorAvro;

		return this;
	}

	public String gerar() {

		return new StringBuilder().append("/data/")
				.append(classificadorAvro)
				.append("/").toString();
	}

}
