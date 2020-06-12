package br.com.adaptadores.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.adaptadores.controller.dto.RequiscaoDto;
import br.com.adaptadores.service.ServicoService;

@Controller
@RestController
@RequestMapping
public class BankController {
	
	@Autowired
	ServicoService service;
	
	@PostMapping(value = "/")	
	public String gerarTelaSaldo(@RequestBody @Valid RequiscaoDto requisicao) {
		service.cadastrarNovoCliente(requisicao.getTitular(), requisicao.getConta(), requisicao.getData(), requisicao.getCpf());
		
		return "tá ok 200!";		
	}
}
