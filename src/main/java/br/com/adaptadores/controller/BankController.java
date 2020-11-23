package br.com.adaptadores.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.adaptadores.controller.dto.RequiscaoDto;
import br.com.adaptadores.service.ServicoService;
import br.com.adaptadores.service.exceptions.ServicoServiceException;

@Controller
@RestController
@RequestMapping
public class BankController {
	
	@Autowired
	ServicoService service;
	
	@PostMapping(value = "/")	
	public ResponseEntity<String>  gerarTelaSaldo(@RequestBody @Valid RequiscaoDto requisicao) throws ServicoServiceException {
		service.cadastrarNovoCliente(requisicao.getTitular(), requisicao.getCpf());
		
		return ResponseEntity
	            .status(HttpStatus.OK)                 
	            .body("200 OK");	
	}
}
