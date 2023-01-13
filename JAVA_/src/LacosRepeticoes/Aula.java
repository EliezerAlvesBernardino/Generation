package LacosRepeticoes;

import java.util.Scanner;

public class Aula {

    public static void main(String[] args){

        /*
        //Laços de Repetição FOR

        String nome;
        int contador;

        Scanner leia = new Scanner(System.in);

        for (contador = 1; contador < 4; contador++){
            System.out.println("\nDigite o " + contador + " nome: ");
            nome = leia.nextLine();
            System.out.println("o " + contador + " nome é: " + nome);
        }

         */

        /*
        //Laço de Repetição FOR - Tabuada

        int numero, contador;
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite a Tabuada que você deseja calcular: ");
        numero = leia.nextInt();

        for (contador = 1; contador <= 10; contador ++){
            System.out.println(numero + " x " + contador + " = " + numero * contador);
        }

         */
/*
        // Laço de repetição WHILE
        String continua = "s";
        int numero1, numero2, resultado;
        Scanner leia = new Scanner(System.in);

        while (!continua.equals("n")){
            System.out.println("Digite o primeiro valor: ");
            numero1 = leia.nextInt();
            System.out.println("Digite o seugundo valor: ");
            numero2 = leia.nextInt();

            resultado = numero1 + numero2;

            System.out.println("O resultado da soma é: " + resultado);

            System.out.println("\n++++++++++++++++ MENU *******************");
            System.out.println("\nDeseja somar 2 valores ? ");
            System.out.println("\nDigite s para sim OU digite n para não: ");
            continua = leia.next();
            System.out.println("============================================");
        }




        int resultado, numero, contador = 1;
        Scanner leia = new Scanner(System.in);

        while(contador < 4 ){
            System.out.println("Digite o " + contador + "numero: ");
            numero = leia.nextInt();

            resultado = numero * 3;
            System.out.println(numero + " x 3 = " + resultado);
            System.out.println("\n============================================");
            contador ++;
        }
        System.out.println("\t\t________ Fim do Programa ____________");

 */
        //Laços de repetições DO WHILE

        int numero, resultado, contador = 3;
        Scanner leia = new Scanner(System.in);

        do {
            System.out.println("\nDigite um número inteiro: ");
            numero = leia.nextInt();

            resultado = numero * 5;

            System.out.println("\nO resultado da multiplicação é: " + resultado);

        } while (contador <= 2);
        

    }
}
