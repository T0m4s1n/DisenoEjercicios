package figurageometrica;

public class Cuadrado extends FiguraGeometrica {
    public Cuadrado(int valor1) {
        super(valor1);
    }

    @Override
    public double getArea() {
        return valor1 * valor1;
    }

    @Override
    public double getPerimetro() {
        return valor1 * 4;
    }
}
