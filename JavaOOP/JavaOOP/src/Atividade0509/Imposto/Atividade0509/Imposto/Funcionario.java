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

    public double calcularIrpf() {
        double irpf = 0.0;

        if (salario <= 1903.98) {
            irpf = 0.0;
        } else if (salario <= 2826.65) {
            irpf = (salario - 1903.99) * 0.075;
        } else if (salario <= 3751.05) {
            irpf = (salario - 2826.66) * 0.15 + (2826.65 - 1903.99) * 0.075;
        } else if (salario <= 4664.68) {
            irpf = (salario - 3751.06) * 0.225 + (3751.05 - 2826.66) * 0.15 + (2826.65 - 1903.99) * 0.075;
        } else {
            irpf = (salario - 4664.69) * 0.275 + (4664.68 - 3751.06) * 0.225 + (3751.05 - 2826.66) * 0.15 + (2826.65 - 1903.99) * 0.075;
        }

        return irpf;
    }

    public String imprimir() {
        return "Nome: " + nome + "\nSalário: R$" + salario + "\nIRPF: R$" + calcularIrpf();
    }
    
}
