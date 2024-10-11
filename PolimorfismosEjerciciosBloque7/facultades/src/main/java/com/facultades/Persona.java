package com.facultades;

public class Persona {
    private String nombre;
    private String apellido;
    private int cedula;
    private String estadoCivil;

    public Persona(String nombre, String apellido, int cedula, int eleccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        switch(eleccion){
            case 1:
                this.estadoCivil = "Soltero";
                break;
            case 2:
                this.estadoCivil = "Casado";
                break;
            case 3:
                this.estadoCivil = "Divorciado";
                break;
            case 4:
                this.estadoCivil = "Viudo";
                break;
            default:
                this.estadoCivil = "Soltero";
                break;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public void cambiarEstadoCivil(int eleccion){
        switch(eleccion){
            case 1:
                this.estadoCivil = "Soltero";
                break;
            case 2:
                this.estadoCivil = "Casado";
                break;
            case 3:
                this.estadoCivil = "Divorciado";
                break;
            case 4:
                this.estadoCivil = "Viudo";
                break;
            default:
                this.estadoCivil = "Soltero";
                break;
        }
    }

    public void mostrar(){
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Apellido: " + this.apellido);
        System.out.println("Cedula: " + this.cedula);
        System.out.println("Estado Civil: " + this.estadoCivil);
    }

    @Override
    public String toString() {
        return "Nombre: " + this.nombre + "\nApellido: " + this.apellido + "\nCedula: " + this.cedula + "\nEstado Civil: " + this.estadoCivil;
    }
}
