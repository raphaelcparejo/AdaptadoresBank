package br.com.adaptadores.controller.dto;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class RequiscaoDto {

	@NotNull(message = "Nome Titular Inválido, campo não pode ser nulo")
	@NotEmpty(message = "Nome Titular Inválido, campo não pode ser vazio")
	private String titular;

//	private int conta;
//	
//	private Date data;

//	@NotNull(message=" Cpf Inválido, campo não pode ser nulo")
//	@Pattern(regexp = "([0-9]{2}[\\.]?[0-9]{3}[\\.]?[0-9]{3}[\\/]?[0-9]{4}[-]?[0-9]{2})|([0-9]{3}[\\.]?[0-9]{3}[\\.]?[0-9]{3}[-]?[0-9]{2})", message="Cpf Inválido")
	private String cpf;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

//	public int getConta() {
//		return conta;
//	}
//
//	public void setConta(int conta) {
//		this.conta = conta;
//	}
//
//	public Date getData() {
//		return data;
//	}
//
//	public void setData(Date data) {
//		this.data = data;
//	}

	public RequiscaoDto(String titular, int conta, Date data, String cpf) {
		super();
		this.titular = titular;
//		this.conta = conta;
//		this.data = data;
		this.cpf = cpf;
	}

	public RequiscaoDto() {
	}

}
