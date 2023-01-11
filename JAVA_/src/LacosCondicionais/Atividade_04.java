package LacosCondicionais;

import java.util.Scanner;

public class Atividade_04 {
    public static void main(String[] args){
        int idade;
        String nome;

        Scanner ler = new Scanner(System.in);

        System.out.println("Seja bem-vindo eleitor!");

        System.out.println("Digite seu nome: ");
        nome = ler.nextLine();

        System.out.println("Informe a sua idade: ");
        idade = ler.nextInt();;

        if (idade >= 16 && idade <= 18){
            System.out.println("A " + nome + " está apta a votar e o voto é facultativo.");
        }
        else if (idade >= 18 && idade < 65){
            System.out.println("A " + nome + " está apta a votar e o voto é obrigatório.");
        }
        else if (idade >= 65 ){
            System.out.println("A " + nome + " está apta a votar e o voto é facultativo.");
        }
        else {
            System.out.println("A " + nome + " não está apta a votar.");
        }

    }
}
