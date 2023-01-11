
import java.util.Scanner;

public class Aula {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int idade;
        Boolean cnh;
        System.out.println("Qual sua idade?");
        idade = ler.nextInt();

        System.out.println("Você tem CNH? sim ou não");
        cnh = ler.nextBoolean();

        if (idade >= 18 && cnh == true) {
             System.out.println("Você pode dirigir.");
         } else if (idade >= 18 && cnh == false) {
             System.out.println("Você não pode dirigir!");
         } else {
             System.out.println("Infelizmente você não tem idade para dirigir...");
         }









        int opcao;
         Scanner leia = new Scanner(System.in);

         System.out.println("# ## ### #### #########   Menu   ########## #### ### ## #");

         System.out.println("\n--Digite 1 para Biblioteca--");
         System.out.println("--Digite 2 para Canal de Videoaulas--");
         System.out.println("--Digite 3 para Canal de Músicas--");
         opcao = leia.nextInt();

         switch (opcao) {
             case 1:
                 System.out.println("Biblioteca.");
                 break;
             case 2:
                 System.out.println(
                         "Videoaulas.");
                 break;
             case 3:
                 System.out.println("Canal de Músicas.");
                 break;
             default:
                 System.out.println("Opção inválida!");
         }


    }
 }

