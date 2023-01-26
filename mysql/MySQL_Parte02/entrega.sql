/* 																		Atividade 01															*/

CREATE DATABASE db_generation_game_online;
USE db_generation_game_online;

create table tb_classes(
	id BIGINT AUTO_INCREMENT,
    nome varchar(255) not null,
    descricao varchar(255),
    primary key(id)
);

create table tb_personagens(
	id BIGINT auto_increment,
    nome varchar(255) not null,
    especial varchar(255),
    ataque int,
    defesa int,
    primary key(id)
);

insert into tb_classes value
(default,"Arqueiro", "Atira flechas"),
(default, "Bárbaro", "Mata na espada"),
(default, "Mago", "Uma magia forte"),
(default, "Feitiçeira", "Feitiços fortes");

select * from tb_classes;

insert into tb_personagens value
(default, "Joel", "Força", "2800", "1500"),
(default, "Ana", "Inteligente", "3000", "2078"),
(default, "Mario", "Astuto", "2000", "3000"),
(default, "Emilia", "fogo", "4000", "1234"),
(default, "João", "Gelo", "2500", "2000"),
(default, "Marta", "vento", "1800", "3000"),
(default, "Paulo", "agua", "2100", "2700"),
(default, "Carlão", "metal", "3245", "3500");




/* ADICIONANDO UMA NOVA COLUNA*/
ALTER TABLE tb_personagens ADD classes_id BIGINT;

/* Adicionando a constraint */
ALTER TABLE tb_personagens ADD CONSTRAINT fk_personagens_classes
FOREIGN KEY (classes_id) REFERENCES tb_classes (id);

select * from tb_classes;
desc tb_classes;

/* Faça um SELECT que retorne todes os personagens cujo poder de ataque seja maior do que 2000. */
SELECT * FROM tb_personagens WHERE ataque > 2000;

/* Faça um SELECT que retorne todes os personagens cujo poder de defesa esteja no intervalo 1000 e 2000. */
SELECT * FROM tb_personagens WHERE ataque > 1000 AND ataque < 2000;

/* Faça um SELECT utilizando o operador LIKE, buscando todes os personagens que possuam a letra C no atributo nome. */
SELECT * FROM tb_personagens WHERE nome LIKE "c%";

/* Faça um SELECT utilizando a cláusula INNER JOIN, unindo os dados da tabela tb_personagens com os dados da tabela tb_classes. */
select * from tb_classes
inner join tb_personagens
on tb_classes.id = tb_personagens.id;

/* Faça um SELECT utilizando a cláusula INNER JOIN, unindo os dados da tabela tb_personagens com os dados da tabela tb_classes, 
onde traga apenas os personagens que pertençam a uma classe específica (Exemplo: Todes os personagens da classe dos arqueiros).*/
Select tb_classes.nome,
tb_personagens.nome
from tb_classes
inner join tb_personagens
on tb_classes.id = tb_personagens.id;


																		/* Atividade 02 */

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