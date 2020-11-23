package br.com.adaptadores.service;

import java.io.BufferedWriter;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

import br.com.adaptadores.model.ArquivoSql;

public class LinhaBuilder {

	private String linha;
	private String nomeArquivo;

	public LinhaBuilder incluirLinha(String linha) {
		this.linha = linha;

		return this;
	}

	public LinhaBuilder nomearArquivo(String nomeArquivo) {
		this.nomeArquivo = nomeArquivo;

		return this;
	}

	public ArquivoSql inserirLinhaNoArquivoSql() throws IOException {

		ArquivoSql arquivoSql = new ArquivoSql(linha, nomeArquivo);
		OutputStream fos = new FileOutputStream(nomeArquivo, true);
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);

		bw.write(this.linha);
		bw.newLine();
		bw.close();

		return arquivoSql;
	}

}
