package javaBasico3;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int idade, menorQue21 = 0, maiorQue50 = 0;

        System.out.println("Digite uma idade: ");
        idade = scanner.nextInt();

        while (idade > 0) {
            if (idade  < 21 ) {
                menorQue21++;
            } else if (idade > 50) {
                maiorQue50++;
            }
            System.out.println("Digite uma idade");
            idade = scanner.nextInt();
        }
        System.out.println("Total de pessoas menores de 21 anos: " + menorQue21);
        System.out.println("Total de pessoas maiores de 50 anos: " + maiorQue50);
    }
}
