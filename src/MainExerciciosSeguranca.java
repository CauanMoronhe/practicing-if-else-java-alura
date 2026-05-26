import java.util.Scanner;

public class MainExerciciosSeguranca {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int codigoAcesso = 2023;
        int nivelPermissaoMin = 1;
        int nivelPermissaoMax = 3;

        System.out.print("Digite o código de acesso: ");
        int codigoDigitado = input.nextInt();
        System.out.print("Digite o nível de permissão: ");
        int permissaoDigitada = input.nextInt();

        boolean validaCodigo = codigoDigitado == codigoAcesso;
        boolean validaPermissao = permissaoDigitada >= nivelPermissaoMin && permissaoDigitada <= nivelPermissaoMax;

        if (validaCodigo && validaPermissao) {
            System.out.println("Acesso liberado! Bem-vindo ao sistema");
        } else {
            System.out.println("Acesso negado. Motivo: ");
            if (!validaCodigo) {
                System.out.println("Código de acesso incorreto");
            }
            if (!validaPermissao) {
                System.out.println("Nível de permissão inferior ou incorreto");
            }
        }
    }
}
