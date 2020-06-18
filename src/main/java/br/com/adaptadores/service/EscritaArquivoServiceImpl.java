package br.com.adaptadores.service;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class EscritaArquivoServiceImpl {
public static void main(String[] args) throws IOException {
		
		
		OutputStream fos = new FileOutputStream("testeEscrita.txt");
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		
		bw.write("cabeçalho");
		bw.newLine();
		bw.write("corpicho");
				
		bw.close();
		
	}

}
