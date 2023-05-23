
public class Diretor extends Funcionario implements Autentica {

	private AutenticacaoUtil au;

	private int senha;

	Diretor() {
		this.au = new AutenticacaoUtil();

	}

	@Override
	public double getBonus() {
		System.out.println("Bonus do Diretor");
		return super.getSalario() * 1.5;
	}

	@Override
	public void setSenha(int senha) {
		au.setSenha(this.senha);

	}

	@Override
	public boolean autentica(int senha) {
		return this.au.autenticacao(this.senha);
	}
}
