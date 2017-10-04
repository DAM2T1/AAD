package Montagut.Albert;

import java.util.Arrays;

/**
 * Created by Raikish on 04/10/2017.
 * GitHub --> https://github.com/amcgamer/
 */
public class Empresa {

    private String nombre;
    private int capacidad;
    private Empleado[] empleados;
    private int contEmpleado;

    public Empresa(String nombre, int capacidad) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.empleados = new Empleado[capacidad];
    }

    public void addEmpleado(String nomEmp, double sueldo){
        if(contEmpleado > empleados.length){
            empleados[contEmpleado++] = new Empleado(nomEmp, sueldo);
        }
    }

    @Override
    public String toString() {
        return this.nombre + " - " + this.capacidad + "\n" +
                Arrays.toString(empleados);
    }
}
