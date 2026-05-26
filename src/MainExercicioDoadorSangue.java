import java.sql.SQLOutput;
import java.util.Scanner;

public class MainExercicioDoadorSangue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a idade do doador: ");
        int idade = input.nextInt();
        System.out.print("Digite o peso do doador (em kg): ");
        double peso = input.nextDouble();

        if (idade >= 18 && idade <= 65 && peso > 50) {
            System.out.println("Doador compatível");
            System.out.println();
        } else if (idade > 0 && idade < 18) {
            System.out.println("Doador não é compatível");
            System.out.println("Motivo: O doador deve ter entre 18 e 65 anos");
        } else if (peso > 0 && peso < 50) {
            System.out.println("Doador não é compatível");
            System.out.println("Motivo: O doador deve ter 50 kg ou mais");
        } else {
            System.out.println("Dados incompatíveis");
        }
    }
}
