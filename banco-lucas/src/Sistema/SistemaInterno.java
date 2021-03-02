package Sistema;


//sistema dedicado aos clientes e alguns profissionais autenticados para ter acesso ao sistema
public class SistemaInterno {

	public boolean entrouNoSistema(Autenticavel autenticavel, String senha) {
		if(autenticavel.getSenha() == senha) {
			System.out.println("Bem vindo ao sistema!");
			return true;
		}else {
			System.out.println("Acesso não permitido");
			return false;
		}
	}

	
}
