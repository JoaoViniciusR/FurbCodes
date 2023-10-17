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


public class Funcionario {
    
    private int matricula; 
    private String nome;
    private int departamento;
    private float salario;
    private String funcao;

    public Funcionario(int matricula, String nome, int departamento, float salario, String funcao) {
        setMatricula(matricula);
        setNome(nome);
        setDepartamento(departamento);
        setSalario(salario);
        setFuncao(funcao);
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) throws IllegalArgumentException {
        if (matricula < 0) {
            throw new IllegalArgumentException("Número da matrícula inválido");
        }
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws IllegalArgumentException {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome do funcionário inválido");
        }
        this.nome = nome;
    }

    public int getDepartamento() {
        return departamento;
    }

    public void setDepartamento(int departamento) throws IllegalArgumentException {
        if (departamento < 0) {
            throw new IllegalArgumentException("Departamento inválido");
        }
        this.departamento = departamento;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) throws IllegalArgumentException {
        if (salario < 0) {
            throw new IllegalArgumentException("Salário inválido");
        }
        this.salario = salario;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) throws IllegalArgumentException {
        if (funcao == null || funcao.trim().isEmpty()) {
            throw new IllegalArgumentException("Função inválida");
        }
        this.funcao = funcao;
    } 
}