package AtividadesEntrega.Atividade_03;

public class Produto {
    public String nome;
    public String categoria;
    public int    codigo;
    public double preco;
    public int    garantia;

    public Produto(String nome, String categoria, int codigo, double preco, int garantia){
        this.nome      = nome;
        this.categoria = categoria;
        this.codigo    = codigo;
        this.preco     = preco;
        this.garantia  = garantia;
    }

    void visualizar(){
        System.out.println("Produto:           " + nome);
        System.out.println("Categoria:         " + categoria);
        System.out.println("Código do produto: " + codigo);
        System.out.println("Preço:             " + preco);
        System.out.println("Garantia:          " + garantia);

    }
}
