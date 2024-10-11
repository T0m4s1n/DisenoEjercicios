package figurageometrica;

public class Cubo extends Cuadrado {
    public Cubo(int valor1) {
        super(valor1);
    }

    @Override
    public double getArea() {
        return 6 * Math.pow(valor1, valor1);
    }  
}
