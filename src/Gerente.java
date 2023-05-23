
public class Gerente extends Funcionario implements Autentica {

	private AutenticacaoUtil au;
	private int senha;

	public Gerente() {
		this.au = new AutenticacaoUtil();
	}

	@Override
	public double getBonus() {

		System.out.println("Bonus do gerente");
		return super.getSalario() * 1.5;
	}

	@Override
	public void setSenha(int senha) {
		au.setSenha(this.senha);
	}

	public boolean autentica(int senha) {
		return au.autenticacao(this.senha);
	}

}
