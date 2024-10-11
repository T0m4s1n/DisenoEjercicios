package com.facultades;

public class Profesor extends Empleado {
    private String area;

    public Profesor(String nombre, String apellido, int cedula, int eleccion, int anodeincorporacion, int numeroOficina, String area) {
        super(nombre, apellido, cedula, eleccion, anodeincorporacion, numeroOficina);
        this.area = area;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public void cambiarArea(String area){
        this.area = area;
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "area='" + area + '\'' +
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
        System.out.println("Area: " + area);
    }
    
}
