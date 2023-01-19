package atividade_01;

public class Cliente {
    public String nome;
    public int idade;
    public int rg;
    public String estadoCivil;
    public String telefone;

    public Cliente(String nome, int idade, int rg, String estadoCivil, String telefone){
        this.nome = nome;
        this.idade = idade;
        this.rg = rg;
        this.estadoCivil = estadoCivil;
        this.telefone = telefone;
    }

    public String getNome(String michael) {
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

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public void visualizar(){
        System.out.println("");
        System.out.println("Nome do cliente:    " + nome);
        System.out.println("Idade do cliente:   " + idade);
        System.out.println("RG do cliente:      " + rg);
        System.out.println("O estado cívil:     " + estadoCivil);
        System.out.println("Telefone do cliente " + telefone);
    }
}
