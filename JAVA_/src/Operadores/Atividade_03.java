package Operadores;
import java.util.*;

public class Atividade_03 {
    public static void main(String[] args){
        /*

        Elabore um algoritmo que leia o Salário Bruto,
        o Adicional Noturno, as Horas Extras e os Descontos
        de um Colaborador, em variáveis do tipo float e exiba
        na tela o Salário Líquido. Veja o exemplo abaixo:

         */

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
    }
}
