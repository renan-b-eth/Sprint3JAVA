package br.com.fiap.conexoes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoFactory {
	
	// CONEXÃO RM553328 SENHA 130201
	
	// metodo de conexao com o banco de dados
	public Connection conexao() throws ClassNotFoundException, SQLException {
		// Driver 
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		// Conexao
		return DriverManager.getConnection
		("jdbc:oracle:thin:@oracle.fiap.com.br:1521:orcl",
				"RM553228" , "130201") ;
	}
	

}
