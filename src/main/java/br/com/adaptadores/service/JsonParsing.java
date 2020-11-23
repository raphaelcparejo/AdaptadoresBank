package br.com.adaptadores.service;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JsonParsing {

	private static FileWriter file;

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		// JSON object. Key value pairs are unordered. JSONObject supports java.util.Map
		// interface.
		JSONObject obj = new JSONObject();
		obj.put("namespace", "br.com.");
	

		JSONArray fields = new JSONArray();
		fields.add("Company: Facebook");
		fields.add("Company: PayPal");
		fields.add("Company: Google");
		obj.put("Company List", fields);
		try {

			// Constructs a FileWriter given a file name, using the platform's default
			// charset
			file = new FileWriter("teste.json");
			file.write(obj.toJSONString());
			CrunchifyLog("Successfully Copied JSON Object to File...");
			CrunchifyLog("\nJSON Object: " + obj);

		} catch (IOException e) {
			e.printStackTrace();

		} finally {

			try {
				file.flush();
				file.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	static public void CrunchifyLog(String str) {
		System.out.println("str");
	}

}
