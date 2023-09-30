import java.io.PrintStream;
import java.util.Scanner;

public class Ejer09 {
    public static PrintStream screen = System.out;
    public static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {

        long time = 0;
        long distance = 0;
        long speed = 0;
        screen.println(" vamos a calcular cuanta velocidad se requiere para recorrer x distancia en x tiempo, digite el tiempo en horas: ");
        time = keyboard.nextLong();
        screen.println("digite la distancia en kilometros: ");
        distance = keyboard.nextLong();
        speed = distance/time;
        screen.println(" la velocidad requerida para recorrer la distancia en ese tiempo es de " + speed +" km/h");






    }
}
