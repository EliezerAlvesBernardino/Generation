package AtividadesEntrega.Atividade_03;

public class TestaGame {
    public static void main(String[] args){
        Produto jogos = new Produto("Fifa", "Esportes", 123, 97.00, 1);

        jogos.nome = "Mario Bross";
        jogos.preco = 80.90;

        jogos.visualizar();
    }
}
