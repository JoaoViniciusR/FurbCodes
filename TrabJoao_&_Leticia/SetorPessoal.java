//Letícia Fruet
//João Vinícius Rosá


/*Escreva uma classe “SetorPessoal” que tenha como atributo um vetor da classe “Funcionário” (com os atributos matricula (int), 
nome (String), departamento (int), salário (float) e função (String)) e uma variável inteira para ser usada como índice do vetor. 
Crie um construtor que receba como parâmetro o número de funcionários de uma empresa para instanciar o vetor e inicialize o índice 
do vetor com zero. (ok)

Acrescente os seguintes métodos a classe: 
a) Um método para adicionar funcionários no vetor definido na classe (ok)
b) Um método que possa imprimir a folha de pagamento informando o nome dos funcionários e o seus respectivos salários (ok)
c) Um método que possa retornar o valor total da folha de pagamento (ok)
d) Um método que possa retornar o nome do funcionário que recebe o maior salário (ok)
----------------
e) Um método que possa receber como parâmetro o número de um determinado departamento e mostrar o nome e 
o cargo de todos os funcionários daquele departamento 
f) Um método que possa receber como parâmetro o nome de uma determinada função e posteriormente imprimir 
o nome de todas as pessoas que exercem essa função 
g) Um método que possa imprimir a folha de pagamento informando o nome dos funcionários e o seus 
respectivos salários em ordem crescente de salário. 
Dica: É necessário criar um outro vetor que conterá o vetor original e posteriormente ordená-lo.  */

import java.util.Arrays;

public class SetorPessoal {

    private Funcionario[] funcionarios;
    private int indice;

    public SetorPessoal(int numFuncionarios) {
        setFuncionarios(new Funcionario[numFuncionarios]);
        setIndice(0);
    }

    public Funcionario[] getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(Funcionario[] funcionarios) {
        this.funcionarios = funcionarios;
    }

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) throws IllegalArgumentException {
        if (indice < 0) {
            throw new IllegalArgumentException("Índice inválido");
        }
        this.indice = indice;
    }

    // adicionanado funcionários no vetor funcionarios
    // caso o vetor esteja cheio, o usuário receberá uma mensagem informativa
    public void adicionarFuncionario(Funcionario f) {

        if (indice < funcionarios.length) {
            funcionarios[indice] = f;
            indice++;
        } else {
            System.out.println("Não é possível adicionar mais funcionários, pois o setor pessoal está cheio.");
        }
    }

    // imprimindo a folha de pagamento informando o nome dos funcionários e o seus
    // respectivos salários
    public String imprimirFolhaDePagamento() {
        StringBuilder str = new StringBuilder();
    
        for (Funcionario f : funcionarios) {
            if (f != null) {
                str.append("Funcionário: ").append(f.getNome()).append("\tSalário R$").append(f.getSalario()).append("\n");
            }
        }
        return str.toString();
    }
    

    // retornando o valor total da folha de pagamento
    // a variável soma adiciona o salário do funcionário f à soma anterior
    public double calcularValorTotalDaFolha() {
        double soma = 0;
    
        for (Funcionario f : funcionarios) {
            if (f != null) {
                soma += f.getSalario();
            }
        }
    
        return soma;
    }
    

    // retornando o nome do funcionário que recebe o maior salário
    // a variável maiorSalario recebe o valor do maior salário
    // a váriavel funcionarioMaiorSalario recebe o nome do funcionário com maior
    // salário
    public String calcularMaiorSalario() {
        double maiorSalario = Double.MIN_VALUE;
        String funcionarioMaiorSalario = "";
    
        for (Funcionario f : funcionarios) {
            if (f != null) {
                if (f.getSalario() > maiorSalario) {
                    maiorSalario = f.getSalario();
                    funcionarioMaiorSalario = f.getNome();
                }
            }
        }
    
        if (!funcionarioMaiorSalario.isEmpty()) {
            return "O funcionário com maior salário é: " + funcionarioMaiorSalario + " - R$ " + maiorSalario;
        } else {
            return "Não há funcionários cadastrados ou todos têm salário igual a zero.";
        }
    }
    
    // recebendo como parâmetro o número de um determinado departamento e
    // mostrando o nome e o cargo de todos os funcionários daquele departamento
    public String verificarDepartamento(int novoDepartamento) {
        StringBuilder resultado = new StringBuilder();
    
        for (Funcionario f : funcionarios) {
            if (f != null) {
                if (f.getDepartamento() == novoDepartamento) {
                    resultado.append("Nome: ").append(f.getNome()).append("\tCargo: ").append(f.getFuncao()).append("\n");
                }
            }
        }
    
        if (resultado.length() == 0) {
            resultado.append("Não existem funcionários no departamento ").append(novoDepartamento);
        }
    
        return resultado.toString();
    }
    

    // recebendo como parâmetro o nome de uma determinada função e
    // imprimindo o nome de todas as pessoas que exercem essa função
    public String verificarFuncao(String nomeFuncao) {
        StringBuilder resultado = new StringBuilder();
    
        for (Funcionario f : funcionarios) {
            if (f != null) {
                if (f.getFuncao().equals(nomeFuncao)) {
                    resultado.append("Nome: ").append(f.getNome()).append("\n");
                }
            }
        }
    
        if (resultado.length() == 0) {
            resultado.append("Não existem funcionários na função ").append(nomeFuncao);
        }
    
        return resultado.toString();
    }
    

    // imprimindo a folha de pagamento informando o nome dos funcionários e
    // os seus respectivos salários em ordem crescente de salário.
    public String ordenarSalarios() {

        Funcionario[] funcionariosOrdenados = Arrays.copyOf(funcionarios, indice);
        Arrays.sort(funcionariosOrdenados, (f1, f2) -> Double.compare(f1.getSalario(), f2.getSalario()));

        StringBuilder resultado = new StringBuilder();
        for (Funcionario f : funcionariosOrdenados) {
            resultado.append("Nome: ").append(f.getNome()).append("\tSalário: R$").append(f.getSalario()).append("\n");
        }

        return resultado.toString();
    }
}
