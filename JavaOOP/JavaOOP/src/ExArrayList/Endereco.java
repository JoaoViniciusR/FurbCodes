package ExArrayList;

public class Endereco {

    private String logradouro;
    private String complemento;
    private int numero;
    
    public Endereco(String logradouro, String complemento, int numero) {
        this.logradouro = logradouro;
        this.complemento = complemento;
        this.numero = numero;
    }

    public String getLogradouro() {
        return logradouro;
    }
    public void setLogradouro(String logradouro) {
        if(logradouro.trim().isEmpty()) {
            throw new IllegalArgumentException("Logradouro incorrect");
        }
        this.logradouro = logradouro;
    }
    public String getComplemento() {
        return complemento;
    }
    public void setComplemento(String complemento) {
        if(complemento.trim().isEmpty()) {
            throw new IllegalArgumentException("Complemento incorrect");
        }
        this.complemento = complemento;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        if (numero <= 0) {
            throw new IllegalArgumentException("Invalid number");
        }
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "\n Logradouro: " + logradouro + "\n complemento: " + complemento + "\n número: " + numero;
    }

}
