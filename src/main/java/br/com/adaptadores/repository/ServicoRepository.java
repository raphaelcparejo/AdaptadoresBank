package br.com.adaptadores.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import br.com.adaptadores.model.ContaModel;

@Repository
public class ServicoRepository {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public int salvarConta(ContaModel conta) {

		String query = "INSERT INTO conta(agencia, conta) VALUES (?, ?)";
		Object[] params = new Object[] { conta.getAgencia(), conta.getConta() };

		return this.jdbcTemplate.update(query, params);
	}

	public int atualizaConta(int agencia, int numeroConta) {

		String query = "UPDATE AlgumaTabela SET NomeColunaAgencia =" + agencia + "WHERE ID = " + numeroConta;

		return this.jdbcTemplate.update(query);
	}

	public ContaModel buscarUmaConta(int conta) {

		String query = "SELECT * FROM conta WHERE conta = ?";
		Object[] param = new Object[] { conta };

		return jdbcTemplate.queryForObject(query, param, BeanPropertyRowMapper.newInstance(ContaModel.class));
	}

	public List<ContaModel> buscarTodasContas() {

		String query = "SELECT * FROM conta ";

		return jdbcTemplate.query(query, BeanPropertyRowMapper.newInstance(ContaModel.class));
	}
}
