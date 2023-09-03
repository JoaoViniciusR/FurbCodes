public class Carro {
    private String modelo;
    private String marca;
    private String placa;
    private String cor;
    private int ano;
    private double preco;
    private int localizacao;

    public Carro(String modelo, String marca, String placa, String cor, int ano, double preco, int localizacao) {
        this.modelo = modelo;
        this.marca = marca;
        this.placa = placa;
        this.cor = cor;
        this.ano = ano;
        this.preco = preco;
        this.localizacao = localizacao;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getPlaca() {
        return placa;
    }

    public String getCor() {
        return cor;
    }

    public int getAno() {
        return ano;
    }

    public double getPreco() {
        return preco;
    }

    public int getLocalizacao() {
        return localizacao;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setLocalizacao(int localizacao) {
        this.localizacao = localizacao;
    }

    @Override
    public String toString() {
        return "Modelo: " + modelo + "\nMarca: " + marca + "\nPlaca: " + placa + "\nCor: " + cor +
                "\nAno: " + ano + "\nPreço: R$ " + preco + "\nLocalização: " + localizacao;
    }
}
