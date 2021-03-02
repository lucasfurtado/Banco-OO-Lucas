package Funcionarios;

import Sistema.Autenticavel;

public class Administrador extends Funcionario implements Autenticavel{

	private String senha;

	@Override
	public double getBonificacao() {
		return 500;
	}
	
	@Override
	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public boolean autentica(String senha) {
		return false;
	}
	
	
}