package Contas;

public class ContaCorrente extends Conta{

	private double taxaCC = 0.5;
	
	public ContaCorrente(double saldo, int agencia, int numero, String titular) {
		super(saldo, agencia, numero, titular);
	}

	@Override
	public void saca(double valor) {
		double valorComTaxa= valor + this.taxaCC;
		super.saca(valorComTaxa);
	}
	
}
