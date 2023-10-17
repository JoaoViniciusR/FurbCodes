package Atividade1710;

public class ProfessorHorista extends Professor{
    private double salarioHora;
    private int totalHora;
    
    public ProfessorHorista(String nome, String matricula, int idade, double salarioHora,int totalHora) {
        super(nome, matricula, idade);
        this.salarioHora = salarioHora;
        this.totalHora = totalHora;
    }

    public double getSalarioHora() {
        return salarioHora;
    }

    public void setSalarioHora(double salarioHora) {
        this.salarioHora = salarioHora;
    }

    @Override
    public int getIdade() {
        // TODO Auto-generated method stub
        return super.getIdade();
    }

    @Override
    public String getMatricula() {
        // TODO Auto-generated method stub
        return super.getMatricula();
    }

    @Override
    public String getNome() {
        // TODO Auto-generated method stub
        return super.getNome();
    }

    @Override
    public void setIdade(int idade) {
        // TODO Auto-generated method stub
        super.setIdade(idade);
    }

    @Override
    public void setMatricula(String matricula) {
        // TODO Auto-generated method stub
        super.setMatricula(matricula);
    }

    @Override
    public void setNome(String nome) {
        // TODO Auto-generated method stub
        super.setNome(nome);
    }

    public int getTotalHora() {
        return totalHora;
    }

    public void setTotalHora(int totalHora) {
        this.totalHora = totalHora;
    }    
}
