package Atividade_01;

public class Cliente {
    public String nome;
    public int    idade;
    public int    rg;
    public String banco;
    public int    conta;




    public Cliente(String nome, int idade, int rg, String banco, int conta){
        this.nome  = nome;
        this.idade = idade;
        this.rg    = rg;
        this.banco = banco;
        this.conta = conta;
    }

    public Cliente(){

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getRg() {
        return rg;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
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
