package AtividadesEntrega.Atividade_03.Atividade_02;

public class Funcionario {
    public String  nome;
    public int     idade;
    public int     registro;
    public String  funcao;
    public boolean status;

    public Funcionario(String nome, int idade, int registro, String funcao, boolean status){
        this.nome     = nome;
        this.idade    = idade;
        this.registro = registro;
        this.funcao   = funcao;
        this.status   = status;

    }

    void visualizar(){
        System.out.println("Nome do funcionário:            " + nome);
       // System.out.println("Idade do funcionário:           " + idade);
       // System.out.println("Registro do fuincionário:       " + registro);
        System.out.println("Cargo que o funcionário exerce: " + funcao);
       // System.out.println("Funcionário está ativo ?        " + status);
    }

}

