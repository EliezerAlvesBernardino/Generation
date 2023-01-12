package LacosRepeticoes;

import java.util.Scanner;

public class Atividade_06 {

    public static void main(String[] args){

        /*
                                    Atividade 06

        Escreva um algoritmo em Java, que leia números inteiros via teclado,
        até que o número zero seja digitado. Ao final, mostre na tela a média
        de todos os números digitados, que sejam múltiplos de 3. Veja o exemplo abaixo:

         */
        int num  = 0;
        int soma = 0;
        int cont = 0;
        float media = 0;

        Scanner ler = new Scanner(System.in);

        do {
            System.out.println("Digite um número: ");
            num = ler.nextInt();

            if (num % 3 == 0 && num != 0) {
                soma += num;
                cont += 1;

            }

        }while (num != 0);

        media = soma / cont;

        System.out.println("A soma dos números múltiplos de 3 é :" + soma);
        System.out.println("A média de todos os números múltiplos de 3 é: " + media);
    }
}
