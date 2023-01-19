package atividades_entrega;

public class Entrega {
    public static void main(String [] args){
        /*
=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*
                                                        Atividade 01

            Utilizando os conceitos de Herança e Polimorfismo, da Programação Orientada a Objetos, crie as Classes
            PessoaFisica e PessoaJuridica, como Heranças da Classe Cliente (criada na lista de exercícios anterior),
            com os seus respectivos Métodos e Atributos. Na sequência, utilize a Classe TestaCliente para instanciar
            dois objetos da Classe PessoaFisica e dois objetos da Classe PessoaJuridica, e apresente as informações
            destes 4 Objetos na tela.
=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*

                                                    * Classe Cliente *
            public class Cliente {
                public String nome;
                public int idade;
                public int rg;
                public String estadoCivil;
                public String telefone;

                public Cliente(String nome, int idade, int rg, String estadoCivil, String telefone){
                    this.nome = nome;
                    this.idade = idade;
                    this.rg = rg;
                    this.estadoCivil = estadoCivil;
                    this.telefone = telefone;
                }

                public String getNome(String michael) {
                    return nome;
                }

                public void setNome(String nome) {
                    this.nome = nome;
                }

                public int getIdade() {
                    return idade;
                }

                public void setIdade(int idade) {
                    this.idade = idade;
                }

                public int getRg() {
                    return rg;
                }

                public void setRg(int rg) {
                    this.rg = rg;
                }

                public String getEstadoCivil() {
                    return estadoCivil;
                }

                public void setEstadoCivil(String estadoCivil) {
                    this.estadoCivil = estadoCivil;
                }

                public String getTelefone() {
                    return telefone;
                }

                public void setTelefone(String telefone) {
                    this.telefone = telefone;
                }
                public void visualizar(){
                    System.out.println("");
                    System.out.println("Nome do cliente:    " + nome);
                    System.out.println("Idade do cliente:   " + idade);
                    System.out.println("RG do cliente:      " + rg);
                    System.out.println("O estado cívil:     " + estadoCivil);
                    System.out.println("Telefone do cliente " + telefone);
                }
            }


=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*

                                            * Classe PessoaFisica *

            public class PessoaFisica extends Cliente {
                String empregador;

                public PessoaFisica(String nome, int idade, int rg, String estadoCivil, String telefone, String empregador) {
                    super(nome, idade, rg, estadoCivil, telefone);
                    this.empregador = empregador;
                }

                public String getEmpregador() {
                    return empregador;
                }

                public void setEmpregador(String empregador) {
                    this.empregador = empregador;
                }
            @Override
                public void visualizar(){
                   // super.visualizar();
                    System.out.println("Ficha de pessoa física!");
                    System.out.println("Nome: " + nome);
                    System.out.println("Empregador: " + empregador);

            }

            }
=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*
                                            * Classe PessoaJuridica *

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
=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*

                                                 ** TestaCliente **

            public class TestaCliente {
                public static void main(String[] args){

                    PessoaFisica pessoa_fisica = new PessoaFisica("Joel", 33, 123321, "Solteiro", "2211223311", "Mercado");

                    pessoa_fisica.visualizar();

                    PessoaJuridica pessoa_juridica = new PessoaJuridica("Michael", 55, 987654321, "Casado", "98097856123", "665576540987");

                    pessoa_juridica.setCnpj("1111111111");
                    pessoa_juridica.setNome("João");
                    pessoa_juridica.visualizar();

                }
}
=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*

=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*

=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*
         */





        /*
=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*
                                                Atividade 02

        Utilizando os conceitos de Herança e Polimorfismo, da Programação Orientada a Objetos, crie as Classes Gerente e
        Vendedor como heranças da Classe Funcionario (criada na lista de exercícios anterior), com os seus respectivos
        Métodos e Atributos. Na sequência, utilize a Classe TestaFuncionario para instanciar dois objetos da Classe
        Gerente e dois objetos da Classe Vendedor, e apresente as informações destes 4 Objetos na tela.

=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*

                                            * Classe Funcionario *

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

            public String getNome() {
                return nome;
            }

            public void setNome(String nome) {
                this.nome = nome;
            }

            public int getIdade() {
                return idade;
            }

            public void setIdade(int idade) {
                this.idade = idade;
            }

            public int getRegistro() {
                return registro;
            }

            public void setRegistro(int registro) {
                this.registro = registro;
            }

            public String getFuncao() {
                return funcao;
            }

            public void setFuncao(String funcao) {
                this.funcao = funcao;
            }

            public boolean isStatus() {
                return status;
            }

            public void setStatus(boolean status) {
                this.status = status;
            }

            void visualizar(){
                System.out.println("Nome do funcionário:            " + nome);
                System.out.println("Idade do funcionário:           " + idade);
                System.out.println("Registro do fuincionário:       " + registro);
                System.out.println("Cargo que o funcionário exerce: " + funcao);
                System.out.println("Funcionário está ativo ?        " + status);
            }
}
=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*

                                            * Classe Gerente *


            public class Gerente extends Funcionario {
                String departamento;

                public Gerente(String nome, int idade, int registro, String funcao, boolean status, String departamento) {
                    super(nome, idade, registro, funcao, status);
                    this.departamento = departamento;
                }

                public String getDepartamento() {
                    return departamento;
                }

                public void setDepartamento(String departamento) {
                    this.departamento = departamento;
                }

            @Override
                public void visualizar(){
                    //super.visualizar();
                    System.out.println("Nome do funcionário:            " + nome);
                    System.out.println("Departamento:                   " + departamento);
                }
}
=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*

                                        * Classe Vendedor *

         public class Vendedor extends Funcionario{
            Boolean metas;

            public Vendedor(String nome, int idade, int registro, String funcao, boolean status, boolean metas) {
                super(nome, idade, registro, funcao, status);
                this.metas = metas;
            }

            public Boolean getMetas() {
                return metas;
            }

            public void setMetas(Boolean metas) {
                this.metas = metas;
            }

        @Override
            public void visualizar(){
                System.out.println("\nNome do funcionário: " + nome);
                //super.visualizar();
                System.out.println("O vendedor alcançou as metas: " + metas);
                System.out.println("Cargo que o funcionário exerce: " + funcao);
        }
}
=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*

                                        * TestaFuncionario *

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
=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*

=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*

=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*
         */




        /*
=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*
/*
                                               // Atividade 03

       Utilizando os conceitos de Herança e Polimorfismo, da Programação Orientada a Objetos, crie as Classes Jogo e
       Console (PS5, Xbox, etc.) como heranças da Classe Produto (criada na lista de exercícios anterior), com os seus
       respectivos Métodos e Atributos. Na sequência, utilize a Classe TestaGame para instanciar dois objetos da Classe
       Jogo e dois objetos da Classe Console, e apresente as informações destes 4 Objetos na tela.


         */


                                        // Classe Console

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


                                        // Classe Jogo

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


                                            // Classe Produto

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






                                         //  TestaJogo

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

    }
}
