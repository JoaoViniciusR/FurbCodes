package Atividade1710;

public class ProfessorDE extends Professor{
    private int salario;

    public ProfessorDE(String nome, String matricula, int idade, int salario) {
        super(nome, matricula, idade);
        this.salario = salario;
    }
    
    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
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
}
