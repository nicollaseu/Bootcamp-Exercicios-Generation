package ExerciciosArrayList.EstruturaDeDados;
import java.util.Scanner;
import java.util.Stack;

public class Ex2Pilha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<String> pilha = new Stack<String>();
        int op;


        do {
            System.out.println("""
                    \n1 - Adicionar livro a pilha
                    2 - Listar todos os livros
                    3 - Retirar livro da pilha
                    0 - Sair

                    Escolha a opção desejada:
                    """);
            op = scanner.nextInt();
            String nomeLivro;

            switch (op) {
                case 1:
                    scanner.nextLine();
                    System.out.println("\nAdicione um livro na plha: ");
                    nomeLivro = scanner.nextLine();
                    pilha.push(nomeLivro);
                    System.out.println("\nLivro" + nomeLivro + "adicionado a fila!");
                    break;
                case 2:
                    if (pilha.isEmpty()) {
                        System.out.println("Nenhum livro na pilha");
                    } else {
                        System.out.println("Pilha de livros: ");
                        for (String livro : pilha) {
                            System.out.println(livro);
                        }
                    }
                    break;
                case 3:
                    if (pilha.isEmpty()) {
                        System.out.println("A pilha de livros está vazia!");
                    } else {
                        String retiraLivro = pilha.pop();
                        System.out.println("\nO livro " + retiraLivro + " foi retirado!");
                    }
                    break;
                case 0:
                    System.out.println("Programa Finalizado!");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (op != 0);
    }
}
