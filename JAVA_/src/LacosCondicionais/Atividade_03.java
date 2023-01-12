package LacosCondicionais;

import java.util.Scanner;

public class Atividade_03 {
    public static void main(String[] args){
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
            default:
                System.out.println("\n Opção inválida! Digite novamente.");
        }
    }
}
