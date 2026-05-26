public class MainExercicioMedia {
    public static void main(String[] args) {
        double nota1 = -5.3;
        double nota2 = -3.3;
        double nota3 = -4.5;

        double media = (nota1 + nota2 + nota3) / 3;

        if (media >= 7.0) {
            System.out.printf("A média do aluno foi: %.1f\n", media);
            System.out.printf("O aluno foi aprovado!\n");
        } else if (media >= 5.0 && media < 7) {
            System.out.printf("A média do aluno foi: %.1f\n", media);
            System.out.println("O aluno está de recuperação!");
        } else if (media > 0 && media < 5.0) {
            System.out.printf("A média do aluno foi: %.1f\n", media);
            System.out.println("Aluno reprovado!");
        } else {
            System.out.println("Notas inválidas");
        }
    }
}
