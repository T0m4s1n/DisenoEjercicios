package com.facultades;

public class Empleado extends Persona {
    private int anodeincorporacion;
    private int numeroOficina;

    public Empleado(String nombre, String apellido, int cedula, int eleccion, int anodeincorporacion, int numeroOficina) {
        super(nombre, apellido, cedula, eleccion);
        this.anodeincorporacion = anodeincorporacion;
        this.numeroOficina = numeroOficina;
    }

    public int getAnodeincorporacion() {
        return anodeincorporacion;
    }

    public void setAnodeincorporacion(int anodeincorporacion) {
        this.anodeincorporacion = anodeincorporacion;
    }

    public int getNumeroOficina() {
        return numeroOficina;
    }

    public void setNumeroOficina(int numeroOficina) {
        this.numeroOficina = numeroOficina;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "anodeincorporacion=" + anodeincorporacion +
                ", numeroOficina=" + numeroOficina +
                '}';
    }

    public void reasingarOficina(int numeroOficina){
        this.numeroOficina = numeroOficina;
    }

    @Override
    public void mostrar(){
        System.out.println("Nombre: " + getNombre());
        System.out.println("Apellido: " + getApellido());
        System.out.println("Cedula: " + getCedula());
        System.out.println("Estado Civil: " + getEstadoCivil());
        System.out.println("Año de Incorporacion: " + anodeincorporacion);
        System.out.println("Numero de Oficina: " + numeroOficina);
    }
}
