package heranca;

import java.util.List;
import java.util.ArrayList;

public class Aluno extends Pessoa {
	String matricula;
	int frequencia;
	String status;
	
	public Aluno(String _nome, String _sobrenome, String _endereco, char _sexo, String matricula, int frequencia, String status) {
		super(_nome, _sobrenome, _endereco, _sexo);
		this.matricula = matricula;
		this.frequencia = frequencia;
		this.status = status;
	}
	
	void cadastraAluno(String nome, String sobrenome, String endereco, char sexo, String matricula, int frequencia, String status) {
		List<Aluno> aluno2 = new ArrayList<>();
		aluno2.addAll("Abdiel", "Athayde", "Minas Gerais", 'F', "201710002356", 100, "Reprovado");
//		List<Pessoa> pessoa2 = new ArrayList<>();
//		pessoa2.add()
		
//		= new Aluno(nome, sobrenome, endereco, sexo, matricula, frequencia, status);
	}
	

}
