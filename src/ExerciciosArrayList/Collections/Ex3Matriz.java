package ExerciciosArrayList.Collections;
import java.util.Scanner;

public class Ex3Matriz {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int [][] matriz = new int[3][3];
        int somaP = 0, somaS = 0;

        System.out.println("Digite os elementos da matriz: ");
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                System.out.println("[Linha " + linha + "] [Coluna " + coluna + "]:");
                matriz[linha][coluna] = scanner.nextInt();
            }
        }
        System.out.println("Elementos da Diagonal Principal: ");
        for (int linha = 0; linha < 3; linha++) {
            System.out.println(matriz[linha][linha]);
        }

        System.out.println("Elementos da Diagonal Secundária: ");
        for (int linha = 0; linha < 3; linha++) {
            System.out.println(linha + (2 - linha) + matriz[linha][2 - linha]);
        }
        for (int linha = 0; linha < 3; linha++) {
            somaP += matriz[linha][linha];
        }
        System.out.println("Soma dos Elementos da Diagonal Principal: " + somaP);

        for (int linha = 0; linha < 3; linha++) {
            somaS += matriz[linha][2 - linha];
        }
        System.out.println("Soma dos Elementos da Diagonal Secundária: " + somaS);
    }
    }
