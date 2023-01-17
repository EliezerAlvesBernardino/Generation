package AtividadesEntrega.Atividade_03.Atividade_02;

public class TestaFuncionario {
    public static void main(String[] args){
        Funcionario funcionario_01 = new Funcionario("Joel", 44,123, "Encarregado",true);

        funcionario_01.nome = "José";
        funcionario_01.funcao = "Analista";
        funcionario_01.visualizar();
    }
}
