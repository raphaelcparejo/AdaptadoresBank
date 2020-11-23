package br.com.adaptadores.service;

import br.com.adaptadores.model.ParametrizacaoModel;

import java.io.IOException;
import java.util.List;

public class FakeMain {

	public static void main(String[] args) throws IOException {
		
		String codigoLayoutArquivoSaida = "12";

		List<ParametrizacaoModel> parametrizacoes = new CapturarDadosService().capturaDadosExcel("parametrizacao.xlsx");

		for (ParametrizacaoModel parametrizacao : parametrizacoes) {
			
			String insert = new InsertBuilderImpl()
					.incluirCodigoLayoutArquivoSaida(codigoLayoutArquivoSaida)
					.incluirNomeCampoFisico(parametrizacao.getNomeCampoMainframe())
					.incluirNomeCampoFisicoOrigem(parametrizacao.getRegraExtratorArquivo())
					.incluirCodigoTipoRegistroSaida(parametrizacao.getComponenteLayout())
					.gerarInsertTBW6197();
			
			new LinhaBuilder().nomearArquivo("nome.sql").incluirLinha(insert)
			.inserirLinhaNoArquivoSql();
		}

	}

}
