package br.com.adaptadores.service;

import java.util.List;

import org.apache.commons.lang.StringUtils;

import br.com.adaptadores.model.ParametrizacaoModel;

public class HanaBuilder {

	private List<ParametrizacaoModel>  listaParametrizacao;

	public HanaBuilder incluirParametrizacoes(List<ParametrizacaoModel>  listaParametrizacao) {
		this.listaParametrizacao = listaParametrizacao;

		return this;
	}

	public String criarTabela() {

		return new StringBuilder().append("CREATE COLUMM TABLE \"BASE\".\"TABELA\" (")
				.append(criaItens())
				.append(");").toString();
	}
	private String criaItens() {
		
		StringBuilder ListaDeColunas = new StringBuilder();
		
		for (ParametrizacaoModel parametrizacao : listaParametrizacao) {
			ListaDeColunas.append(" '")
			.append(parametrizacao.getNomeCampoMainframe())
			.append("'")
			.append(parametrizacao.getTipoDeDadoDistribuida())
			.append("(")
			.append(parametrizacao.getTamanho())
			.append("),");	
		}
		
		return StringUtils.chop(ListaDeColunas.toString());
		
	}

}
