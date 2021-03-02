package Funcionarios;

public class ControleBonificacao {

	private double somaBonificacao;
	
	public void registra(Funcionario f) {
		double bonificacao = f.getBonificacao();
		this.somaBonificacao += bonificacao;
	}
	
	public double getSoma() {
		return this.somaBonificacao;
	}
}
