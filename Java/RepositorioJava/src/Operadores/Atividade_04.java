package Operadores;
import java.util.*;

public class Atividade_04 {
    public static void main(String[] args){
        /*

        Leia quatro valores float (numero1, numero2, numero3 e numero4).
        A seguir, calcule e mostre a diferença do produto entre o numero1
        e o numero2 pelo produto entre o numero3 e o numero4. Veja os
        exemplos abaixo:

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
