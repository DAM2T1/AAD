package Montagut.Albert;

public class Main {

    public static void main(String[] args) {
        Empresa Zara = new Empresa("Zara S.A." , 2);
        Zara.addEmpleado("Leonardo Smith", 1100.50);
        Zara.addEmpleado("Victoria Fernandez", 1200.70);
        Zara.addEmpleado("Sandra Gutierrez", 900.70);

        System.out.println(Zara);

        System.out.println("Fin del programa");
    }
}
