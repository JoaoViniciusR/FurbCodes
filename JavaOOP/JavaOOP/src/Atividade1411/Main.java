package Atividade1411;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        //definindo diretório
        File dir = new File("c://temp/");
        //pegando a lista de arquivos e diretórios
        File conteudoDir[] = dir.listFiles();
        double total = 0.0;
        //varrendo o vetor que contem a lista de arquivos e diretórios
        for (File file : conteudoDir) {
            if(file.isDirectory()) {
                System.out.println("<DIR>" + file.getName());
            }
            else {
                total += file.length();
                System.out.println(file.getName() + "/t" + file.length());
            }
        }


        System.out.println("<DIR> " + conteudoDir.toString() + "total: " + total);
    }    
}
