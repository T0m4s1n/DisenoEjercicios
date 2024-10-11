package figurageometrica;

public class FiguraGeometrica {
    protected int valor1;

    public FiguraGeometrica(int valor1){
        this.valor1 = valor1;
    }
    
    public double getArea(){
        return 1.0;
    }

    public double getPerimetro(){
        return 1.0;
    }

    public void setArea(double area){
        System.out.println("El area es: " + area);
    }

    public void setPerimetro(double perimetro){
        System.out.println("El perimetro es: " + perimetro);
    }

    public int getValor1() {
        return valor1;
    }

    public void setValor1(int valor1) {
        this.valor1 = valor1;
    }
}
