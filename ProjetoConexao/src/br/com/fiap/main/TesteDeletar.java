package br.com.fiap.main;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.com.fiap.DAO.ProdutoDAO;
import br.com.fiap.beans.Produto;

public class TesteDeletar {

	static String texto(String j) {
		return JOptionPane.showInputDialog(j);
	}
	static int inteiro(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}
	static double real(String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// Instanciar Objetos
		Produto objProduto = new Produto();
		
		ProdutoDAO dao = new ProdutoDAO();
		
	objProduto.setCodigo(inteiro("Código"));
	
	System.out.println(dao.Deletar(objProduto));
		

	}

}
