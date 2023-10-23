package Atividade2310;

public abstract class Atleta {
    private String nome;
    private double peso;
    private int idade;

    public Atleta(String nome, double peso, int idade) {
        this.nome = nome;
        this.peso = peso;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    

    public abstract String definirCategoria();
    
}
