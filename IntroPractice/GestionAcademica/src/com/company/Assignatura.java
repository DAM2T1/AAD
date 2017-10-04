package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Raikish on 22/09/2017.
 * GitHub --> https://github.com/amcgamer/
 */
public class Assignatura {
    private String nombre;
    private String codigo;
    private ArrayList<Alumno> alumnos = new ArrayList();

    public Assignatura(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }
    public String getCodigo() {
        return codigo;
    }
    public List getAlumnos() {
        return alumnos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void añadirAlumno(Alumno nuevoAlumno){
        alumnos.add(nuevoAlumno);
    }
    public void mostrarListaAlumnosPorAsign(){
        for (Alumno alumnosActual :alumnos) {
            System.out.println("Alumno: " + alumnosActual.getName() + " Con DNI: " + alumnosActual.getDni());
        }
    }
}


