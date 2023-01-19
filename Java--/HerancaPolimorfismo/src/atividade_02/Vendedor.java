package atividade_02;

public class Vendedor extends Funcionario{

    Boolean metas;

    public Vendedor(String nome, int idade, int registro, String funcao, boolean status, boolean metas) {
        super(nome, idade, registro, funcao, status);
        this.metas = metas;
    }

    public Boolean getMetas() {
        return metas;
    }

    public void setMetas(Boolean metas) {
        this.metas = metas;
    }

@Override
    public void visualizar(){
        System.out.println("\nNome do funcionário: " + nome);
        //super.visualizar();
        System.out.println("O vendedor alcançou as metas: " + metas);
        System.out.println("Cargo que o funcionário exerce: " + funcao);
}
}
