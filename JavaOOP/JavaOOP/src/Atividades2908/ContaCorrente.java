package Atividades2908;

import javax.swing.JOptionPane;

public class ContaCorrente {
    private String nome;
    private double saldo;

    public ContaCorrente(){}

    public ContaCorrente(String nome, double saldoInicial) {
        this.nome = nome;
        this.saldo = saldoInicial;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor inválido");
        }
        setSaldo(getSaldo() + valor);
    }

    public void sacar(double valor) {
        if (valor > getSaldo()) {
            throw new IllegalArgumentException("Saldo insuficiente");
        }
        setSaldo(getSaldo() - valor);
    }

    public void transferir(double valor, ContaCorrente contaDestino) {
        sacar(valor);
        contaDestino.depositar(valor);
    }

    @Override
    public String toString() {
        return "ContaCorrente{" +
                "nome='" + getNome() + '\'' +
                ", saldo=" + getSaldo() +
                '}';
    }

    public ContaCorrente cadasContaCorrente() {
        String nome = JOptionPane.showInputDialog("Digite o seu nome:");
        double saldo = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu saldo:"));
        
        return new ContaCorrente(nome, saldo);
    }
}
