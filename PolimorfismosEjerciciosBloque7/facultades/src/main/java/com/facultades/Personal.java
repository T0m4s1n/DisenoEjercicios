package com.facultades;

public class Personal extends Empleado {
    private String seccion;

    public Personal(String nombre, String apellido, int cedula, int eleccion, int anodeincorporacion, int numeroOficina, String seccion) {
        super(nombre, apellido, cedula, eleccion, anodeincorporacion, numeroOficina);
        this.seccion = seccion;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public void cambiarSeccion(String seccion){
        this.seccion = seccion;
    }

    @Override
    public String toString() {
        return "Personal{" +
                "seccion='" + seccion + '\'' +
                '}';
    }

    @Override
    public void mostrar(){
        System.out.println("Nombre: " + getNombre());
        System.out.println("Apellido: " + getApellido());
        System.out.println("Cedula: " + getCedula());
        System.out.println("Estado Civil: " + getEstadoCivil());
        System.out.println("Año de Incorporacion: " + getAnodeincorporacion());
        System.out.println("Numero de Oficina: " + getNumeroOficina());
        System.out.println("Seccion: " + seccion);
    }
}
