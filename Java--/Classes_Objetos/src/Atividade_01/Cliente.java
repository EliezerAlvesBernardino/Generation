package Atividade_01;

public class Cliente {
    public String nome;
    public int idade;
    public int rg;
    public String banco;
    public int conta;




    public Cliente(String nome, int idade, int rg, String banco, int conta){
        this.nome = nome;
        this.idade = idade;
        this.rg = rg;
        this.banco = banco;
        this.conta = conta;
    }

    void visualizar(){
        System.out.println("Nome do cliente:  " + nome);
        System.out.println("Idade do cliente: " + idade);
        System.out.println("RG do cliente:    " + rg);
        System.out.println("Banco do cliente: " + banco);
        System.out.println("Conta do cliente: " + conta);
    }

}
