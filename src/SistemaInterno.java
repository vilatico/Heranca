
public class SistemaInterno {
	private int senha = 2222;

	public void autenticacao(Autentica a) {
		boolean autenticavel = a.autentica(this.senha);
		if (autenticavel) {
			System.out.println("Pode entrar no sistema");
		} else {
			System.out.println("Não pode entrar no sistema");
		}

	}
}
