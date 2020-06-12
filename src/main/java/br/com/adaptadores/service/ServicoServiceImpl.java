package br.com.adaptadores.service;

import java.util.Date;

import org.springframework.stereotype.Service;

@Service
public class ServicoServiceImpl implements ServicoService  {
	
	public void cadastrarNovoCliente(String titular, int conta, Date data, String cpf) {
		
		validarRequisicao();
		cadastrarCliente();
		cadastraConta();
	
	}
	
	private void cadastraConta() {
		// TODO Auto-generated method stub
		
	}


	private void cadastrarCliente() {
		// TODO Auto-generated method stub
		
	}


	private void validarRequisicao() {
				
	}
}
