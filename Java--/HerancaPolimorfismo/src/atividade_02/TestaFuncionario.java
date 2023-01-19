package atividade_02;

public class TestaFuncionario {
    public static void main(String[] args){
        Gerente gerente01 = new Gerente("Joel", 40, 031, "Gerente de TI", true, "TI");

        gerente01.setNome("Michael");
        gerente01.setDepartamento("TI Software");
        gerente01.visualizar();

        Vendedor vendedor01 = new Vendedor("Antonio", 30, 9811, "Vendedor", true, true);
        vendedor01.setNome("Marcelo");
        vendedor01.setMetas(true);
        vendedor01.visualizar();
    }
}
