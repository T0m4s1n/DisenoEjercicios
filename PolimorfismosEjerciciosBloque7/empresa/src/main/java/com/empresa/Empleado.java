package com.empresa;

public class Empleado {
    private String nombre;
    private String apellidos;
    private int cedula;
    private String direccion;
    private int edad;
    private String telefono;
    private double salario;
    private Empleado supervisor;

    public Empleado(String nombre, String apellidos, int cedula, String direccion, int edad, String telefono, double salario, Empleado supervisor) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.cedula = cedula;
        this.direccion = direccion;
        this.edad = edad;
        this.telefono = telefono;
        this.salario = salario;
        this.supervisor = supervisor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Empleado getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Empleado supervisor) {
        this.supervisor = supervisor;
    }

    public void incrementarSalario(){
        double nuevoSalario = this.getSalario() + (this.getSalario() * 0.1);
        this.setSalario(nuevoSalario);
    }

    public void mostrar(){
        System.out.println("Nombre: " + this.getNombre());
        System.out.println("Apellidos: " + this.getApellidos());
        System.out.println("Cedula: " + this.getCedula());
        System.out.println("Direccion: " + this.getDireccion());
        System.out.println("Edad: " + this.getEdad());
        System.out.println("Telefono: " + this.getTelefono());
        System.out.println("Salario: " + this.getSalario());
        System.out.println("Supervisor: " + this.getSupervisor().getNombre());
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", cedula=" + cedula +
                ", direccion='" + direccion + '\'' +
                ", edad=" + edad +
                ", telefono='" + telefono + '\'' +
                ", salario=" + salario +
                ", supervisor=" + supervisor.getNombre() +
                '}';
    }
}
