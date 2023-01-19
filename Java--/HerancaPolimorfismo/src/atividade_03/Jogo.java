package atividade_03;

public class Jogo extends Produto{

    int faixaEtaria;

    public Jogo(String nome, String categoria, int codigo, double preco, int garantia, int faixaEtaria) {
        super(nome, categoria, codigo, preco, garantia);
        this.faixaEtaria = faixaEtaria;
    }

    public int getFaixaEtaria() {
        return faixaEtaria;
    }

    public void setFaixaEtaria(int faixaEtaria) {
        this.faixaEtaria = faixaEtaria;
    }

@Override
    public void visualizar(){
        //super.visualizar();
        System.out.println("\nProduto: " + nome);
        System.out.println("A faixa etária do jogo é: " + faixaEtaria + " anos.");
    }
}
