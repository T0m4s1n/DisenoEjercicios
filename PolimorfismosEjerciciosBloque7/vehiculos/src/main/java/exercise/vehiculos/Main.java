package exercise.vehiculos;

public class Main {
    public static void main(String[] args) {
        Coche coche = new Coche("1234ABC", 4);
        System.out.println(coche);

        Camion camion = new Camion("5678DEF");
        System.out.println(camion);

        Remolque remolque = new Remolque(2000, "5678DEF");
        camion.setRemolque(remolque);
        System.out.println(camion);

        camion.acelerar(50);
        System.out.println(camion);

        camion.quitarRemolque();
        System.out.println(camion);
    }
}