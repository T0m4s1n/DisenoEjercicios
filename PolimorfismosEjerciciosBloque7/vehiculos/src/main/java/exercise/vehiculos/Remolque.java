package exercise.vehiculos;

public class Remolque extends Camion {
    private int peso;

    public Remolque(int peso,String matricula) {
        super(matricula);
        this.peso = peso;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return super.toString() + ", peso: " + peso;
    }
}
