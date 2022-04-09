import java.util.Scanner;

public class CalculadoraSimplesNumerosFlutuantes
{
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double num1 = 0;
        double num2 = 0;
        double multiplicacao = 0;

        System.out.println("Digite o primeiro número: ");
        num1 = in.nextDouble();
        System.out.println("Digite o segundo número: ");
        num2 = in.nextDouble();

       multiplicacao = num1 * num2;

        System.out.printf("O resultado da multiplicação é: %.2f\n", multiplicacao);
    }
}
