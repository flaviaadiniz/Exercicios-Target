/*
Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores
anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar
onde, informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o
número informado pertence ou não a sequência.
 */

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        int n1 = 0;
        int n2 = 1;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para descobrir se ele pertence à sequência Fibonacci: ");
        int num = scanner.nextInt();

        int[] fibonacci = new int[num+3];

        fibonacci[0] = 0;
        fibonacci[1] = 1;

        for (int i = 2; i <= fibonacci.length - 1; i++) {
            fibonacci[i] = n1 + n2;
            n1 = n2;
            n2 = fibonacci[i];
        }

        boolean resposta = false;
        for (int i : fibonacci) {
            if (i == num) {
                resposta = true;
            }
        }

        if (resposta) {
            System.out.println("O número " + num + " pertence à sequência Fibonacci.");
        } else {
            System.out.println("O número " + num + " NÃO pertence à sequência Fibonacci.");
        }

        scanner.close();

    }


}
