package br.com.adaptadores.service;

import java.util.Date;

import org.springframework.stereotype.Service;

import br.com.adaptadores.service.exceptions.ServicoServiceException;

@Service
public interface ServicoService {
	
	public void cadastrarNovoCliente(String titular, String cpf) throws ServicoServiceException;
}
