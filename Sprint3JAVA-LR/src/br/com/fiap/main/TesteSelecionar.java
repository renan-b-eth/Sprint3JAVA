package br.com.fiap.main;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.DAO.ProdutoDAO;
import br.com.fiap.beans.Produto;

public class TesteSelecionar {
	

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		ProdutoDAO dao = new ProdutoDAO();
		
		List<Produto> listaProduto = (ArrayList<Produto>) dao.selecionar();
		
		if(listaProduto != null) {
			for(Produto p : listaProduto) {
				System.out.println(p.getCodigo() + " " +
									p.getTipo() + " " +
									p.getMarca() + " " + 
									p.getValor() + " ");
			}
		}
	}

}
