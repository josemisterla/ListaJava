/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
    Scanner entrada = new Scanner(System.in);
    int numero;
    
    System.out.print("Digite um número inteiro: ");
    numero = entrada.nextInt();
    
    if(numero % 2 == 0) {
        double raizCubica = Math.cbrt(numero);
        System.out.printf("A raiz cúbica de %d é %.2f", numero, raizCubica);
    } else {
        double raizQuadrada = Math.sqrt(numero);
        System.out.printf("A raiz quadrada de %d é %.2f", numero, raizQuadrada);
    }
    
    entrada.close();
}
}