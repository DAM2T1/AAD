package Montagut.Albert;

/**
 * Created by Raikish on 04/10/2017.
 * GitHub --> https://github.com/amcgamer/
 */
public class Empleado {

    private String nomEmpleado;
    private double sueldo;

    public Empleado(String nomEmpleado, double sueldo) {
        this.nomEmpleado = nomEmpleado;
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return this.nomEmpleado + " - " + this.sueldo;
    }
}
