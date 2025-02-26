
import java.util.ArrayList;


public class Lista_Linear_Estatica {
    private int tamanho;
    private ArrayList<Integer> info;


    public Lista_Linear_Estatica(int tamanho) {
        this.tamanho = tamanho;
        this.info = new ArrayList<>(tamanho);
    }

    public void inserir(int indice, int valor){
        if(indice < 0 || indice > this.tamanho){
            throw new IndexOutOfBoundsException("Indice inválido");
        }
        else{
            this.info.add(indice, valor);
        }
    }
    private void redimensionar(){
        int novoTamanho = this.tamanho * 2;
        ArrayList<Integer> novoArray = new ArrayList<>(novoTamanho);
        novoArray.addAll(this.info);
        this.info = novoArray;
        this.tamanho = novoTamanho;
    }
    public void exibir(){
        for(int i = 0; i <= this.info.size(); i++){
            System.out.print(this.info.get(i) + " ");
        }
    }
    public int buscar(int numero){
        for(int i = 0; i < this.info.size(); i++){
            if(this.info.get(i) == numero){
                return i;
            }
        }
        return -1;

    }
    public void retirar(int posicao){
        if(posicao < 0 || posicao >= this.info.size()){
            throw new IndexOutOfBoundsException("Indice inválido");
        }
        else{
            this.info.remove(posicao);
            for(int i = 0; i < this.info.size(); i++){
                if(this.info.get(i) == null){
                    this.info.set(i, this.info.get(i + 1));
                    this.info.set(i + 1, 0);
                }
            }
        }
    }
    public void liberar(){
        this.info.clear();
        this.tamanho = 10;
    }
    public int obterElemento(int posicao){
        if(posicao < 0 || posicao >= this.info.size()){
            throw new IndexOutOfBoundsException("Indice inválido");
        }
        else{
            for(int i = posicao; i < this.info.size(); i++){
                if(this.info.get(i) == posicao){
                    
                }
            }
            return this.info.get(posicao);
        }
    }
    public boolean estaVazia(){
        return this.info.isEmpty();
    }
    public int getTamanho(){
        return this.info.size();
    }
    public String ToString(){
        return this.info.toString();
    }
}
