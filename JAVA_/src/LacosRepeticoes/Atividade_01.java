package LacosRepeticoes;

import java.util.Scanner;

public class Atividade_01 {

    public static void main(String[] args){
        /*
                                Atividade 01

        Escreva um algoritmo em Java, que leia 2 números inteiros via teclado,
        onde o primeiro número deve ser menor que o segundo número. Caso contrário,
        deve ser exibida uma mensagem na tela informando que o intervalo é inválido
        e sair do programa. Dentro do intervalo informado, mostre na tela todes os
        números que são múltiplos de 3 e 5. Veja os exemplos abaixo:


        */



        int n1,n2;

        Scanner ler = new Scanner(System.in);

        System.out.println("Olá seja bem-vindo!");

        System.out.println("Digite o primeiro número: ");
        n1 = ler.nextInt();

        System.out.println("Digite o segundo numero: ");
        n2 = ler.nextInt();

        if (n1 < n2){
            for (int c = n1; c <= n2; c++ ){
                if (n1 % 3 == 0 && n1 % 5 == 0){
                    System.out.println(n1 + " é multiplo de 3 e 5\n");
                }
                n1++;
            }

            }else{
            System.out.println("Intervalo inválido!");

        }



        }
    }

