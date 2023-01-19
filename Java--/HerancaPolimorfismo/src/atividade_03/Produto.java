package atividade_03;

public class Produto {
    public String nome;
    public String categoria;
    public int codigo;
    public double preco;
    public int garantia;

    public Produto(String nome, String categoria, int codigo, double preco, int garantia) {
        this.nome = nome;
        this.categoria = categoria;
        this.codigo = codigo;
        this.preco = preco;
        this.garantia = garantia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getGarantia() {
        return garantia;
    }

    public void setGarantia(int garantia) {
        this.garantia = garantia;
    }

    void visualizar() {
        System.out.println("Produto:           " + nome);
        System.out.println("Categoria:         " + categoria);
        System.out.println("Código do produto: " + codigo);
        System.out.println("Preço:             " + preco);
        System.out.println("Garantia:          " + garantia + " ano.");
    }

}
