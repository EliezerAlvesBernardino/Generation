package LacosCondicionais;

import java.util.Scanner;

public class Atividade_01 {
    public static void main(String[] args){
        int a,b,c,soma;

        Scanner ler = new Scanner(System.in);

        System.out.println("Olá seja bem-vindo!");

        System.out.println("Digite o número A: ");
        a = ler.nextInt();

        System.out.println("Digite o número B: ");
        b = ler.nextInt();

        System.out.println("Digite o número C: ");
        c = ler.nextInt();

        soma = a + b;
        if(soma < c){
            System.out.println("A soma de " + a + " + " + b + " é menor do que " + c);
        }
        else if(soma == c){
            System.out.println("A soma de " + a + " + " + b + " é igual a " + c);
        }
        else{
            System.out.println("A soma de " + a + " + " + b + " é maior do que " + c);
        }
    }
}
