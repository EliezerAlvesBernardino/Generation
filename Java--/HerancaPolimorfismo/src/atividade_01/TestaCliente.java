package atividade_01;

public class TestaCliente {
    public static void main(String[] args){

        PessoaFisica pessoa_fisica = new PessoaFisica("Joel", 33, 123321, "Solteiro", "2211223311", "Mercado");

        pessoa_fisica.visualizar();

        PessoaJuridica pessoa_juridica = new PessoaJuridica("Michael", 55, 987654321, "Casado", "98097856123", "665576540987");

        pessoa_juridica.setCnpj("1111111111");
        pessoa_juridica.setNome("João");
        pessoa_juridica.visualizar();

    }
}
