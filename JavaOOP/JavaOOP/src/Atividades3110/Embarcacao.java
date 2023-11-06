package Atividades3110;

public abstract class Embarcacao {
    private int resgistroCapitania;
    private int qtdePessoas;


    public Embarcacao(int resgistroCapitania, int qtdePessoas) {
        this.resgistroCapitania = resgistroCapitania;
        this.qtdePessoas = qtdePessoas;
    }


    public int getResgistroCapitania() {
        return resgistroCapitania;
    }


    public void setResgistroCapitania(int resgistroCapitania) {
        this.resgistroCapitania = resgistroCapitania;
    }


    public int getQtdePessoas() {
        return qtdePessoas;
    }


    public void setQtdePessoas(int qtdePessoas) {
        this.qtdePessoas = qtdePessoas;
    }


    public String mostrar() {
        return "Embarcacao [resgistroCapitania=" + resgistroCapitania + ", qtdePessoas=" + qtdePessoas + "]";
    }

    
}
