package Atividade0509.Apolice;

public class Maindots {
    public static void main(String[] args) {
        var apolica = new Apolice();

        apolica.setName("Amongus");
        apolica.setAge(41);
        apolica.setAwardValue(69420);

        apolica.calculateAwardValue();
        System.out.println(apolica.toString());
        apolica.tradeOfferDiscount("Hiroshima");
    }
}
