package br.com.adaptadores.service;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;

public class OrquestracaoService {

	public String capturaDadosExcel() throws IOException {
		
		
		XSSFSheet planilha = new CapturaArquivo()
				.comNome("parametrizacao.xlsx")
				.comAbaDeNumero(0)
				.capturaExcelPorNumeroDeAba();
				
		
		return null;

	}

}
