package br.com.adaptadores.service;

import java.util.Date;

import org.springframework.stereotype.Service;

@Service
public interface ServicoService {
	
	public void cadastrarNovoCliente(String titular, int conta, Date data, String cpf);
}
