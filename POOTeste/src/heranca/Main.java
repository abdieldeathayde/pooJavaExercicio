package heranca;

import heranca.*;

public class Main {
	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa("Abdiel", "Athayde", "Blumenau", 'M');
		System.out.println("nome: " + pessoa.nome + " sobrenome: " + pessoa.sobrenome + " endereco: " + pessoa.endereco + " sexo: " + pessoa.sexo);
		Pessoa pessoa2 = new Pessoa("Roberta", "Pereira", "Canela", 'F');
		System.out.println("nome: " + pessoa2.nome + " sobrenome: " + pessoa2.sobrenome + " endereco: " + pessoa2.endereco + " sexo: " + pessoa2.sexo);
		Professor professor = new Professor ("Daniel", "Silva", "Brasília", 'M', 4500.00, "Programação Concorrente e Distribuída", 4);
		System.out.println("nome do professor: " + professor.nome + " sobrenome: " + professor.sobrenome + " endereco: " + professor.endereco + " sexo:  " + professor.sexo + "\nsalário: " + professor.Salario + " disciplina: " + professor.Disciplina + " quantidade de matérias: " + professor.QuantidadeMaterias);
		Aluno aluno = new Aluno("Maria", "Azevedo", "São Paulo", 'F', "202310002398", 100, "Aprovado");
		System.out.println("Nome estudante: " + aluno.nome + " sobrenome: " + aluno.sobrenome + " endereco: " + aluno.endereco + " sexo: " + aluno.sexo + " matricula: " + aluno.matricula + " frequência: " + aluno.frequencia + " status: " + aluno.status);
		
		Aluno aluno2 = new Aluno();
		aluno2.matricula = "202010002178";
		aluno2.frequencia = 100;
		aluno2.status = "Reprovado";
		aluno2.nome = "Isaias";
		aluno2.sobrenome = "Silveira";
		aluno2.endereco = "Parana";
		aluno2.sexo = 'M';



		// Aluno aluno2 = (Aluno) aluno2.getAlunos();
		System.out.println(aluno2);

		try {
			aluno2.cadastraAluno("201910004597", 100, "Aprovado");
			System.out.println("Aluno adicionado com sucesso!");
		} catch(Exception e) {
			System.err.println("Houve um erro ao adicionar aluno: " + e.getMessage());
		}
	}
}
