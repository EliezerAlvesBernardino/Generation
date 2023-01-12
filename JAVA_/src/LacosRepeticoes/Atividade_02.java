package LacosRepeticoes;

import java.util.Scanner;

public class Atividade_02 {

    public static void main(String[] args){

        /*
                                Atividade 02

            Escreva um algoritmo em Java, que leia 10 números inteiros
            via teclado e mostre na tela quantos números são pares e
            quantos número são ímpares. Veja o exemplo abaixo
         */

        int num = 0;
        int contPar = 0,conImpar = 0;
        int somaPar = 0, somaImpar = 0;

        System.out.println("Olá seja bem-vindo!");

        Scanner ler = new Scanner(System.in);

        for (int c = num; c <= 10; c++){
            System.out.println("Digite o " + c + " número: ");
            num = ler.nextInt();

            if (num % 2 == 0){
                System.out.println("Este número é o Par. ");
                contPar ++;
                somaPar += num;
            }else {
                System.out.println("Este é o número ímpar. ");
                conImpar ++;
                somaImpar += num;
            }
            num++;
        }
        System.out.println("\n\n\nTotal de números pares:   " + contPar);
        System.out.println("Total de números ímpares  " + conImpar);
        System.out.println("\n A soma dos números pares: " + somaPar);
        System.out.println("\n A soma dos números ímpares: " + somaImpar);
    }
}
