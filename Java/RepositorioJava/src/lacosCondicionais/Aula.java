package lacosCondicionais;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Aula {

    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int idade;
        boolean cnh;

        System.out.println("Digite a sua idade: ");
        idade = ler.nextInt();

        System.out.println("Você tem cnh ? sim ou não: ");
        cnh = ler.nextBoolean();

        if (idade >= 18 && cnh == true){
            System.out.println("Você pode dirigir: ");
        }
        else if(idade >= 18 && cnh == false){
            System.out.println("Você não pode dirigir.");
        }
        else{
            System.out.println("infelizmente você não tem idade para dirigir!");

        }
    }
}
