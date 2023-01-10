package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        /*
        ==========================================================================================
                                                Atividade 01
        ==========================================================================================
        */

        /*


        int salario = 0;
        int abono = 0;

        Scanner ler = new Scanner(System.in);

        System.out.println("Olá seja bem-vindo!");

        System.out.println("\nDigite seu salário: ");
        salario = ler.nextInt();
        System.out.println("Digite o abono: ");
        abono = ler.nextInt();

        System.out.println("O novo salário é: "+ (salario + abono));


         */





        /*
        ==========================================================================================
                                        Atividade 02

                        Elabore um algoritmo que leia 4 notas de um participante,
                        em variáveis do tipo float e exiba na tela a média final
                        do participante. Veja o exemplo abaixo:
        ==========================================================================================
        */


        /*
        float nota1,nota2,nota3,nota4;
        float mediaFinal;

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


         */





        /*
        ==========================================================================================
                                        Atividade 03

                        Elabore um algoritmo que leia o Salário Bruto,
                        o Adicional Noturno, as Horas Extras e os Descontos
                        de um Colaborador, em variáveis do tipo float e exiba
                        na tela o Salário Líquido. Veja o exemplo abaixo:
        ==========================================================================================

        */


        /*
        float SalarioBruto, AdicionalNoturno, HorasExtras, Descontos, SalarioLiquido;

        Scanner ler = new Scanner(System.in);

        System.out.println("Olá seja bem-vindo\n");

        System.out.println("Salário bruto: ");
        SalarioBruto = ler.nextInt();

        System.out.println("Adicional noturno: ");
        AdicionalNoturno = ler.nextInt();

        System.out.println("Horas extras: ");
        HorasExtras = ler.nextInt();

        System.out.println("Descontos: ");
        Descontos = ler.nextInt();

        SalarioLiquido = SalarioBruto + AdicionalNoturno + (HorasExtras * 5) - Descontos;

        System.out.println("Salário líquido: " + SalarioLiquido);

         */





        /*
            ==========================================================================================
                                            Atividade 04

                        Leia quatro valores float (numero1, numero2, numero3 e numero4).
                        A seguir, calcule e mostre a diferença do produto entre o numero1
                        e o numero2 pelo produto entre o numero3 e o numero4. Veja os
                        exemplos abaixo:
            ==========================================================================================

         */


        
        float n1, n2, n3, n4, Diferenca;

        Scanner ler = new Scanner(System.in);

        System.out.println("olá Seja bem-vindo!");

        System.out.println("Numero 1: ");
        n1 = ler.nextInt();

        System.out.println("Numero 2: ");
        n2 = ler.nextInt();

        System.out.println("Numero 3: ");
        n3 = ler.nextInt();

        System.out.println("Numero 4: ");
        n4 = ler.nextInt();

        Diferenca = (n1 * n2) - (n3 * n4);

        System.out.println("Diferença: " + Diferenca);






    }
}
