package exercicio07;

public class Vendedor extends Funcionario {

	public Vendedor(String nome, int idade, double salario) {
		super(nome, idade, salario);
		
	}

	@Override
	double bonificacao() {		
		return getSalario() + 3000.00;
	}
	

}
