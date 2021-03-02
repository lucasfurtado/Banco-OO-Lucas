 package Funcionarios;

public abstract class Funcionario {								//n vai existir um objeto puro do tipo funcionario
	
	//atributos
	private String nome;
	private int cpf;
	private double salario;
	
	//metodos
	public abstract double getBonificacao();					//metodo abstrato
	
	//gets and setters
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
}
