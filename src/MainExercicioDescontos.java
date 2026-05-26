import java.util.Scanner;

public class MainExercicioDescontos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor da compra: R$");
        double valor = input.nextDouble();

        if (valor >= 100) {
            double valorComDesconto = valor - (valor * 0.1);
            System.out.println("Desconto de 10% aplicado!");
            System.out.println("Valor atualizado: R$" + valorComDesconto);
        } else if (valor < 100 && valor > 0){
            System.out.println("Desconto não aplicado!");
            System.out.println("Valor da compra: R$" + valor);
        } else {
            System.out.println("Valor de compra inválido!");
        }

        input.close();
    }
}
