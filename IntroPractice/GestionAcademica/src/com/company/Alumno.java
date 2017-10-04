package com.company;

/**
 * Created by Raikish on 22/09/2017.
 * GitHub --> https://github.com/amcgamer/
 */
public class Alumno {
    private String name;
    private String dni;

    public Alumno(String name, String dni) {
        this.name = name;
        this.dni = dni;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    public String getName() {
        return name;
    }
    public String getDni() {
        return dni;
    }
}
