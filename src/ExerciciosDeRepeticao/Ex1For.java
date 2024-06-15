package ExerciciosDeRepeticao;
import java.util.Scanner;

public class Ex1For {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int intervalo1, intervalo2;

        System.out.println("Digite o primeiro número do intervalo: ");
        intervalo1 = leia.nextInt();
        System.out.println("\nDigite o segundo número do intervalo: ");
        intervalo2 = leia.nextInt();

        if (intervalo1 < intervalo2) {
            System.out.println("\nO intervalo começa em " + intervalo1 + " e termina em " + intervalo2 + "\n");
            for (int i = intervalo1; i < intervalo2; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println(i + " é múltiplo de 3 e 5.");
                }
            }
        } else {
            System.out.println("\nIntervalo inválido!");
        }
    }
}
