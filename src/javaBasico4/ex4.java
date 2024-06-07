package javaBasico4;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numParticipantes = 10, numBimestres = 4;
        float notas[][] = new float[numParticipantes][numBimestres];

        float medias[] = new float[numParticipantes];

        for (int i = 0; i < numParticipantes; i++) {
            System.out.println("\nDigite a nota dos participantes " + (i + 1) + ":");
            float soma = 0;
            for(int j = 0; j < numBimestres; j++) {
                System.out.println("\nNota do " + (j + 1) + "º bimestre: ");
                notas[i][j] = sc.nextFloat();
                soma += notas[i][j];
            }

            medias[i] = soma / numBimestres;
        }

        System.out.println("\n \tMédia dos participantes: ");
        for (int i = 0; i < numParticipantes; i++) {
            System.out.printf("\nParticipante %d: %.1f", (i + 1), medias[i]);
        }

        System.out.println("\n \nExtra: exibição em formato de vetor, separado por '|' e não por vírgula");
        System.out.printf("\n[%.1f | %.1f | %.1f | %.1f | %.1f | %.1f | %.1f | %.1f | %.1f | %.1f]",
                medias[0], medias[1], medias[2], medias[3], medias[4], medias[5], medias[6], medias[7], medias[8], medias[9]);
    }
}
