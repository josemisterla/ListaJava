/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite a temperatura: ");
        double temperatura = input.nextDouble();
        
        System.out.print("Digite a escala de temperatura (Celsius/C/Fahrenheit/F/Kelvin/K): ");
        String escalaEntrada = input.next();
        
        double celsius;
        if (escalaEntrada.equalsIgnoreCase("Celsius") || escalaEntrada.equalsIgnoreCase("C")) {
            celsius = temperatura;
        } else if (escalaEntrada.equalsIgnoreCase("Fahrenheit") || escalaEntrada.equalsIgnoreCase("F")) {
            celsius = (temperatura - 32) / 1.8;
        } else if (escalaEntrada.equalsIgnoreCase("Kelvin") || escalaEntrada.equalsIgnoreCase("K")) {
            celsius = temperatura - 273.15;
        } else {
            System.out.println("Escala de temperatura de entrada inválida.");
            return;
        }
        
        System.out.print("Digite a escala de temperatura de saída (Celsius/C/Fahrenheit/F/Kelvin/K): ");
        String escalaSaida = input.next();
        
        double temperaturaSaida;
        if (escalaSaida.equalsIgnoreCase("Celsius") || escalaSaida.equalsIgnoreCase("C")) {
            temperaturaSaida = celsius;
        } else if (escalaSaida.equalsIgnoreCase("Fahrenheit") || escalaSaida.equalsIgnoreCase("F")) {
            temperaturaSaida = (celsius * 1.8) + 32;
        } else if (escalaSaida.equalsIgnoreCase("Kelvin") || escalaSaida.equalsIgnoreCase("K")) {
            temperaturaSaida = celsius + 273.15;
        } else {
            System.out.println("Escala de temperatura de saída inválida.");
            return;
        }
        
        System.out.println("Temperatura em " + escalaSaida + ": " + temperaturaSaida);
        
    }
    
}
