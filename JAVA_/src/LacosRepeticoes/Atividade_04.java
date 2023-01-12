package LacosRepeticoes;

import java.util.Scanner;

public class Atividade_04 {

    public static void main(String[] args){
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


    }
}
