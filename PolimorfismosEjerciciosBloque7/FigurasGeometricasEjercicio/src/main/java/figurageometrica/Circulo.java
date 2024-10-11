package figurageometrica;

public class Circulo extends FiguraGeometrica {
    public Circulo(int valor1) {
        super(valor1);
    }

    @Override
    public double getArea() {
        return 3.14 * Math.pow(valor1, 2);
    }

    @Override
    public double getPerimetro() {
        return 2 * 3.14 * valor1;
    }
}
