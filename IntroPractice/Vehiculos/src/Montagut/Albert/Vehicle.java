package Montagut.Albert;

/**
 * Created by Raikish on 29/09/2017.
 * GitHub --> https://github.com/amcgamer/
 */
public class Vehicle {
    private String marca;
    private String model;
    private int any;
    private String matricula;
    private float consum;

    public Vehicle(String marca, String model, int any, int num_matr, String let_matr, float consum)
    {
        this.marca = marca;
        this.model = model;
        this.any = any;
        this.matricula = num_matr + let_matr;
        this.consum = consum;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getAny() {
        return any;
    }

    public void setAny(int any) {
        this.any = any;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public float getConsum() {
        return consum;
    }

    public void setConsum(float consum) {
        this.consum = consum;
    }

    public float calcAutonomia(float litrCarburant) {
        return litrCarburant / consum;
    }
}
