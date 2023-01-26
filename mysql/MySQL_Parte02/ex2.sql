create database db_pizzaria_legal;
use db_pizzaria_legal;

create table tb_categorias(
	id bigint auto_increment,
	tamanho varchar(255),
	estilo varchar(255),
    primary key(id)
);

create table tb_pizzas(
	id bigint auto_increment,
    nome varchar(255),
    preco decimal,
    borda varchar(255),
	recheio varchar(255),
    primary key(id)
);

insert into tb_categorias value
(default, "Gigante", "Doce"),
(default, "Média", "Salgada"),
(default, "Gigante", "Salgada"),
(default, "Pequena", "Doce"),
(default, "Media", "Salgada");

insert into tb_pizzas value
(default, "Mussarela", "69.99", "Não", "Oregano"),
(default, "Peperone" , "49.99", "Não", "Azeitona"),
(default, "4 Queijos", "120.00", "Sim", "Queijo"),      
(default, "carne", "99.99", "Sim", "Queijo"),
(default, "frango", "139.99", "Sim", "Catupiry"),
(default, "pipoca", "39.99", "Não", "não"),
(default, "chocolate", "50.00", "Sim", "MM"),
(default, "Bombom", "75.99", "Não", "não");

select * from tb_pizzas;

/* Faça um SELECT que retorne todas as pizzas cujo valor seja maior do que R$ 45,00 */
SELECT * FROM tb_pizzas WHERE preco > 45;

/* Faça um SELECT que retorne todas as pizzas cujo valor esteja no intervalo R$ 50,00 e R$ 100,00 */
SELECT * FROM tb_pizzas WHERE preco > 50 AND preco < 100;

/* Faça um SELECT utilizando o operador LIKE, buscando todas as pizzas que possuam a letra M no atributo nome. */
SELECT * FROM tb_pizzas WHERE nome LIKE "M%";

/* Faça um SELECT utilizando a cláusula INNER JOIN, unindo os dados da tabela tb_pizzas com os dados da tabela tb_categorias */
select * from tb_pizzas
inner join tb_categorias
on tb_pizzas.id = tb_categorias.id;




