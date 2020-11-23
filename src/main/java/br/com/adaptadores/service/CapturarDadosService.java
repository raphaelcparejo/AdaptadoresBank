package br.com.adaptadores.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import br.com.adaptadores.model.ParametrizacaoModel;

public class CapturarDadosService {

	public List<ParametrizacaoModel> capturaDadosExcel(String nomearquivo) throws IOException {
		
		List<ParametrizacaoModel> parametrizacoes = new ArrayList<ParametrizacaoModel>();
		FileInputStream arquivoExcel = new FileInputStream(new File(nomearquivo));
		Workbook workbook = new XSSFWorkbook(arquivoExcel);
		Sheet planilha = workbook.getSheetAt(0);

		for (Row linha : planilha) {

			if (linha.getRowNum() == 0) {
				continue;
			}

			ParametrizacaoModel parametrizacao = new ParametrizacaoModel(
					linha.getCell(0).getRichStringCellValue().getString(),
					linha.getCell(1).getRichStringCellValue().getString(),
					linha.getCell(2).getRichStringCellValue().getString(),
					linha.getCell(4).getRichStringCellValue().getString(), 
					null,
					linha.getCell(6).getRichStringCellValue().getString(),
					linha.getCell(5).getRichStringCellValue().getString(),
					String.valueOf((int) linha.getCell(3).getNumericCellValue()),
					null,
					linha.getCell(7).getRichStringCellValue().getString());

			parametrizacoes.add(parametrizacao);

		}
		if (workbook != null) {
			workbook.close();

		}
		return parametrizacoes;
	}
}
