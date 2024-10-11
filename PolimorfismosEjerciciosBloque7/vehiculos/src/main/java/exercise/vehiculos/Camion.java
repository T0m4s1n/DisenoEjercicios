package exercise.vehiculos;

public class Camion extends Vehiculo {
    private Remolque remolque;

    public Camion(String matricula) {
        super(matricula);
        this.remolque = null;
    }

    public Remolque getRemolque() {
        return remolque;
    }

    public void setRemolque(Remolque remolque) {
        this.remolque = remolque;
    }

    public void quitarRemolque() {
        this.remolque = null;
    }

    @Override
    public String toString() {
        return super.toString() + ", remolque: " + remolque;
    }

    @Override
    public double acelerar(double aceleracion) {
        double resultado = super.acelerar(aceleracion);
        if(aceleracion > 100.0){
            System.err.println("vas demasiado rapido ome");
            return resultado;
        }
        if (remolque != null) {
            remolque.acelerar(aceleracion);
        }
        return resultado;
    }
}
