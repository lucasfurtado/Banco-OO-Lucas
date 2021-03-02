package Funcionarios;

public class TesteFuncionarios {

	public static void main(String[] args) {
		
		Gerente gerente1 = new Gerente();
		gerente1.setNome("Jos�");
		gerente1.setCpf(11111111-11);
		gerente1.setSalario(5000.00);
		
		Designer designer1 = new Designer();
		designer1.setNome("Maria");
		designer1.setCpf(22222222-22);
		designer1.setSalario(3000.00);
		
		Programador programador1 = new Programador();
		programador1.setNome("Lucas");
		programador1.setCpf(33333333-33);
		programador1.setSalario(4000.00);
		
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(gerente1);
		controle.registra(designer1);
		controle.registra(programador1);
		
		System.out.println(controle.getSoma());
	}

}
