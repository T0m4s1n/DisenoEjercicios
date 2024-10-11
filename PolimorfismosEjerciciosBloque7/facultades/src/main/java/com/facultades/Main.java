package com.facultades;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Ingrese los datos del Profesor:");
                System.out.print("Nombre: ");
                String nombreProfesor = scanner.nextLine();
                System.out.print("Apellido: ");
                String apellidoProfesor = scanner.nextLine();
                System.out.print("Cedula: ");
                int cedulaProfesor = scanner.nextInt();
                System.out.print("Estado Civil (1: Soltero, 2: Casado, 3: Divorciado, 4: Viudo): ");
                int estadoCivilProfesor = scanner.nextInt();
                System.out.print("Año de Incorporacion: ");
                int anioIncorporacionProfesor = scanner.nextInt();
                System.out.print("Numero de Oficina: ");
                int numeroOficinaProfesor = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Area: ");
                String areaProfesor = scanner.nextLine();

                Profesor profesor = new Profesor(nombreProfesor, apellidoProfesor, cedulaProfesor, estadoCivilProfesor, anioIncorporacionProfesor, numeroOficinaProfesor, areaProfesor);
                profesor.mostrar();

                System.out.println("\nIngrese los datos del Personal:");
                System.out.print("Nombre: ");
                String nombrePersonal = scanner.nextLine();
                System.out.print("Apellido: ");
                String apellidoPersonal = scanner.nextLine();
                System.out.print("Cedula: ");
                int cedulaPersonal = scanner.nextInt();
                System.out.print("Estado Civil (1: Soltero, 2: Casado, 3: Divorciado, 4: Viudo): ");
                int estadoCivilPersonal = scanner.nextInt();
                System.out.print("Año de Incorporacion: ");
                int anioIncorporacionPersonal = scanner.nextInt();
                System.out.print("Numero de Oficina: ");
                int numeroOficinaPersonal = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Seccion: ");
                String seccionPersonal = scanner.nextLine();

                Personal personal = new Personal(nombrePersonal, apellidoPersonal, cedulaPersonal, estadoCivilPersonal, anioIncorporacionPersonal, numeroOficinaPersonal, seccionPersonal);
                personal.mostrar();
                System.out.println("\nIngrese los datos del Estudiante:");
                System.out.print("Nombre: ");
                String nombreEstudiante = scanner.nextLine();
                System.out.print("Apellido: ");
                String apellidoEstudiante = scanner.nextLine();
                System.out.print("Cedula: ");
                int cedulaEstudiante = scanner.nextInt();
                System.out.print("Estado Civil (1: Soltero, 2: Casado, 3: Divorciado, 4: Viudo): ");
                int estadoCivilEstudiante = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Curso: ");
                String cursoEstudiante = scanner.nextLine();

                Estudiante estudiante = new Estudiante(nombreEstudiante, apellidoEstudiante, cedulaEstudiante, estadoCivilEstudiante, cursoEstudiante);
                estudiante.mostrar();

                scanner.close();
        }
}