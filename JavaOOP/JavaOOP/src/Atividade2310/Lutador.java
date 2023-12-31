package Atividade2310;

public class Lutador extends Atleta{

    public Lutador(String nome, double peso, int idade) {
        super(nome, peso, idade);
    }

    @Override
    public String definirCategoria() {
        if (getPeso() <= 54){
            return "Pluma";
        }
        else if (getPeso() >= 55 || getPeso() <= 60) {
            return "Leve";
        }
        else if (getPeso() >= 60 || getPeso() <= 75) {
            return "Meio-leve";
        }
        else if (getPeso() >= 75) {
            return "Pesado";
        }

        return "Indetermindado";
    }
    
    
}
