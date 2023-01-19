package Atividade_01;

public class TestaCliente {
    public static void main(String[] args){
        Cliente cliente01 = new Cliente();

        cliente01.visualizar();
        System.out.println("Nome: " + cliente01.nome);

        cliente01.setNome("jj");

    }

}
