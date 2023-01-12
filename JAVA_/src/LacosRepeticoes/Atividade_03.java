package LacosRepeticoes;

import java.util.Scanner;

public class Atividade_03 {

    public static void main(String[] args){

        /*
                                        Atividade 03

        Escreva um algoritmo em Java, que leia a idade de várias pessoas (números inteiros),
        via teclado e mostre na tela o total de pessoas cuja idade seja menor que 21 anos e o
        total de pessoas cuja idade seja maior que 50 anos. A leitura dos dados deve ser finalizada
        ao digitar uma idade negativa. Veja o exemplo abaixo:

         */

        int num =  0;
        int cont = 0;
        int soma = 0;
        int menor = 0;
        int maior = 0;


        Scanner ler = new Scanner(System.in);

        System.out.println("Digite uma idade: ");
        num = ler.nextInt();

        while (num != 999){
            cont += 1;
            soma += num;
            System.out.println("Digite uma idade:  [999] para parar: ");
            num = ler.nextInt();

            if (num < 21){
                System.out.println("Pessoa menor de 21 anos.");
                menor ++;
            }
            else if (num > 50 && num < 999){
                System.out.println("Pessoa maior de 50 anos");
                maior ++;
            }

        }
        System.out.println("\n\n=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
        System.out.println("\n\nTotal de pessoas menores de 21 anos: " + menor);
        System.out.println("Total de pessoas maiores de 50 anos: " + maior);



    }
}
