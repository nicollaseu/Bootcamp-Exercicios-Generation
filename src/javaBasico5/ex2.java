package javaBasico5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;



public class ex2 {
    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);

        numeros.add(2);
        numeros.add(5);
        numeros.add(1);
        numeros.add(3);
        numeros.add(4);
        numeros.add(9);
        numeros.add(7);
        numeros.add(8);
        numeros.add(10);
        numeros.add(6);

        int numero;

        System.out.println("\nDigite o número que você deseja encontrar: ");
        numero = sc.nextInt();

        int posicao = numeros.indexOf(numero);

        System.out.println("\nMétodo 1- Usando IndexOf");
        if (posicao != -1) {
            System.out.println("\nO número " + numero + " está na posição " + posicao );
        } else {
            System.out.println("\nO número " + numero + " não foi encontrado na lista.");
        }

        System.out.println("\nMétodo 2- Usando Contain");
        if (numeros.contains(numero)) {
            System.out.println("\nO número " + numero + " está na posição " + posicao);
        } else {
            System.out.println("\nO número " + numero + " não foi encontrado na lista.");
        }

        System.out.println("\nMétodo 3- Usando Laço de repetição");
        for (int i = 0; i < numeros.size(); i++) {
                if (numeros.get(i) == numero) {
                    posicao = i;
                    break;
                }
        }

        if (posicao != -1) {
            System.out.println("\nO número " + numero + " está na posição " + posicao);
        } else {
            System.out.println("\nO número " + numero + " não foi encontrado na lista.");
        }

    }
}
