package figurageometrica;

public class Main {
    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo(3, 4);
        Rectangulo rectangulo = new Rectangulo(5, 6);
        Cuadrado cuadrado = new Cuadrado(4);
        Cubo cubo = new Cubo(3);
        Circulo circulo = new Circulo(7);

        System.out.println("Triangulo Area: " + triangulo.getArea());
        System.out.println("Triangulo Perimetro: " + triangulo.getPerimetro());

        System.out.println("Rectangulo Area: " + rectangulo.getArea());
        System.out.println("Rectangulo Perimetro: " + rectangulo.getPerimetro());

        System.out.println("Cuadrado Area: " + cuadrado.getArea());
        System.out.println("Cuadrado Perimetro: " + cuadrado.getPerimetro());

        System.out.println("Cubo Area: " + cubo.getArea());

        System.out.println("Circulo Area: " + circulo.getArea());
        System.out.println("Circulo Perimetro: " + circulo.getPerimetro());
    }
}
