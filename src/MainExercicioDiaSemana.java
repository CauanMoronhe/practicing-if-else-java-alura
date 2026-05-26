import java.util.Scanner;

public class MainExercicioDiaSemana {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite algum dia da semana (em letras minúsculas): ");
        String diaDigitado = input.nextLine();

        if (diaDigitado.equals("segunda") || diaDigitado.equals("terça") ||
            diaDigitado.equals("quarta") || diaDigitado.equals("quinta") ||
            diaDigitado.equals("sexta")) {

            System.out.println(diaDigitado + " é um dia útil");
        } else if (diaDigitado.equals("sábado") || diaDigitado.equals("domingo")) {
            System.out.println(diaDigitado + " não é um dia útil");
        } else {
            System.out.println("Dia inválido!");
        }

        input.close();
    }
}
