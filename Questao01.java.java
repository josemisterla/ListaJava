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

        System.out.print("Digite o número: ");
        double num = input.nextDouble();

        System.out.print("Digite a operação (+, -, *, /, ^, r, c): ");
        char operacao = input.next().charAt(0);

        switch (operacao) {
            case '+':
                System.out.print("Digite o segundo número: ");
                double num2 = input.nextDouble();

                System.out.printf("Resultado: %.2f\n", num + num2);
                break;

            case '-':
                System.out.print("Digite o segundo número: ");
                num2 = input.nextDouble();

                System.out.printf("Resultado: %.2f\n", num - num2);
                break;

            case '*':
                System.out.print("Digite o segundo número: ");
                num2 = input.nextDouble();

                System.out.printf("Resultado: %.2f\n", num * num2);
                break;

            case '/':
                System.out.print("Digite o segundo número: ");
                num2 = input.nextDouble();

                if (num2 ==0){
                    System.out.println("Erro! Divisão por zero.");
                }else{
                    System.out.printf("Resultado: %.2f\n", num / num2);
                }
                break;

            case '^':
                System.out.print("Digite a potência: ");
                double potencia = input.nextDouble();

                System.out.printf("Resultado: %.2f\n", Math.pow(num, potencia));
                break;

            case 'r':
                System.out.printf("Resultado: %.2f\n", Math.sqrt(num));
                break;

            case 'c':
                System.out.printf("Resultado: %.2f\n", Math.cbrt(num));
                break;

            default:
                System.out.println("Operação inválida!");
                break;
        }

        input.close();
    }
}

