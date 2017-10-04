package Montagut.Albert;

/**
 * Created by Raikish on 29/09/2017.
 * GitHub --> https://github.com/amcgamer/
 */
public class Cotxe extends Vehicle2{
    private int places;
    private String extres;

    public Cotxe(String marca, String model, int any, int num_matr, String let_matr, float consum, int places, String extres)
    {
        super(marca, model, any, num_matr, let_matr, consum);
        this.places = places;
        this.extres = extres;
    }

    public int getPlaces() {
        return places;
    }

    public void setPlaces(int places) {
        this.places = places;
    }

    public String getExtres() {
        return extres;
    }

    public void setExtres(String extres) {
        this.extres = extres;
    }

    public void addExtra(String extra) {
        this.extres += (", " + extra);
    }

    @Override
    public String toString() {
        return super.toString() + "\nPlaces: " + this.places + "\nExtres: " + this.extres;
    }
}
