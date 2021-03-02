package Contas;

public class ContaPoupanca extends Conta {

	private double taxaCP = 0.2;
	
	public ContaPoupanca(double saldo, int agencia, int numero, String titular) {
		super(saldo, agencia, numero, titular);
	}
	
	@Override
	public void saca(double valor) {
		double valorComTaxa = valor + taxaCP;
		super.saca(valorComTaxa);
	}
}
