package LacosCondicionais;

import java.util.Scanner;

public class Atividade_06 {
    public static void main(String[] args){
        String name1, name2, name3;

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite a primeira característica: ");
        name1 = ler.nextLine();

        System.out.println("Digite a segunda característica: ");
        name2 = ler.nextLine();

        System.out.println("Digite a terceira característica: ");
        name3 = ler.nextLine();

        if (name1.equals("vertebrado") && name2.equals("ave") && name3.equals("carnívoro")){
            System.out.println("Águia!");
        }
        else if (name1.equals("vertebrado") && name2.equals("ave") && name3.equals("onívoro")){
            System.out.println("Pomba!");
        }
        else if (name1.equals("vertebrado") && name2.equals("mamífero") && name3.equals("onívoro")){
            System.out.println("Homem!");
        }
        else if (name1.equals("vertebrado") && name2.equals("mamífero") && name3.equals("herbívoro")){
            System.out.println("Vaca!");
        }
        else if (name1.equals("invertebrado") && name2.equals("inseto") && name3.equals("hematófago")){
            System.out.println("Pulga!");
        }
        else if (name1.equals("invertebrado") && name2.equals("inseto") && name3.equals("herbívoro")){
            System.out.println("Largata!");
        }
        else if (name1.equals("invertebrado") && name2.equals("anelídeo") && name3.equals("hematófago")){
            System.out.println("Sanguessuga!");
        }
        else if (name1.equals("invertebrado") && name2.equals("anelídeo") && name3.equals("onivoro")){
            System.out.println("Minhoca!");
        }
    }
}
