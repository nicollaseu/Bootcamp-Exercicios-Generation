package javaBasico2;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    float[] numeros = new float[3];
    float soma;


    for (int i = 0; i < numeros.length; i++ ) {
        System.out.printf("Digite um numero: ");
        numeros[i] = entrada.nextFloat();
    }

    soma = numeros[0] + numeros[1] ;

    if (soma > numeros[2]) {
        System.out.println("1. A soma de A + B é Maior do que C");
    } else if (soma < numeros[2]){
        System.out.println("2. A soma de A + B é menor do que C");
    } else {
        System.out.println("3. A soma de A + B é Igual a C");
    }

    }
}
