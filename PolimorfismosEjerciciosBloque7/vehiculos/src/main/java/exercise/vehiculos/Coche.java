package exercise.vehiculos;

public class Coche extends Vehiculo {
    private int numPuertas;

    public Coche(String matricula, int numPuertas) {
        super(matricula);
        this.numPuertas = numPuertas;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    @Override
    public String toString() {
        return super.toString() + ", numPuertas: " + numPuertas;
    }
}
