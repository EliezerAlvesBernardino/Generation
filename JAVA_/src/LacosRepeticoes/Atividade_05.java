package LacosRepeticoes;

import java.util.Scanner;

public class Atividade_05 {

    public static void main(String[] args){

        /*
                                Atividade 05

        Escreva um algoritmo em Java, que leia números inteiros via teclado,
        até que o número zero seja digitado. Ao final, mostre na tela a soma
        de todos os números digitados, que sejam positivos. Veja o exemplo abaixo:
         */

        int cont = 0;
        int soma = 0;
        int positivo  = 0;
        int num  = 0;

        Scanner ler = new Scanner(System.in);

        do{
            System.out.println("Digite um número: ");
            num = ler.nextInt();
            if (num >= 0){
                positivo += 1;
                soma += num;
            }

        }while (num != 0);
        System.out.println("Os números positivos são: " + positivo);
        System.out.println("A soma dos números positivos é : " + soma);
    }
}
