package Montagut.Albert;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main
{
    // Subaru Impressionat 1984 8594 SPT 16 25
    public static void main(String[] args)
    {
        /*int any = Integer.parseInt(args[2]);
        int num_matr = Integer.parseInt(args[3]);
        float consum = Float.parseFloat(args[5]);
        float litrosRestantes = Float.parseFloat(args[6]);
        Vehicle2 vehicle = new Vehicle2(args[0], args[1], any, num_matr, args[4], consum);
        System.out.println(vehicle.calcAutonomia(litrosRestantes));*/

        List<Vehicle2> vehicles = new ArrayList<>();
        Vehicle2 vehicle = new Vehicle2("Subaru", "Impressionat", 1944, 8564, "FTR", 14.5f);
        Vehicle2 vehicle2 = new Vehicle2("Mitsubishi", "Evolution", 1544, 8443, "KEK", 10.6f);
        Cotxe cotxe1 = new Cotxe("Pestil", "Javivi", 1232, 5454, "JOA", 14.3f, 5, "Ventilador collonut, Equipazo de musica del copon, Neon fino, Subwoofer impressionat, Rayo lila calca, Todo bueno, COmpraPlixx");
        vehicles = Arrays.asList(vehicle, vehicle2, cotxe1);

        vehicles.forEach(System.out::println);

        /*for(Vehicle2 v : vehicles) {
            System.out.println(v);
            System.out.println("\n");
        }*/
    }
}
