package heranca;


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
		
		Aluno aluno2 = new Aluno("Isaias","Silveira","Parana", 'M', "202010002178", 100, "Aprovado");
		aluno2.setMatricula("202010002196");
		aluno2.setFrequencia(50);
		aluno2.setStatus("Reprovado"); 
		aluno2.nome = "Isaias";
		aluno2.sobrenome = "Silveira";
		aluno2.endereco = "Parana";
		aluno2.sexo = 'M';

		System.out.println("Nome estudante: " + aluno2.nome + " sobrenome: " + aluno2.sobrenome + " endereco: " + aluno2.endereco + " sexo: " + aluno2.sexo + " matricula: " + aluno2.matricula + " frequência: " + aluno2.frequencia + " status: " + aluno2.status);

		try {
			aluno2.cadastraAluno("201910004597", 100, "Aprovado");
			System.out.println("Aluno adicionado com sucesso!");
			System.out.println("Matricula: " + aluno2.matricula + " frequência: " + aluno2.frequencia + " situacao: " + aluno2.status);
		} catch(Exception e) {
			System.err.println("Houve um erro ao adicionar aluno: " + e.getMessage());
		}
	}
}
