package Operadores;
import java.util.*;
public class Atividade_01 {
    public static void main(String[] args){

        int salario = 0;
        int abono = 0;

        Scanner ler = new Scanner(System.in);

        System.out.println("Olá seja bem-vindo!");

        System.out.println("\nDigite seu salário: ");
        salario = ler.nextInt();
        System.out.println("Digite o abono: ");
        abono = ler.nextInt();

        System.out.println("O novo salário é: "+ (salario + abono));
    }
}
