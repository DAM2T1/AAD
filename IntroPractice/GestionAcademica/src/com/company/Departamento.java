package com.company;

import java.util.ArrayList;

/**
 * Created by Raikish on 22/09/2017.
 * GitHub --> https://github.com/amcgamer/
 */


//methodos static o public?
public class Departamento {

    public static ArrayList<Alumno> alumnos = new ArrayList<>();
    public static ArrayList<Assignatura> assignaturas = new ArrayList<>();

    public static void mostrarListaAlumn(){
        for (Alumno alumnActual : alumnos) {
            System.out.println(alumnos.indexOf(alumnActual) + ". " + alumnActual.getName());
        }
    }
    public static void mostrarListaAssign(){
        for (Assignatura assignActual : assignaturas) {
            System.out.println(assignaturas.indexOf(assignActual)+ ". " + assignActual.getNombre());

        }
    }
}

//TODO Arreglar esto que esta bastante podriiiido, y hacerlo bien