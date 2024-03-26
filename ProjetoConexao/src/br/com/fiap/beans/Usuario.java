package br.com.fiap.beans;

public class Usuario {
	
	private int codigo;
	private String login, senha, nome, email;
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Usuario(int codigo, String login, String senha, String nome, String email) {
		super();
		this.codigo = codigo;
		this.login = login;
		this.senha = senha;
		this.nome = nome;
		this.email = email;
	}
	public Usuario() {
		super();
	}
}
