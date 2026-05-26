import java.util.Scanner;

public class MainExercicioParImpar {
    public static void main(String[] args) {
        Scanner resposta = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = resposta.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O número é par");
        } else {
            System.out.println("O número é impar");
        }
    }
}
