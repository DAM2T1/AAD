package Montagut.Albert;

/**
 * Created by Raikish on 29/09/2017.
 * GitHub --> https://github.com/amcgamer/
 */
public class Matricula {

    private int num;
    private String let;

    Matricula(int num, String let)
    {
        this.num = num;
        this.let = let;
    }

    int getNum() {
        return num;
    }

    void setNum(int num) {
        this.num = num;
    }

    String getLet() {
        return let;
    }

    void setLet(String let) {
        this.let = let;
    }

    @Override
    public String toString() {
        return this.num + "-" + this.let;
    }
}
