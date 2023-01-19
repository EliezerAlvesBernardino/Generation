package atividade_01;

public class PessoaJuridica extends Cliente{

    String cnpj;

    public PessoaJuridica(String nome, int idade, int rg, String estadoCivil, String telefone, String cnpj) {
        super(nome, idade, rg, estadoCivil, telefone);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
@Override
    public void visualizar(){
        //super.visualizar();
        System.out.println("\nFicha de pessoa jurídica!");
        System.out.println("Nome: " + nome);
        System.out.println("CNPJ: " + cnpj);
}

}
