package com.empresa;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Empleado empleado = new Empleado("empleadoNombre", "empleadoApellido", 654321, "direccionEmpleado", 30, "telefonoEmpleado", 3000.0, null);
            Secretario secretario = new Secretario("secretarioNombre", "secretarioApellido", 789012, "direccionSecretario", 25, "telefonoSecretario", 2000, empleado, "oficinaSecretario", "faxSecretario");
            JefeDeZona jefeDeZona = new JefeDeZona("tomas", "benavides", 123456, "obonuco", 18, "1234", 5000, empleado, "oficina1", secretario, new EmpresaCarro("123PORTI", "Toyota", "Corolla"));

            while (true) {
                System.out.println("Menu:");
                System.out.println("1. Mostrar Jefe de Zona");
                System.out.println("2. Añadir Vendedor");
                System.out.println("3. Eliminar Vendedor");
                System.out.println("4. Mostrar Lista de Vendedores");
                System.out.println("5. Asignar Nuevo Secretario");
                System.out.println("6. Asignar Nuevo Carro");
                System.out.println("7. Incrementar Salario del Jefe de Zona");
                System.out.println("8. Salir");
                System.out.print("Seleccione una opción: ");
                int opcion = scanner.nextInt();
                scanner.nextLine();

                switch (opcion) {
                    case 1 -> System.out.println(jefeDeZona);
                    case 2 -> {
                        System.out.print("Nombre del Vendedor: ");
                        String nombre = scanner.nextLine();
                        System.out.print("Apellidos del Vendedor: ");
                        String apellidos = scanner.nextLine();
                        System.out.print("Cedula del Vendedor: ");
                        int cedula = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Direccion del Vendedor: ");
                        String direccion = scanner.nextLine();
                        System.out.print("Edad del Vendedor: ");
                        int edad = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Telefono del Vendedor: ");
                        String telefono = scanner.nextLine();
                        System.out.print("Salario del Vendedor: ");
                        double salario = scanner.nextDouble();
                        scanner.nextLine();
                        System.out.print("Celular del Vendedor: ");
                        String celular = scanner.nextLine();
                        System.out.print("Areas de Venta del Vendedor: ");
                        String areasDeVenta = scanner.nextLine();
                        System.out.print("Comision del Vendedor: ");
                        double comision = scanner.nextDouble();
                        scanner.nextLine();
                        Vendedor vendedor = new Vendedor(nombre, apellidos, cedula, direccion, edad, telefono, salario, jefeDeZona, new EmpresaCarro("XYZ789", "Honda", "Civic"), celular, areasDeVenta, comision);
                        jefeDeZona.anadirVendedor(vendedor);
                    }
                    case 3 -> {
                        System.out.print("Cedula del Vendedor a eliminar: ");
                        int cedulaEliminar = scanner.nextInt();
                        scanner.nextLine();
                        Vendedor vendedorEliminar = null;
                        for (Vendedor v : jefeDeZona.getListaVendedores()) {
                            if (v.getCedula() == cedulaEliminar) {
                                vendedorEliminar = v;
                                break;
                            }
                        }
                        if (vendedorEliminar != null) {
                            jefeDeZona.eliminarVendedor(vendedorEliminar);
                            System.out.println("Vendedor eliminado.");
                        } else {
                            System.out.println("Vendedor no encontrado.");
                        }
                    }
                    case 4 -> jefeDeZona.mostrarLista();
                    case 5 -> {
                        System.out.print("Nombre del Secretario: ");
                        String nombreSec = scanner.nextLine();
                        System.out.print("Apellidos del Secretario: ");
                        String apellidosSec = scanner.nextLine();
                        System.out.print("Cedula del Secretario: ");
                        int cedulaSec = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Direccion del Secretario: ");
                        String direccionSec = scanner.nextLine();
                        System.out.print("Edad del Secretario: ");
                        int edadSec = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Telefono del Secretario: ");
                        String telefonoSec = scanner.nextLine();
                        System.out.print("Salario del Secretario: ");
                        double salarioSec = scanner.nextDouble();
                        scanner.nextLine();
                        System.out.print("Oficina del Secretario: ");
                        String oficinaSec = scanner.nextLine();
                        System.out.print("Fax del Secretario: ");
                        String faxSec = scanner.nextLine();
                        Secretario nuevoSecretario = new Secretario(nombreSec, apellidosSec, cedulaSec, direccionSec, edadSec, telefonoSec, salarioSec, jefeDeZona, oficinaSec, faxSec);
                        jefeDeZona.nuevoSecretario(nuevoSecretario);
                    }
                    case 6 -> {
                        System.out.print("Matricula del nuevo carro: ");
                        String matricula = scanner.nextLine();
                        System.out.print("Marca del nuevo carro: ");
                        String marca = scanner.nextLine();
                        System.out.print("Modelo del nuevo carro: ");
                        String modelo = scanner.nextLine();
                        EmpresaCarro nuevoCarro = new EmpresaCarro(matricula, marca, modelo);
                        jefeDeZona.nuevoCarro(nuevoCarro);
                    }
                    case 7 -> {
                        jefeDeZona.incrementarSalario();
                        System.out.println("Salario incrementado.");
                    }
                    case 8 -> {
                        System.out.println("Saliendo...");
                        scanner.close();
                        return;
                    }
                    default -> System.out.println("Opción no válida.");
                }
            }
        
    }
}