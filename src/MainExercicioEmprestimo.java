import java.util.Scanner;

public class MainExercicioEmprestimo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor do empréstimo necessário: R$");
        double valorEmprestimo = input.nextDouble();

        if (valorEmprestimo >= 1000 && valorEmprestimo <= 5000) {
            System.out.println("O valor de R$" + valorEmprestimo + " está dentro do intervalo permitido para empréstimo");
        } else if (valorEmprestimo > 5000) {
            System.out.println("Valor acima do intervalo permitido para empréstimo");
        } else {
            System.out.println("O valor de R$" + valorEmprestimo + " não está dentro do intervalo permitido para empréstimo");
        }

        input.close();
    }
}
