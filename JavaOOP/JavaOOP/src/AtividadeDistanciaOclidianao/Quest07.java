package AtividadeDistanciaOclidianao;

public class Quest07 {
    
    public Double calcularDistancia(Ponto p1, Ponto p2) {
        return Math.sqrt(Math.pow(p1.getX1() - p2.getX1(), 2) + Math.pow(p1.getY1() - p2.getY1(), 2));
    }

    public static void main(String[] args) {
        Ponto p1 = new Ponto(1, 1);
        Ponto p2 = new Ponto(1, 3);
        System.out.println(new Quest07().calcularDistancia(p1, p2));
    }
}
