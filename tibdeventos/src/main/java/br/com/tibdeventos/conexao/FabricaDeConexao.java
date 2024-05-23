package br.com.tibdeventos.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaDeConexao {
	
	public static Connection obterConexaoMySQL() throws SQLException {
		String url = "jdbc:mariadb://localhost/ap1";
		String username = "root";
		String password = "root";
		return DriverManager.getConnection(url, username, password);
	}
	
}
