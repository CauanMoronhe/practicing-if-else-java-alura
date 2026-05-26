import java.util.Scanner;

public class MainExercicioSeguranca {
    public static void main(String[] args) {
        String senha = "123456";
        Scanner resposta = new Scanner(System.in);

        System.out.print("Digite uma senha: ");
        String senhaDigitada = resposta.nextLine();
        
        resposta.close();

        if (senhaDigitada.equals(senha)) {
            System.out.println("Acesso autorizado!");
        } else {
            System.out.println("Acesso negado!");
        }
    }
}
