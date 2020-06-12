package br.com.adaptadores.model;

import java.util.Date;

public class ContaModel {

	private double saldo;
	
	private int agencia;
	
	private int conta;
	
	private ClienteModel titular;
	
	private Date dataCriacaoConta;
	
	public Date getDataCriacaoConta() {
		return dataCriacaoConta;
	}

	public void setDataCriacaoConta(Date dataCriacaoConta) {
		this.dataCriacaoConta = dataCriacaoConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}

	public ClienteModel getTitular() {
		return titular;
	}

	public void setTitular(ClienteModel titular) {
		this.titular = titular;
	}

	public ContaModel(double saldo, int agencia, int conta, ClienteModel titular, Date dataCriacaoConta) {
		super();
		this.saldo = saldo;
		this.agencia = agencia;
		this.conta = conta;
		this.titular = titular;
		this.dataCriacaoConta = dataCriacaoConta;
	}
}
