package br.com.fiap.main;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.com.fiap.DAO.ProdutoDAO;
import br.com.fiap.DAO.UsuarioDAO;
import br.com.fiap.beans.Produto;
import br.com.fiap.beans.Usuario;

public class TesteCadastrar {

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
		//Instanciar objetos
		Usuario usuario = new Usuario();
		
		UsuarioDAO dao = new UsuarioDAO();
		
		usuario.setCodigo(inteiro("Código"));
		usuario.setLogin(texto("Login"));
		usuario.setSenha(texto("Senha"));
		
		System.out.println(dao.inserir(usuario));
		

	}

}