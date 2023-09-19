package ExArrayList;

import java.util.ArrayList;

public class TestePessoa {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setName("Amongus");
        
        ArrayList<Endereco> enderecoList = new ArrayList<Endereco>();
        
        // Endereco endereco = new Endereco("tabacus", "casa", 420);
        // Endereco endereco2 = new Endereco("tabacusCristus", "casa", 69);
        
        // enderecoList.add(endereco);
        // enderecoList.add(endereco2);
        pessoa.setEnderecos(enderecoList);
        
        // System.out.println(pessoa.imprimirEndereco());
        pessoa.imprimirEndereco();
    }

}
