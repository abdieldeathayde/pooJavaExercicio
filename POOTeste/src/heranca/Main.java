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
		Aluno aluno2.cadastraAluno(null, null, null, 0, null, 0, null);
	}

	private static void cadastraAluno(String string, String string2, String string3, char c, String string4, int i,
			String string5) {
		// TODO Auto-generated method stub
		
	}
}
