package Atividade0509.Imposto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Funcionario[] funcionarios = new Funcionario[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o nome do funcionário " + (i + 1) + ": ");
            String nome = scanner.nextLine();

            System.out.print("Digite o salário do funcionário " + (i + 1) + ": ");
            double salario = scanner.nextDouble();
            scanner.nextLine(); // Consumir a quebra de linha

            funcionarios[i] = new Funcionario(nome, salario);
        }

        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario.imprimir());
            System.out.println();
        }

        double maxIRPF = Double.MIN_VALUE;
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.calcularIrpf() > maxIRPF) {
                maxIRPF = funcionario.calcularIrpf();
            }
        }

        System.out.println("Funcionário(s) que paga(m) mais IRPF:");

        for (Funcionario funcionario : funcionarios) {
            if (funcionario.calcularIrpf() == maxIRPF) {
                System.out.println(funcionario.imprimir());
            }
        }

        scanner.close();
    }
}
