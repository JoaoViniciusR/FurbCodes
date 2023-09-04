import java.util.List;

public class Main {
    public static void main(String[] args) {
        Revendedora revendedora = new Revendedora();

        revendedora.adicionarCarro(new Carro("Gol", "VW", "MMM001", "Preta", 2009, 25000.0, 1));
        revendedora.adicionarCarro(new Carro("Fox", "VW", "LML002", "Vermelha", 2010, 30000.0, 2));
        revendedora.adicionarCarro(new Carro("Uno", "Fiat", "MLM003", "Cinza", 2011, 32000.0, 3));
        revendedora.adicionarCarro(new Carro("Fiesta", "Ford", "LLL004", "Branca", 2009, 29000.0, 1));
        revendedora.adicionarCarro(new Carro("Palio", "Fiat", "KKK345", "Amarelo", 2011, 26000.0, 1));

        List<Carro> carrosMaisCaros2011 = revendedora.carrosMaisCarosDoAno(2011);
        System.out.println("Carros mais caros de 2011:");
        for (Carro carro : carrosMaisCaros2011) {
            System.out.println(carro);
        }

        List<Carro> carrosFiatPrecoEntre25e30Mil = revendedora.carrosPorMarcaEPreco("Fiat", 25000.0, 30000.0);
        System.out.println("\nCarros Fiat com preço entre R$ 25.000 e R$ 30.000:");
        for (Carro carro : carrosFiatPrecoEntre25e30Mil) {
            System.out.println(carro);
        }

        List<Carro> carrosMaisCarosEMaisBaratosLocal1 = revendedora.carrosMaisCarosEMaisBaratosPorLocal(1);
        System.out.println("\nCarros mais caros e mais baratos da localização 1:");
        for (Carro carro : carrosMaisCarosEMaisBaratosLocal1) {
            System.out.println(carro);
        }
    }
}
