package AtividadePesoAltura;

import AtividadePesoAltura.Enum.Categoria;

public class Lutador {
    private String nome;
    private float peso;
    private Categoria categoria;

    public Lutador(String nome, float peso, Categoria categoria) {
        this.nome = nome;
        this.peso = peso;
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Lutador{" + "nome=" + nome + ", peso=" + peso + ", categoria=" + categoria + '}';
    }
}