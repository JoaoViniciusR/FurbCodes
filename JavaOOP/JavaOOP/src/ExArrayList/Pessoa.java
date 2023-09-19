package ExArrayList;

import java.util.ArrayList;

public class Pessoa {
        
    private String name;
    private ArrayList<Endereco> enderecos;
    
    public Pessoa() {
        
    }
    
    public Pessoa(String name, ArrayList<Endereco> enderecos) {
        this.name = name;
        this.enderecos = enderecos;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(ArrayList<Endereco> enderecos) {
        this.enderecos = enderecos;
    }

    public void imprimirEndereco() {
        System.out.println("Nome: " + getName());
        for (Endereco endereco : enderecos) {
            System.out.println(endereco.toString());
        }
    }    
}
