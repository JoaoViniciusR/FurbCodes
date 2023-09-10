package Atividade0509.Imposto;

public class Funcionario {
    private String nome;
    private double salario;
    
    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "nome=" + nome + ", salario=" + salario + '}';
    }

    public double calcularIrpf() {
        if(getSalario() <= 1903.98) {
        }
        else if (getSalario() >= 1903.99 && getSalario() <= 2826.65) {
            setSalario(getSalario() - ((getSalario() - 1903.98) * 0.075));
        }
        else if (getSalario() >= 2826.66 && getSalario() <= 3751.05) {
            setSalario(getSalario() - (((getSalario() - 2826.65) * 0.15) + ((2826.65 - 1903.99) * 0.075)));
        }
        else if (getSalario() >= 3751.06 && getSalario() <= 4664.68) {
            setSalario(getSalario() - (((getSalario() - 3751.05) * 0.225)+ ((2826.65 - 1903.99) * 0.075) + ((3751.05 - 2826.66) * 0.15)));
        }
        else if (getSalario() >= 4664.69) {
            setSalario((getSalario() - 4664.69) * 0.275 + (4664.68 - 3751.06) * 0.225 + (3751.05 - 2826.66) * 0.15 + (2826.65 - 1903.99) * 0.075);
        }
        return getSalario();
    }
    
}
