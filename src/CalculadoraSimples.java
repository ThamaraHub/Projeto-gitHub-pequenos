import java.util.Scanner;

/**
 * @ Autora Thamara
 */
public class CalculadoraSimples
{
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;
        int soma = 0;

        System.out.print("Digite o primeiro número: ");
        num1 = entrada.nextInt();
        System.out.println("Digite o segundo número: ");
        num2 = entrada.nextInt();

        soma = num1 + num2;

        System.out.printf("A soma é %d\n", soma);
    }
}
