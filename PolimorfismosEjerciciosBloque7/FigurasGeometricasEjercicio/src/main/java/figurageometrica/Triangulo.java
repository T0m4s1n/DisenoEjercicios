package figurageometrica;

public class Triangulo extends FiguraGeometrica {
    protected int valor2;

    public Triangulo(int valor1,int valor2){
        super(valor1);
        this.valor2 = valor2;
    }

    public int getValor2(){
        return valor2;
    }

    @Override
    public double getArea(){
        return 1.0;
    }

    @Override
    public double getPerimetro(){
        return 1.0;
    }

    public void setValor2(int valor2){
        this.valor2 = valor2;
    }
}
