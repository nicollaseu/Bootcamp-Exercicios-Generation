package ExerciciosArrayList.EstruturaDeDados;
import java.util.Scanner;
import java.util.*;

public class Ex1Fila {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Queue<String> fila = new LinkedList<String>();
        int op;


        do {
            System.out.println("""
                    \n1 - Adicionar Cliente na Fila
                    2 - Listar todos os Clientes
                    3 - Retirar Cliente da Fila
                    0 - Sair

                    Escolha a opção desejada:
                    """);
            op = sc.nextInt();
            String nomeCliente;

            switch (op) {
                case 1:
                    sc.nextLine();
                    System.out.println("\nAdicione um nome na fila: ");
                    nomeCliente = sc.nextLine();
                    fila.add(nomeCliente);
                    System.out.println("\nCliente adicionado a fila!");
                    break;
                case 2:
                    if (fila.isEmpty()) {
                        System.out.println("Nenhum cliente na fila");
                    } else {
                        System.out.println("Fila: ");
                        for (String cliente : fila) {
                            System.out.println(cliente);
                        }
                    }
                    break;
                case 3:
                    if (fila.isEmpty()) {
                        System.out.println("A fila está vazia!");
                    } else {
                        String retiraCliente = fila.poll();
                        System.out.println("Vez do cliente: " + retiraCliente);
                    }
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
            }
        } while (op != 0);
    }
}
