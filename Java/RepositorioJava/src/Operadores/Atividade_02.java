package Operadores;

import java.util.*;

public class Atividade_02 {
    public static void main(String[] args){
        /*
        Elabore um algoritmo que leia 4 notas de um participante,
        em variáveis do tipo float e exiba na tela a média final
        do participante. Veja o exemplo abaixo:
        */

        float nota1,nota2,nota3,nota4;
        float mediaFinal = 0;

        Scanner ler = new Scanner(System.in);

        System.out.println("Olá seja bem-vindo!");

        System.out.println("Nota 1: ");
        nota1 = ler.nextInt();

        System.out.println("Nota 2: ");
        nota2 = ler.nextInt();

        System.out.println("Nota 3: ");
        nota3 = ler.nextInt();

        System.out.println("Nota 4: ");
        nota4 = ler.nextInt();

        mediaFinal = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("Media final: " + mediaFinal);
    }
}
