package br.com.adaptadores.model;

public class ArquivoSql {

	private String linhaInsert;
	private String nomeArquivo;

	public ArquivoSql(String linhaInsert, String nomeArquivo) {
		super();
		this.linhaInsert = linhaInsert;
		this.nomeArquivo = nomeArquivo;
	}

	public String getLinhaInsert() {
		return linhaInsert;
	}

	public void setLinhaInsert(String linhaInsert) {
		this.linhaInsert = linhaInsert;
	}

	public String getNomeArquivo() {
		return nomeArquivo;
	}

	public void setNomeArquivo(String nomeArquivo) {
		this.nomeArquivo = nomeArquivo;
	}

}
