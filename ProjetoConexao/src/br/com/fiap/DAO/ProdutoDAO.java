package br.com.fiap.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.beans.Produto;
import br.com.fiap.conexoes.ConexaoFactory;

public class ProdutoDAO {
	public Connection minhaConexao;

	public ProdutoDAO() throws ClassNotFoundException, SQLException {
		super();
		this.minhaConexao = new ConexaoFactory().conexao();
	}
	
	//Insert
	public String inserir (Produto produto) throws SQLException {
		PreparedStatement stmt = minhaConexao.prepareStatement("Insert into T_FIAP_PRODUTO values (?, ?, ?, ?)");
		stmt.setInt(1, produto.getCodigo());
		stmt.setString(2, produto.getTipo());
		stmt.setString(3, produto.getMarca());
		stmt.setDouble(4, produto.getValor());
		stmt.execute();
		stmt.close();
				
		return "Cadastrado com Sucesso!";

	}
	
	//Delete
	public String Deletar(Produto produto) throws SQLException {
		PreparedStatement stmt = minhaConexao.prepareStatement("Delete from T_FIAP_PRODUTO where = ?");
		stmt.setInt(1, produto.getCodigo());
		stmt.execute();
		stmt.close();
		
		return "Deletado com Sucesso";
	}
	
	//Update
	public String atualizar(Produto produto) throws SQLException {
		PreparedStatement stmt = minhaConexao.prepareStatement("Update T_FIAP_PRODUTO set TIPO = ?, MARCA = ?, VALOR = ? where CODIGO = ?");
		
		stmt.setString(1, produto.getTipo());
		stmt.setString(2, produto.getMarca());
		stmt.setDouble(3, produto.getValor());
		stmt.setInt(4, produto.getCodigo());
		stmt.executeUpdate();
		stmt.close();
		
		return "Atualizado com Sucesso";
	}
	
	//Select
	public List<Produto> selecionar() throws SQLException{
		List<Produto> listaProduto = new ArrayList<Produto>();
		PreparedStatement stmt = minhaConexao.prepareStatement("Select * from T_FIAP_PRODUTO");
		ResultSet rs = stmt.executeQuery();
		
		while(rs.next()) {
			Produto produto = new Produto();
			produto.setCodigo(rs.getInt(1));
			produto.setTipo(rs.getString(2));
			produto.setMarca(rs.getString(3));
			produto.setValor(rs.getDouble(4));
			listaProduto.add(produto);
		}
		
		return listaProduto;
		
	}
}