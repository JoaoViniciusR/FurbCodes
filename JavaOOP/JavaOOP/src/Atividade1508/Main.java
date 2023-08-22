package Atividade1508;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("João", 30);
        Pessoa pessoa2 = new Pessoa("Maria", 25);

        PessoaController controller = new PessoaController();
        controller.adicionarPessoa(pessoa1);
        controller.adicionarPessoa(pessoa2);

        controller.listarPessoas();

        // Modificando atributos usando setters
        pessoa1.setNome("Joana");
        pessoa2.setIdade(26);

        controller.listarPessoas();
    }
}
