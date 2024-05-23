package br.com.tibdeventos.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import br.com.tibdeventos.conexao.FabricaDeConexao;
import br.com.tibdeventos.model.Evento;

public class EventoDAO {

	public List<Evento> listarEventos() {
		return null;
	}

	public void cadastrarEvento(Evento evento) throws SQLException {

		String sql = "INSERT INTO EVENTO (NOME, CIDADE, UF) VALUES (?,?,?)";
		Connection conn;
		PreparedStatement ps;

		conn = FabricaDeConexao.obterConexaoMySQL();
		ps = conn.prepareStatement(sql);
		ps.setString(1, evento.getNome());
		ps.setString(2, evento.getCidade());
		ps.setString(3, evento.getUf());

		ps.executeUpdate();
	}

	public void deletarEventoPorId(int id) {

	}

	public void atualizarEvento(Evento evento) {

	}

	public Evento obterEventoPorId(int id) {
		return null;
	}

}
