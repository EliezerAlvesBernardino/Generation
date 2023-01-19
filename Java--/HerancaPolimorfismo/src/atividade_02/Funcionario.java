package atividade_02;

public class Funcionario {
    public String  nome;
    public int     idade;
    public int     registro;
    public String  funcao;
    public boolean status;


    public Funcionario(String nome, int idade, int registro, String funcao, boolean status){
        this.nome     = nome;
        this.idade    = idade;
        this.registro = registro;
        this.funcao   = funcao;
        this.status   = status;
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

    public int getRegistro() {
        return registro;
    }

    public void setRegistro(int registro) {
        this.registro = registro;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    void visualizar(){
        System.out.println("Nome do funcionário:            " + nome);
        System.out.println("Idade do funcionário:           " + idade);
        System.out.println("Registro do fuincionário:       " + registro);
        System.out.println("Cargo que o funcionário exerce: " + funcao);
        System.out.println("Funcionário está ativo ?        " + status);
    }
}
