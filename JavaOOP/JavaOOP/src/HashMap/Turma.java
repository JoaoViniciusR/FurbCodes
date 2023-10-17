package HashMap;

import java.util.ArrayList;

import ExArrayList.Pessoa;

public class Turma {
    private ArrayList<Pessoa> alunos;
    

    public Turma() {
        alunos = new ArrayList<Pessoa>();
    }

    public void adicionarAluno(Pessoa aluno) {
        alunos.add(aluno);
    }

    public ArrayList<Pessoa> obterAlunos() {        
        return alunos;
    }

    public void atualizarAluno(int indice, Pessoa novoAluno) {
        if (indice >= 0 && indice < alunos.size()) {
            alunos.set(indice, novoAluno);
        } else {
            System.out.println("Índice inválido.");
        }
    }

    public void removerAluno(int indice) {
        if (indice >= 0 && indice < alunos.size()) {
            alunos.remove(indice);
        } else {
            System.out.println("Índice inválido.");
        }
    }
}
