package LacosRepeticoes;

import java.util.Scanner;

public class AtividadesParaEntrega {

    public static void main(String[] args){
         /*
                                Atividade 01

        Escreva um algoritmo em Java, que leia 2 números inteiros via teclado,
        onde o primeiro número deve ser menor que o segundo número. Caso contrário,
        deve ser exibida uma mensagem na tela informando que o intervalo é inválido
        e sair do programa. Dentro do intervalo informado, mostre na tela todes os
        números que são múltiplos de 3 e 5. Veja os exemplos abaixo:

        */


        int n1,n2;

        Scanner ler = new Scanner(System.in);

        System.out.println("Olá seja bem-vindo!");

        System.out.println("Digite o primeiro número: ");
        n1 = ler.nextInt();

        System.out.println("Digite o segundo numero: ");
        n2 = ler.nextInt();

        if (n1 < n2){
            for (int c = n1; c <= n2; c++ ){
                if (n1 % 3 == 0 && n1 % 5 == 0){
                    System.out.println(n1 + " é multiplo de 3 e 5\n");
                }
                n1++;
            }

        }else{
            System.out.println("Intervalo inválido!");

        }





        /*
                                Atividade 02

            Escreva um algoritmo em Java, que leia 10 números inteiros
            via teclado e mostre na tela quantos números são pares e
            quantos número são ímpares. Veja o exemplo abaixo


        int num = 0;
        int contPar = 0,conImpar = 0;
        int somaPar = 0, somaImpar = 0;

        System.out.println("Olá seja bem-vindo!");

        Scanner ler = new Scanner(System.in);

        for (int c = num; c < 10; c++){
            System.out.println("Digite o " + c + " número: ");
            num = ler.nextInt();

            if (num % 2 == 0){
                System.out.println("Este número é o Par. ");
                contPar ++;
                somaPar += num;
            }else {
                System.out.println("Este é o número ímpar. ");
                conImpar ++;
                somaImpar += num;
            }
            num++;
        }
        System.out.println("\n\n\nTotal de números pares:   " + contPar);
        System.out.println("Total de números ímpares  " + conImpar);
        System.out.println("\n A soma dos números pares: " + somaPar);
        System.out.println("\n A soma dos números ímpares: " + somaImpar);

         */





                /*
                                        Atividade 03

        Escreva um algoritmo em Java, que leia a idade de várias pessoas (números inteiros),
        via teclado e mostre na tela o total de pessoas cuja idade seja menor que 21 anos e o
        total de pessoas cuja idade seja maior que 50 anos. A leitura dos dados deve ser finalizada
        ao digitar uma idade negativa. Veja o exemplo abaixo:



        int num =  0;
        int cont = 0;
        int soma = 0;
        int menor = 0;
        int maior = 0;


        Scanner ler = new Scanner(System.in);

        System.out.println("Digite uma idade: ");
        num = ler.nextInt();

        while (num != 999){
            cont += 1;
            soma += num;
            System.out.println("Digite uma idade:  [999] para parar: ");
            num = ler.nextInt();

            if (num < 21){
                System.out.println("Pessoa menor de 21 anos.");
                menor ++;
            }
            else if (num > 50 && num < 999){
                System.out.println("Pessoa maior de 50 anos");
                maior ++;
            }

        }
        System.out.println("\n\n=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
        System.out.println("\n\nTotal de pessoas menores de 21 anos: " + menor);
        System.out.println("Total de pessoas maiores de 50 anos: " + maior);

         */





        /*
                                   Atividade 04

            Uma empresa desenvolveu uma pesquisa interna para conhecer os colaboradores
            da área de Desenvolvimento e precisam de um sistema para analisar os dados.
            Escreva um algoritmo em Java, que leia via teclado as seguintes informações
            de cada colaborador:


        int idade,sexo,categoria,DevBackend = 0;
        int MulherFrontend = 0;
        int HomDevMob40 = 0;
        int MuDevFull30 = 0;

        String continua = "s";

        Scanner ler = new Scanner(System.in);

        while (!continua.equals("n")){

            System.out.println("Digite sua idade: ");
            idade = ler.nextInt();

            System.out.println("\n=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");


            System.out.println("1 - Masculino");
            System.out.println("2 - Feminino");
            System.out.println("3 - Outros");
            System.out.println("Informe seu sexo: ");
            sexo = ler.nextInt();

            System.out.println("\n\n=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");

            System.out.println("1 - Backend");
            System.out.println("2 - Frontend");
            System.out.println("3 - Mobile");
            System.out.println("4 - FullStack");
            System.out.println("Informe sua categoria: ");
            categoria = ler.nextInt();
            if (categoria == 1){
                DevBackend += 1;
            }
            else if (sexo == 2 && categoria == 2){
                MulherFrontend += 1;
            }
            else if (idade > 40 && sexo == 1 && categoria == 3){
                HomDevMob40 += 1;
            }
            else if(idade < 30 && sexo == 2 && categoria == 4){
                MuDevFull30 += 1;
            }

            System.out.println("\n\n=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");



            System.out.println("\n++++++++++++++++MENU++++++++++++++++++");
            System.out.println("\nDeseja continuar ? ");
            System.out.println("\nDigite s para sim OU digite n para não: ");
            continua = ler.next();
            System.out.println("Total de desenvolvedores Backend: " + DevBackend);
            System.out.println("O número de mulheres desenvolvedoras Frontend: " + MulherFrontend );
            System.out.println("O número de Homens desenvolvedores Mobile maiores de 40 anos é : " + HomDevMob40);
            System.out.println("O número de mulheres desenvolvedoras FullStack menores de 30 anos é :" + MuDevFull30);
            System.out.println("++++++++++++++++++++++++++++++++++");
        }

        */





        /*
                                Atividade 05

        Escreva um algoritmo em Java, que leia números inteiros via teclado,
        até que o número zero seja digitado. Ao final, mostre na tela a soma
        de todos os números digitados, que sejam positivos. Veja o exemplo abaixo:


        int cont = 0;
        int soma = 0;
        int positivo  = 0;
        int num  = 0;

        Scanner ler = new Scanner(System.in);

        do{
            System.out.println("Digite um número: ");
            num = ler.nextInt();
            if (num >= 0){
                positivo += 1;
                soma += num;
            }

        }while (num != 0);
        System.out.println("Os números positivos são: " + positivo);
        System.out.println("A soma dos números positivos é : " + soma);


         */





        
        /*
                                    Atividade 06

        Escreva um algoritmo em Java, que leia números inteiros via teclado,
        até que o número zero seja digitado. Ao final, mostre na tela a média
        de todos os números digitados, que sejam múltiplos de 3. Veja o exemplo abaixo:


        int num  = 0;
        int soma = 0;
        int cont = 0;
        float media = 0;

        Scanner ler = new Scanner(System.in);

        do {
            System.out.println("Digite um número: ");
            num = ler.nextInt();

            if (num % 3 == 0 && num != 0) {
                soma += num;
                cont += 1;

            }

        }while (num != 0);

        media = soma / cont;

        System.out.println("A soma dos números múltiplos de 3 é :" + soma);
        System.out.println("A média de todos os números múltiplos de 3 é: " + media);

         */

    }
    }

