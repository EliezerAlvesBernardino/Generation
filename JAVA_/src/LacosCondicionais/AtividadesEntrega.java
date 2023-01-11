package LacosCondicionais;

import java.util.Scanner;

public class AtividadesEntrega {

    public static void main(String[] args){
        /*
========================================================================================================================
            1) Faça um algoritmo que leia 3 valores inteiros A, B, C e
            imprima na tela se a soma de A + B é maior, menor ou igual a C.
========================================================================================================================
        */
        int a,b,c,soma;

        Scanner ler = new Scanner(System.in);

        System.out.println("Olá seja bem-vindo!");

        System.out.println("Digite o número A: ");
        a = ler.nextInt();

        System.out.println("Digite o número B: ");
        b = ler.nextInt();

        System.out.println("Digite o número C: ");
        c = ler.nextInt();

        soma = a + b;
        if(soma < c){
            System.out.println("A soma de " + a + " + " + b + " é menor do que " + c);
        }
        else if(soma == c){
            System.out.println("A soma de " + a + " + " + b + " é igual a " + c);
        }
        else{
            System.out.println("A soma de " + a + " + " + b + " é maior do que " + c);
        }






        /*
========================================================================================================================
        2) Escreva um algoritmo em Portugol, que leia um número inteiro via teclado e mostre
        na tela uma mensagem indicando se este número é par ou ímpar e se o número é positivo
        ou negativo. Veja os exemplos abaixo:
========================================================================================================================

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

        */






        /*
========================================================================================================================
        3) Com base na tabela abaixo, escreva um algoritmo em Portugol
        que leia o código de um item (número inteiro de 1 a 6) e a
        quantidade comprada deste item (número inteiro). A seguir,
        mostre na tela o valor total da conta e o nome do produto que foi comprado.
========================================================================================================================
        int opcao, qtdade;
        double total, preco;

        Scanner ler = new Scanner(System.in);

        System.out.println("Seja bem-vindo a feirinha feliz! ");
        System.out.println("\n1  Cachorro-quente  R$ 10,00");
        System.out.println("\n2  X-Salada         R$ 15,00");
        System.out.println("\n3  X-Bacon          R$ 18,00");
        System.out.println("\n4  Bauru            R$ 12,00");
        System.out.println("\n5  Refrigerante     R$  8,00");
        System.out.println("\n6  Suco de laranja  R$ 13,00");

        System.out.println("\nCódigo do produto: ");
        opcao = ler.nextInt();

        System.out.println("Qual a quantidade: ");
        qtdade = ler.nextInt();

        switch (opcao){
            case 1:
                preco = 10.00;
                total = qtdade * preco;
                System.out.println("O valor do cachorro quente é R$: " + total);
                break;

            case 2:
                preco = 15.00;
                total = qtdade * preco;
                System.out.println("O valor do X-Salada é R$: " + total);
                break;

            case 3:
                preco = 18.00;
                total = qtdade * preco;
                System.out.println("O valor do X-Bacon é de R$: " + total);
                break;

            case 4:
                preco = 12.00;
                total = qtdade * preco;
                System.out.println("O valor do Bauru é de R$: " + total);
                break;

            case 5:
                preco = 8.00;
                total = qtdade * preco;
                System.out.println("O valor do Refrigerante é de R$: " + total);
                break;

            case 6:
                preco = 13.00;
                total = qtdade * preco;
                System.out.println("O valor do suco de Laranja é de R$: " + total);
                break;

        }

         */






        /*
========================================================================================================================
        4) Escreva um algoritmo em Portugol, que leia a idade de uma pessoa (número inteiro)
        e apresente na tela se a pessoa está ou não apta a votar e se seu voto é obrigatório
        ou facultativo, conforme a tabela abaixo:
========================================================================================================================

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

         */






        /*
========================================================================================================================
        5) Escreva um algoritmo em Portugol, que leia um valor com duas casas decimais,
        equivalente ao salário de uma pessoa. Em seguida, calcule e mostre o valor que
        esta pessoa deve pagar de Imposto de Renda ou Isento, segundo a tabela abaixo:
========================================================================================================================

        double renda, imposto;
        String nome;


        Scanner ler = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        nome = ler.nextLine();

        System.out.println("Olá " + nome + "\nSeja bem-vindo! ");

        System.out.println("Digite a sua renda: ");
        renda = ler.nextDouble();

        if (renda <= 2000){
            System.out.println(nome + "você está ISENTO de impostos!");
        }
        else if (renda >= 2000.01 && renda <= 3000.00){
            imposto = (8.00 / 100) * renda;
            System.out.println("Imposto de renda : R$ " + imposto);
        }
        else if (renda >= 3000.01 && renda <= 4500.00){
            imposto = (18.00 / 100) * renda;
            System.out.println("Imposto de renda : R$ "+ imposto);
        }
        else if(renda > 4500){
            imposto = (28.00 / 100) * renda;
            System.out.println("Imposto de renda : R$ " + imposto);
        }

         */





        
        /*
========================================================================================================================
        6) Escreva um algoritmo em Portugol, que leia 3 palavras (cadeia),
        que definem as características de um tipo de animal possível segundo
        o diagrama abaixo, que deve ser lido da esquerda para a direita.
========================================================================================================================

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

         */

    }
}
