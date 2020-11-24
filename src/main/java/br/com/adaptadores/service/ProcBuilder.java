package br.com.adaptadores.service;

import java.util.List;

import br.com.adaptadores.model.ParametrizacaoModel;

public class ProcBuilder {
	private List<ParametrizacaoModel>  listaParametrizacao;

	public ProcBuilder incluirParametrizacoes(List<ParametrizacaoModel>  listaParametrizacao) {
		this.listaParametrizacao = listaParametrizacao;

		return this;
	}
	public String construirProc() {

		return new StringBuilder().append("CREATE PROCEDURE \"BASE\".\"PROC\" () ")
				.append(criaItens())
				.append(");").toString();
	}
private String criaItens() {
		
		StringBuilder ListaDeColunas = new StringBuilder();
		
		String sufixo = "";
		for (ParametrizacaoModel parametrizacao : listaParametrizacao) {
			ListaDeColunas
			.append(sufixo);	
			sufixo =", ";
			ListaDeColunas
			.append(parametrizacao.getNomeCampoMainframe())	;
		}		
	
		
		return ListaDeColunas.toString();
		
	}

}
