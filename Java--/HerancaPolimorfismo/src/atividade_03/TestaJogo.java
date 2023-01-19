package atividade_03;

import atividade_02.Vendedor;

public class TestaJogo {
    public static void main(String[] args){
        Jogo jogo01 = new Jogo("Fifa", "Esportes",876, 89.90, 1, 14);

        jogo01.visualizar();

        Vendedor vendedor01 = new Vendedor("Mario", 33, 123, "Vendedor de jogos", true, true);
        vendedor01.setNome("Antonio");
        vendedor01.setMetas(false);
        vendedor01.visualizar();
    }

}
