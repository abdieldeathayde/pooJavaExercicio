package heranca;

import java.util.List;
import java.util.ArrayList;

public class Aluno extends Pessoa {
	String matricula;
	int frequencia;
	String status;
	
	List<Aluno> alunos;
	
	
	public Aluno(String _nome, String _sobrenome, String _endereco, char _sexo, String matricula, int frequencia, String status) {
		super(_nome, _sobrenome, _endereco, _sexo);
		this.matricula = matricula;
		this.frequencia = frequencia;
		this.status = status;
	}
	
	

	public Aluno cadastraAluno(String matricula, int frequencia, String status) {
		Aluno aluno2 = new Aluno("Isaias", "Silveira", "Parana", 'M', "202010002178", 100, "Aprovado");
		
		if (aluno2.nome == null) {
			throw new NullPointerException("Nome não pode ser nulo");
		}
		getAluno().add(aluno2);
		return aluno2;

		//		List<Pessoa> aluno2 = new ArrayList<>();
		
//		aluno2.addAll("Abdiel", "Athayde", "Minas Gerais", 'M', "201710002356", 100, "Reprovado");
//		List<Pessoa> pessoa2 = new ArrayList<>();
//		pessoa2.add()
		
//		= new Aluno(nome, sobrenome, endereco, sexo, matricula, frequencia, status);
	}

	
	
	public String getMatricula() {
		return matricula;
	}



	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}



	public int getFrequencia() {
		return frequencia;
	}



	public void setFrequencia(int frequencia) {
		this.frequencia = frequencia;
	}



	public String getStatus() {
		return status;
	}



	public void setStatus(String status) {
		this.status = status;
	}

	


	public List<Aluno> getAluno() {
		if (alunos == null) {
			alunos = new ArrayList<Aluno>();
		}
		return alunos;
	}
	

}