package com.facultades;

public class Estudiante extends Persona {
    private String curso;

    public Estudiante(String nombre, String apellido, int cedula, int eleccion, String curso) {
        super(nombre, apellido, cedula, eleccion);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "curso='" + curso + '\'' +
                '}';
    }

    public void newCurso(String curso){
        this.curso = curso;
    }

    @Override
    public void mostrar(){
        System.out.println("Nombre: " + getNombre());
        System.out.println("Apellido: " + getApellido());
        System.out.println("Cedula: " + getCedula());
        System.out.println("Estado Civil: " + getEstadoCivil());
        System.out.println("Curso: " + curso);
    }
}
