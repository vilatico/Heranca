
public class Designer extends Funcionario {
	@Override
	public double getBonus() {
		System.out.println("Bonus do Designer");
		return super.getSalario() * 1.3;
	}
}
