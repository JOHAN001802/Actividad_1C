import java.io.PrintStream;
import java.util.Scanner;

public class Ejer07 {
    public static PrintStream screen = System.out;
    public static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        double lon = 0;
        double broad = 0;
        double height = 0;
        double liters = 0;
        screen.println(" vamos a calcular el 90% de capacidad de un acuario en litros, por favor digite el largo: ");
        lon = keyboard.nextDouble();
        screen.println("valor del ancho: ");
        broad = keyboard.nextDouble();
        screen.println("valor de la altura: ");
        height = keyboard.nextDouble();
        liters = ((lon*broad*height)/1000)*0.9;
        screen.println("el acuario requiere llenarlo al 90% por un valor de: " + liters + " litros");




    }
}
