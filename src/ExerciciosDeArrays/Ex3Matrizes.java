package ExerciciosDeArrays;

import java.util.Scanner;

public class Ex3Matrizes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int somaPrincipal = 0, somaSecundaria = 0, matrizInteiros[][] = new int[3][3];

        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                System.out.println("\nO valor vai ser armazenado na posição [" + linha + "][" + coluna + "] é: "
                                   + matrizInteiros[linha][coluna]);
                matrizInteiros[linha][coluna] = sc.nextInt();
            }
        }

        System.out.println("\n \tElementos da Diagonal Principal");
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                if (linha == coluna) {
                    System.out.println("\nO elemento " + matrizInteiros[linha][coluna] +
                                       " festá na posição " + linha + ", " + coluna);
                    somaPrincipal += matrizInteiros[linha][coluna];
                }
            }
        }

        System.out.println("\n \tElementos da Diagonal Secundária");
        System.out.println("\nO elemento " + matrizInteiros[0][2] + " está na posição [0][2]");
        System.out.println("\nO elemento " + matrizInteiros[1][1] + " está na posição [1][1]");
        System.out.println("\nO elemento " + matrizInteiros[2][0] + " está na posição [2][0]");

        System.out.println("\nA soma dos elementos na digonal principal é: " + somaPrincipal);

        //Cálculo da soma da Diagonal Secundária.
        somaSecundaria = matrizInteiros[0][2] + matrizInteiros[1][1] + matrizInteiros[2][0];
        System.out.println("\nA soma dos elementos na digonal secundária é: " + somaSecundaria);

    }
}
