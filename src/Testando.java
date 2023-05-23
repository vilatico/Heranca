
public class Testando {
	public static void main(String[] args) {

		Gerente g = new Gerente();
		g.setNome("Tiago");
		g.setCpf("987456123");
		g.setSalario(5000);
		g.apresentaDados();

		System.out.println("\n");

		Diretor d = new Diretor();
		d.setNome("Thais");
		d.setCpf("888888888");
		d.setSalario(5000);
		d.apresentaDados();

		System.out.println("\n");

		Designer de = new Designer();
		de.setNome("Arthur");
		de.setCpf("5258596");
		de.setSalario(5000);
		de.apresentaDados();

		ControlarBonus cb = new ControlarBonus();

		cb.registra(de);
		cb.registra(d);
		cb.registra(g);

		System.out.println("\nSoma de todas as bonificacoes: " + cb.getSoma());

		System.out.println();

		SistemaInterno s = new SistemaInterno();
		
		g.setSenha(2222);
		s.autenticacao(g);
		d.setSenha(2222);
		s.autenticacao(d);

	}
}
