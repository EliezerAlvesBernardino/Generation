package atividade_02;

public class Gerente extends Funcionario {
    String departamento;

    public Gerente(String nome, int idade, int registro, String funcao, boolean status, String departamento) {
        super(nome, idade, registro, funcao, status);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

@Override
    public void visualizar(){
        //super.visualizar();
        System.out.println("Nome do funcionário:            " + nome);
        System.out.println("Departamento:                   " + departamento);
    }
}
