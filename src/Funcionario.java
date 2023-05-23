
public abstract class Funcionario {
	private String nome;

	private double salario;
	private String cpf;

	public double getBonus() {
		return this.salario * 1.2;
	}

	public double getSalario() {
		return this.salario;

	}

	public void apresentaDados() {
		System.out.println(
				"Nome: " + getNOme() + ", CPF: " + getCpf() + ", Salario: " + getSalario() + ", Bonus: " + getBonus());
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getNOme() {
		return this.nome;

	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return this.cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}
