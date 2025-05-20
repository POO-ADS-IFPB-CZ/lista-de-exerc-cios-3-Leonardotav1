package Model.Questão1;

public class Main {
    public static void main(String[] args) {
        // Criando alunos com notas
        Aluno aluno1 = new Aluno("Ana", "A001");
        aluno1.cadastrarNota(8.0);
        aluno1.cadastrarNota(7.5);
        aluno1.cadastrarNota(9.0);

        Aluno aluno2 = new Aluno("Bruno", "A002");
        aluno2.cadastrarNota(5.0);
        aluno2.cadastrarNota(6.0);
        aluno2.cadastrarNota(4.0);

        Aluno aluno3 = new Aluno("Carlos", "A003");
        aluno3.cadastrarNota(7.0);
        aluno3.cadastrarNota(7.0);
        aluno3.cadastrarNota(7.0);
        aluno3.cadastrarNota(7.0);

        // Criando a turma
        Aluno[] listaAlunos = { aluno1, aluno2, aluno3 };
        Turma turma = new Turma(listaAlunos);

        // Exibindo os resultados
        System.out.println("=== RESULTADO FINAL ===");
        turma.listarAprovados();
        turma.listarReprovados();
    }
}
