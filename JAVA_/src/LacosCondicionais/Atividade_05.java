package LacosCondicionais;

import java.util.Scanner;

public class Atividade_05 {
    public static void main(String[] args){
        double renda, imposto;
        String nome;


        Scanner ler = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        nome = ler.nextLine();

        System.out.println("Olá " + nome + "Seja bem-vindo! ");

        System.out.println("Digite a sua renda: ");
        renda = ler.nextDouble();

        if (renda <= 2000){
            System.out.println(nome + "você está ISENTO de impostos!");
        }
        else if (renda >= 2000.01 && renda <= 3000.00){
            imposto = (8.00 / 100) * renda;
            System.out.println("Imposto de renda : R$ " + imposto);
        }
        else if (renda >= 3000.01 && renda <= 4500.00){
            imposto = (18.00 / 100) * renda;
            System.out.println("Imposto de renda : R$ "+ imposto);
        }
        else if(renda > 4500){
            imposto = (28.00 / 100) * renda;
            System.out.println("Imposto de renda : R$ " + imposto);
        }
    }
}
