package Model.Questão1;

public class Turma {
    private Aluno[] alunos;

    public Turma(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public void listarAprovados() {
        System.out.println("Alunos Aprovados:");
        for (Aluno aluno : alunos) {
            if (aluno.estaAprovado()) {
                System.out.println(aluno.getNome() + " - Média: " + aluno.calcularMedia());
            }
        }
    }

    public void listarReprovados() {
        System.out.println("Alunos Reprovados:");
        for (Aluno aluno : alunos) {
            if (!aluno.estaAprovado()) {
                System.out.println(aluno.getNome() + " - Média: " + aluno.calcularMedia());
            }
        }
    }
}

