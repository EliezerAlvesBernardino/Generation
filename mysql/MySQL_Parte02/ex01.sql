
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




