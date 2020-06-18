package br.com.adaptadores.service;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class EscritaArquivoFileWriterServiceImpl {
	public static void main(String[] args) throws IOException {
		

//		OutputStream fos = new FileOutputStream("testeEscritaFileWriter.txt");
//		Writer osw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osw);
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("testeEscritaFileWriter.txt"));
		bw.write("estoy aqui");
		bw.newLine();
		bw.newLine();
		bw.write("escrevendo-te");
				
		bw.close();
		
	}
}
