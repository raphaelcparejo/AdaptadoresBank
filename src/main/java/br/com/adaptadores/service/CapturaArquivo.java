package br.com.adaptadores.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CapturaArquivo {

	private String nomeArquivoExcel;
	private String nomeAbaExcel;
	private int numeroAbaExcel;

	public CapturaArquivo comNome(String nomeArquivoExcel) {
		this.nomeArquivoExcel = nomeArquivoExcel;

		return this;
	}

	public CapturaArquivo comAbaDeNome(String nomeAbaExcel) {
		this.nomeAbaExcel = nomeAbaExcel;

		return this;
	}

	public CapturaArquivo comAbaDeNumero(int numeroAbaExcel) {
		this.numeroAbaExcel = numeroAbaExcel;

		return this;
	}

	public XSSFSheet capturaExcelPorNumeroDeAba() throws IOException {

		FileInputStream arquivo = new FileInputStream(new File(nomeArquivoExcel));
		XSSFWorkbook workbook = new XSSFWorkbook(arquivo);
		return workbook.getSheetAt(numeroAbaExcel);

	}

}
