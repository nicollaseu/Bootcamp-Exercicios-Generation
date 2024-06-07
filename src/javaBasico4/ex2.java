package javaBasico4;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int soma = 0, vetorInteiro[] = new int[10];
        float media;

        for (int i = 0; i < 10; i++) {
            System.out.println("\nEntre com o " + (i + 1) + " valor do vetor: ");
            vetorInteiro[i] = sc.nextInt();
            soma += vetorInteiro[i];

        }

        for (int i = 0; i < vetorInteiro.length; i++) {
            if (vetorInteiro[i] % 2 == 0) {
                System.out.println("\nO elemento " + vetorInteiro[i] + " na posição " + i + " é par ");
            } else {
                System.out.println("\nO elemento " + vetorInteiro[i] + " na posição " + i + " é impar ");
            }
        }
        //Números de Vetores para o Usuário colocar no Terminal: 2, 5, 1, 3, 4, 9, 7, 8, 10, 6
        System.out.println("\nA soma de todos os elementos é: " + soma);

        media = (float) soma / vetorInteiro.length;
        System.out.printf("\nA média dos elementos é: %.2f", media);
    }
}
