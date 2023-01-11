package LacosCondicionais;

import java.util.Scanner;

public class Atividade_02 {
    public static void main(String[] args){
        int n1;

        Scanner ler = new Scanner(System.in);

        System.out.println("Olá seja bem-vindo! ");

        System.out.println("Digite um número: ");
        n1 = ler.nextInt();

        if (n1 % 2 == 0){
            if (n1 >= 0){
                System.out.println("Par e positivo!");
            }
            else{
                System.out.println("Par e negativo!");
            }
        }
        if (n1 % 2 != 0){
            if (n1 >= 0){
                System.out.println("Impar e positivo!");
            }
            else{
                System.out.println("Impar e negativo!");
            }
        }
    }
}
