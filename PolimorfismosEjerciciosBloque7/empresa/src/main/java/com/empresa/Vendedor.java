package com.empresa;
import java.util.ArrayList;
import java.util.List;

public class Vendedor extends Empleado{
    private EmpresaCarro carro;
    private String celular;
    private String areasDeVenta;
    private List<String> listaClientes = new ArrayList<>();
    private double comision;

    public Vendedor(String nombre, String apellidos, int cedula, String direccion, int edad, String telefono, double salario, Empleado supervisor, EmpresaCarro carro, String celular, String areasDeVenta, double comision) {
        super(nombre, apellidos, cedula, direccion, edad, telefono, salario, supervisor);
        this.carro = carro;
        this.celular = celular;
        this.areasDeVenta = areasDeVenta;
        this.comision = comision;
    }

    public EmpresaCarro getCarro() {
        return carro;
    }

    public void setCarro(EmpresaCarro carro) {
        this.carro = carro;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getAreasDeVenta() {
        return areasDeVenta;
    }

    public void setAreasDeVenta(String areasDeVenta) {
        this.areasDeVenta = areasDeVenta;
    }

    public List<String> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(List<String> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    public void anadirCliente(String cliente){
        this.listaClientes.add(cliente);
        double nuevoSalario = this.getSalario() + this.comision;
        this.setSalario(nuevoSalario);
    }

    public void quitarCliente(String cliente){
        this.listaClientes.remove(cliente);
        double nuevoSalario = this.getSalario() - this.comision;
        this.setSalario(nuevoSalario);
    }

    public void mostrarLista(){
        for (String cliente : listaClientes) {
            System.out.println(cliente);
        }
    }

    public void nuevoCarro(EmpresaCarro carro){
        this.carro = carro;
        System.out.println("Nuevo carro asignado" + this.getCarro());
    }

    @Override
    public void incrementarSalario(){
        double nuevoSalario = this.getSalario() + (this.getSalario() * 0.05);
        this.setSalario(nuevoSalario);
    }

    @Override
    public void mostrar(){
        super.mostrar();
        System.out.println("Carro: " + this.getCarro());
        System.out.println("Celular: " + this.getCelular());
        System.out.println("Areas de venta: " + this.getAreasDeVenta());
        System.out.println("Comision: " + this.getComision());
    }
}
