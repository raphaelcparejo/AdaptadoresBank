package br.com.adaptadores.service;

import java.util.Date;

import org.springframework.stereotype.Service;

import br.com.adaptadores.service.exceptions.ServicoServiceException;

@Service
public class ServicoServiceImpl implements ServicoService  {
	
	public void cadastrarNovoCliente(String titular, String cpf) throws ServicoServiceException {
		
		validarRequisicao();
		cadastrarCliente();
		cadastraConta();
	
	}
	
	private void cadastraConta() throws ServicoServiceException {
		int teste =0;
		 if (teste== 1) {
			 throw new ServicoServiceException("olá", new Exception()); 
		 }
		
	}


	private void cadastrarCliente() {
		// TODO Auto-generated method stub
		
	}


	private void validarRequisicao() {
				
	}
}
