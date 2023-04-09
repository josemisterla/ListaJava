/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Digite seu nome: ");
    String nome = sc.nextLine();
    System.out.print("Digite seu sobrenome: ");
    String sobrenome = sc.nextLine();
    
    if (sobrenome.equalsIgnoreCase("wayne")) {
     System.out.println("Acesso liberado, Sr. Wayne");
  } else if (sobrenome.equalsIgnoreCase("kent")) {
     System.out.println("Saí daí, mané!");
  } else if (nome.equalsIgnoreCase("diana")) {
     System.out.println("Bem-vinda, Princesa de Themyscara");
  } else {
     System.out.println("Cai fora!");
  }

  sc.close();
}
}