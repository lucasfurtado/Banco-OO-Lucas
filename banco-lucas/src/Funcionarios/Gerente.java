package Funcionarios;

import Sistema.Autenticavel;

public class Gerente extends Funcionario implements Autenticavel{
	
	private String senha;
	
	@Override
	public boolean autentica(String senha) {
		if(this.senha == senha) {
			return true;
		}else {
			return false;
		}
	}
	
	@Override
	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public double getBonificacao() {
		return 2000 + super.getSalario() * 0.2;
	}
	
	
	
}
