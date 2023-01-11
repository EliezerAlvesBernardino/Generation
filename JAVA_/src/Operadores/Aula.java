package Operadores;
import java.util.*;
public class Aula {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int x, y, z, w;
        double e = 4.54646;
        int dez = 10, cin = 5;
        boolean resposta;
        boolean proposicao_01;
        boolean proposicao_02;

        System.out.println("Digite o Valor de x: ");
        x = ler.nextInt();
        System.out.println("Digite o Valor de y:");
        y = ler.nextInt();
        System.out.println("Digite o Valor de z:");
        z = ler.nextInt();
        System.out.println("Digite o Valor de w:");
        w = ler.nextInt();

        System.out.printf("Valor de double %.2f", Math.sqrt(e));
        System.out.println("\nA soma de " + x + " + " + y + " = " + (x + y));
        System.out.println("Módulo (resto da divisão) de " + x + ": " + (x % 2));

        System.out.println("\n Operadores lógicos");

        resposta = dez > cin;
        System.out.println("O valor de 10 é maior do que o valor de 5? "+ resposta);

        resposta = dez == cin;
        System.out.println("O valor de 10 é = a o valor de 5? "+ resposta);

        System.out.println("\n\nConjunção\n");

        proposicao_01 = dez > cin;
        proposicao_02 = dez == cin;

        System.out.println("\n\nConjunção\n");
        resposta = proposicao_01 && proposicao_02;
        System.out.println("\n\nDisjunção\n");
        resposta = proposicao_01 || proposicao_02;
        System.out.println("\n\nNegação\n");
        resposta = !proposicao_01 || !proposicao_02;
    }
}
