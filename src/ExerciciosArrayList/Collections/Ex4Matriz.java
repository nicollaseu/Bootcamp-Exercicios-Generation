package ExerciciosArrayList.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ex4Matriz {
    public static void main(String[] args) {

        Set<Integer> numeros = new HashSet<Integer>();
        int numero;

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

        System.out.println("\nDigite o numero que você quer buscar: ");
        numero = sc.nextInt();

        System.out.println("\nMétod 1- Laço Condicional e Contains");
        if (numeros.contains(numero)) {
            System.out.println("\nO número " + numero + " foi encontrado!");
        } else {
            System.out.println("\nO número " +  numero + " não foi encontrado!");
        }

        System.out.println("\nMétodo 2- Usando Laço de Repetição e For Each");
        boolean encontrado = false;

        for (Integer num : numeros) {
            if (num == numero) {
                encontrado = true;
                    break;
            }
        }

        if (encontrado) {
            System.out.println("\nO número " + numero + " foi encontrado!");
        } else {
            System.out.println("\nO número " + numero + " não foi encotrado!");
        }
    }
}
