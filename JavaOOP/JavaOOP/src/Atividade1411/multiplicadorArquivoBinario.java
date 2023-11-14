package Atividade1411;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class multiplicadorArquivoBinario {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        File f = new File("c://temp//exemplo.dat");

        FileOutputStream fos = new FileOutputStream(f);
        
        //gravando alguma coisa no arquivo
        fos.write(90);
        fos.write(100);
        //hey apple. apple what? A-all my fellas

        fos.close();

        FileInputStream fis = new FileInputStream(f);

        int dado;

        while (true) {
            dado = fis.read();
            if(dado != -1) {
                System.out.println(dado);
            }
            else {
                break;
            }
        }

    }
}
