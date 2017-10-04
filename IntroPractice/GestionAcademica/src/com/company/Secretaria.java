package com.company;

import java.util.Scanner;

/**
 * Created by Raikish on 22/09/2017.
 * GitHub --> https://github.com/amcgamer/
 */
public class Secretaria {

    public static int mostrarMenu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Selecciona una opción");
        System.out.println("1. Registrar Alumno ");
        System.out.println("2. Registrar Asignatura");
        System.out.println("3. Ver lista de asignaturas");
        System.out.println("4. Ver lista de alumnos");
        System.out.println("5. ver alumnos asignados a una asignatura");
        System.out.println("6. ver numero de assignaturas");
        System.out.println("7. Assignar un alumno a una assignatura");
        System.out.println("8. Salir");
        System.out.println();
        return selectOption(sc.nextInt());
    }

    private static int  selectOption(int option){
        switch (option){
            case 1: registrarAlumno(); break;
            case 2: registrarAssign(); break;
            case 3: verListaAssign(); break;
            case 4: verListaAlumn(); break;
            case 5: verAlumnosAssignPorAssign(); break;
            case 6: verNumeroTotalAssign(); break;
            case 7: assignarAlumnAssign();break;
            case 8: option = 0; break;
        }
        return option;
    }

    private static void registrarAlumno(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nombre del alumno");
        String nameAlumn = sc.nextLine();
        System.out.println("Introduce el DNI");
        String dniAlumn = sc.nextLine();
        Departamento.alumnos.add(new Alumno(nameAlumn, dniAlumn));
        // auto pregunta, como editare esto, deberia guardarlo en el array de departamento?
    }

    private static void registrarAssign(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nombre de la assignatura");
        String nameAssign = sc.nextLine();
        System.out.println("Introduce el codigo de la asignatura");
        String codeAssign = sc.nextLine();
        Departamento.assignaturas.add(new Assignatura(nameAssign, codeAssign));
    }

    private static void verListaAlumn(){
        Departamento.mostrarListaAlumn();
    }   //Esto es bastante inutil porque es un metodo que llama a otro

    private static void verListaAssign(){
        Departamento.mostrarListaAssign();
    } //Esto es bastante inutil porque es un metodo que llama a otro

    private static void verAlumnosAssignPorAssign(){
        System.out.println("Selecciona la assignatura de la cual quieres ver los alumnos");
        Scanner sc = new Scanner(System.in);
        verListaAssign();
        Departamento.assignaturas.get(sc.nextInt()).mostrarListaAlumnosPorAsign();
    }

    private static void verNumeroTotalAssign(){
        System.out.println(Departamento.assignaturas.size());
    }

    private static void assignarAlumnAssign(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Selecciona el alumno");
        verListaAlumn();
        int alumn =  sc.nextInt();
        System.out.println("Selecciona la assignatura");
        verListaAssign();
        Departamento.assignaturas.get(sc.nextInt()).añadirAlumno(Departamento.alumnos.get(alumn));
    }

}
