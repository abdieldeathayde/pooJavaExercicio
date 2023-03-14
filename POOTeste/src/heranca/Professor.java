package heranca;

public class Professor extends Pessoa {
	Double Salario;
	String Disciplina;
	int QuantidadeMaterias;
	
	public Professor(String _nome, String _sobrenome, String _endereco, char _sexo, Double Salario, String Disciplina, int QuantidadeMaterias ) {
		super(_nome, _sobrenome, _endereco, _sexo);
		this.Salario = Salario;
		this.Disciplina = Disciplina;
		this.QuantidadeMaterias = QuantidadeMaterias;
	}
}
