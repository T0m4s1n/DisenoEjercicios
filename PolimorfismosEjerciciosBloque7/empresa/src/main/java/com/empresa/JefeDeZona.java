package com.empresa;
import java.util.ArrayList;
import java.util.List;

public class JefeDeZona extends Empleado {
    private String oficina;
    private Secretario secretario;
    private List<Vendedor> listaVendedores = new ArrayList<>();
    private EmpresaCarro carro;

    public JefeDeZona(String nombre, String apellidos, int cedula, String direccion, int edad, String telefono, double salario, Empleado supervisor, String oficina, Secretario secretario, EmpresaCarro carro) {
        super(nombre, apellidos, cedula, direccion, edad, telefono, salario, supervisor);
        this.oficina = oficina;
        this.secretario = secretario;
        this.carro = carro;
    }

    public String getOficina() {
        return oficina;
    }

    public void setOficina(String oficina) {
        this.oficina = oficina;
    }

    public Secretario getSecretario() {
        return secretario;
    }

    public void setSecretario(Secretario secretario) {
        this.secretario = secretario;
    }

    public List<Vendedor> getListaVendedores() {
        return listaVendedores;
    }

    public void setListaVendedores(List<Vendedor> listaVendedores) {
        this.listaVendedores = listaVendedores;
    }

    public EmpresaCarro getCarro() {
        return carro;
    }

    public void setCarro(EmpresaCarro carro) {
        this.carro = carro;
    }

    public void anadirVendedor(Vendedor vendedor){
        listaVendedores.add(vendedor);
    }

    public void eliminarVendedor(Vendedor vendedor){
        listaVendedores.remove(vendedor);
    }

    public void mostrarLista(){
        for (Vendedor vendedor : listaVendedores) {
            System.out.println(vendedor);
        }
    }

    public void nuevoSecretario(Secretario secretario){
        this.secretario = secretario;
        secretario.mostrar();
    }

    public void nuevoCarro(EmpresaCarro carro){
        this.carro = carro;
        System.out.println("Nuevo carro asignado: " + carro);
    }
    
    @Override
    public void incrementarSalario(){
        double nuevoSalario = getSalario() * 1.1;
        setSalario(nuevoSalario);
    }

    @Override
    public String toString() {
        return super.toString() + ", oficina: " + oficina + ", secretario: " + secretario + ", carro: " + carro;
    }
}