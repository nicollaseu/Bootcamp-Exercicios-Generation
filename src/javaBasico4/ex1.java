package javaBasico4;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] vetor = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };
        int localizar;
        boolean encontrado = false;

        System.out.printf("Digite o número que você deseja encotrar: ");
        localizar = sc.nextInt();

        for (int x = 0; x < vetor.length; x++) {
         if (vetor[x] == localizar) {
             encontrado = true;
             System.out.println("O número " + "Está na posição: " + x);
             break;
         }
        }
        if (!encontrado) {
            System.out.println("O número " + localizar + " não foi encontrado ");
        }
    }
}
