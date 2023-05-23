
public class ControlarBonus {
	public double soma;

	public void registra(Funcionario f) {
		double bonus = f.getBonus();
		this.soma += bonus;
	}

	public double getSoma() {
		return this.soma;
	}
}
