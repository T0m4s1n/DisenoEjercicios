package com.empresa;

public class Secretario extends Empleado {
    private String oficina;
    private String fax;

    public Secretario(String nombre, String apellidos, int cedula, String direccion, int edad, String telefono, double salario, Empleado supervisor, String oficina, String fax) {
        super(nombre, apellidos, cedula, direccion, edad, telefono, salario, supervisor);
        this.oficina = oficina;
        this.fax = fax;
    }

    public String getOficina() {
        return oficina;
    }

    public void setOficina(String oficina) {
        this.oficina = oficina;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    @Override
    public void incrementarSalario(){
        double nuevoSalario = getSalario() * 1.05;
        setSalario(nuevoSalario);
    }

    @Override
    public String toString() {
        return super.toString() + ", oficina: " + oficina + ", fax: " + fax;
    } 
}
