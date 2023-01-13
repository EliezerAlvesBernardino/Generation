package aula_metodos;

import static aulaMetodos.pacote1.ClassePacote1.*;

public class TestarMetodos {

    public static void main(String[] args){

        //Chamadas dos Métodos criados na Classe TstarMetodos
        metodoPublico();
        metodoFriendly();
        metodoProtegido();
        metodoPrivado();

        //Chamada dos Métodos criados na Classe Classe1
        Classe1.metodoPublico();
        Classe1.metodoFriendly1();
        Classe1.metodoProtegido();

        //Erro: Método Private não pode ser acessado por outra classe
        //Classe1.metodoPrivado();

        //Chamadas dos Métodos criados na Classe ClassePacote1
        metodoPublicoPacote1();

        //Erro: Método Friendly não pode ser acessado por uma Classe de outro pacote
        //metodoFriendlyPacote1();

        //Erro: Método Protected não pode ser acessado ser acessado por uma Classe em outro Pacote
        //metodoProtegidoPacote1();

        //Erro: Método Private não pode ser acessado por outra classe independente do pacote
        //metodoPrivadoPacote1();


    }


    //Métodos da Classe TestaMétodos

    //Método Public
    public static void metodoPublico(){
        System.out.println("Método Público - Classe Testa Métodos");
    }

    //Método Friendly
    static void metodoFriendly(){
        System.out.println("Método Friendly - Classe Testa Métodos");
    }

    //Método Protected
    protected static void metodoProtegido(){
        System.out.println("Método Protegido - Classe Testa Métodos");
    }

    //Método Private
    private static void metodoPrivado(){
        System.out.println("Método Privado - Classe Testa Métodos");
    }
}
