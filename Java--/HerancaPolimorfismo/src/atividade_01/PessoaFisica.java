package atividade_01;

public class PessoaFisica extends Cliente {
    String empregador;

    public PessoaFisica(String nome, int idade, int rg, String estadoCivil, String telefone, String empregador) {
        super(nome, idade, rg, estadoCivil, telefone);
        this.empregador = empregador;
    }

    public String getEmpregador() {
        return empregador;
    }

    public void setEmpregador(String empregador) {
        this.empregador = empregador;
    }
@Override
    public void visualizar(){
       // super.visualizar();
        System.out.println("Ficha de pessoa física!");
        System.out.println("Nome: " + nome);
        System.out.println("Empregador: " + empregador);

}

}
