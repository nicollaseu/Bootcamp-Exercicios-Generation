package ExerciciosArrayList.Collections;
import java.util.*;

public class Ex1Vetor {
    public static void main(String[] args) {

        ArrayList<String> cores = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);

        String cor;

        for (int i = 0; i < 5; i++) {
            System.out.println("\nDigite a " + ( i + 1 ) + "º cor: " );
            cor = sc.nextLine();
            cores.add(cor);
        }

        System.out.println("\nCores cadastradas: " + cores);

        Collections.sort(cores);
        System.out.println("\nCores em ordem crescente: " + cores);

        cores.sort(Comparator.reverseOrder());
        System.out.println("\nCores em ordem decrescente: " + cores);
    }
}
