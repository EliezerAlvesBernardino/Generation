package atividade_03;

public class Console extends Produto {

    String marca;

    public Console(String nome, String categoria, int codigo, double preco, int garantia, String marca) {
        super(nome, categoria, codigo, preco, garantia);
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void visualizar(){
        super.visualizar();
        System.out.println("A marca do console é " + marca);
    }
}
