import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;

public class Ejer02 {
    // Esta instruccion perimite imprimir por pantalla
    public static PrintStream screen = System.out;
    //Esta instruccion permite capturar entrada por le teclado//
    public static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        long celular;
        int indicador;
        long temporal;

        screen.println("Ingrese un numero de celular)");
        celular=keyboard.nextLong();
        temporal = (celular)/10000000;
        indicador = Math.toIntExact(temporal);
        screen.println("El indicativo es: "+indicador);
    }
}