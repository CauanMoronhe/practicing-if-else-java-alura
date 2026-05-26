import java.util.Scanner;

public class MainExercicioTriangulo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o tamanho do primeiro lado do triângulo: ");
        int lado1 = input.nextInt();
        System.out.print("Digite o tamanho do segundo lado do triângulo: ");
        int lado2 = input.nextInt();
        System.out.print("Digite o tamanho do terceiro lado do triângulo: ");
        int lado3 = input.nextInt();

        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
            System.out.println("Os lados podem formar um triângulo");
        } else {
            System.out.println("Não é possível formar um triângulo");
        }

        input.close();
    }
}
