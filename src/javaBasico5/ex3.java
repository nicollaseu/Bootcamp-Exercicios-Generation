package javaBasico5;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class ex3 {
    public static void main(String[] args) {

        Set<Integer> numeros = new HashSet<Integer>();
        Scanner sc = new Scanner(System.in);

        int numero;

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um número inteiro: ");
            numero = sc.nextInt();
            numeros.add(numero);
        }

        System.out.println("\nMétodo 1- Listar dados do set: " + numeros);

        System.out.println("\nMétodo 2- Listar dados do set com Iterator");

        Iterator<Integer> inumeros = numeros.iterator();

        while (inumeros.hasNext() ) {
            System.out.println(inumeros.next());
        }
    }
}
