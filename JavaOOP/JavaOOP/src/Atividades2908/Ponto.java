package Atividades2908;

public class Ponto {
    private double x;
    private double y;
    
    public Ponto() {
    }
    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public double getX() {
        return x;
    }
    
    public double getY() {
        return y;
    }
    
    public void setX(double x) {
        this.x = x;
    }
    
    public void setY(double y) {
        this.y = y;
    }

    public double definirQuadrante( double x, double y ) {
        if ( x > 0 && y > 0 ) {
            return 1;
        } else if ( x < 0 && y > 0 ) {
            return 2;
        } else if ( x < 0 && y < 0 ) {
            return 3;
        } else {
            return 4;
        }
    }
    public String imprimir() {
        return ("O quandrante em que as coordenadas estão localizadas é o quadrante " + definirQuadrante(x, y));
    }

    public static void iniciar() {
        Ponto p1 = new Ponto(1, 1);
        Ponto p2 = new Ponto(-1, 1);
        Ponto p3 = new Ponto(-1, -1);
        Ponto p4 = new Ponto(1, -1);
        System.out.println(p1.imprimir());
        System.out.println(p2.imprimir());
        System.out.println(p3.imprimir());
        System.out.println(p4.imprimir());
    }
}
