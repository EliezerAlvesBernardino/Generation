CREATE DATABASE db_atividade;
USE db_atividade;

CREATE TABLE tb_ficha(
	id bigint auto_increment,
		nome varchar(255) not null,
        idade int,
        rg int,
        profissao varchar(255) not null,
        salario decimal not null,
        PRIMARY KEY (id)
)
SELECT * FROM tb_ficha;

INSERT INTO tb_ficha(nome, idade, rg, profissao, salario)
values ("Joel", 40, 12345, "Cozinheiro", 3400.00);

INSERT INTO tb_ficha(nome, idade, rg, profissao, salario)
values ("Mario", 44, 54321, "Ajudante de cozinha", 3000.00);

INSERT INTO tb_ficha(nome, idade, rg, profissao, salario)
values ("Marcelo", 30, 654789, "Garçom", 2400.00);

INSERT INTO tb_ficha(nome, idade, rg, profissao, salario)
values ("Jorge", 33, 567890, "Manobrista", 2400.00);

INSERT INTO tb_ficha(nome, idade, rg, profissao, salario)
values ("Ana", 26, 1357912, "Recpcionista", 2350.00);

DELETE FROM tb_ficha WHERE id = 7;
DELETE FROM tb_ficha WHERE id = 6;

SELECT * FROM tb_ficha;

/* Faça um SELECT que retorne todes os colaboradores com o salário maior do que 2000. */
SELECT * FROM tb_ficha WHERE salario > 2000.00;
/* Faça um SELECT que retorne todes os colaboradores com o salário menor do que 2000. */
SELECT * FROM tb_ficha WHERE salario < 2000.00;
/* Ao término atualize um registro desta tabela através de uma query de atualização. */
SELECT * FROM tb_ficha;








/*.                            												Atividade 02
=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8

USE db_ecommerce;
DROP TABLE tb_produtos;

CREATE TABLE tb_produtos(
	id bigint auto_increment,
    nome varchar(255),
    quantidade int,
    preco decimal NOT NULL,
    validade varchar (255),
    categoria varchar(255),
    PRIMARY KEY (id)
);

INSERT INTO tb_produtos(nome, quantidade, preco, validade, categoria)
VALUES("Caneca", 50, 59.99, "Não possui", "Cozinha");

INSERT INTO tb_produtos(nome, quantidade, preco, validade, categoria)
VALUES("Smart TV", 30, 2699.99, "2 anos", "Eletrônico");

INSERT INTO tb_produtos(nome, quantidade, preco, validade, categoria)
VALUES("Celular", 150, 1899.99, "1 ano", "Eletrônico");

INSERT INTO tb_produtos(nome, quantidade, preco, validade, categoria)
VALUES("Fogão", 10, 699.99, "1 ano", "Eletrodoméstico");

INSERT INTO tb_produtos(nome, quantidade, preco, validade, categoria)
VALUES("Geladeira", 20, 1799.99, "2 anos", "Eletrodoméstico");

INSERT INTO tb_produtos(nome, quantidade, preco, validade, categoria)
VALUES("Panela", 150, 159.99, "Não possui", "Cozinha");

INSERT INTO tb_produtos(nome, quantidade, preco, validade, categoria)
VALUES("Sofá", 33, 1499.99, "1 ano", "Móveis");

INSERT INTO tb_produtos(nome, quantidade, preco, validade, categoria)
VALUES("Armário", 9, 3059.99, "2 anos", "Móveis");

SELECT * FROM tb_produtos;
*/

/* Faça um SELECT que retorne todes os produtos com o valor maior do que 500 */
SELECT * FROM tb_produtos WHERE preco > 500;

/* Faça um SELECT que retorne todes os produtos com o valor menor do que 500. */
SELECT * FROM tb_produtos WHERE preco < 500;

/*=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8*/







/*																			Atividade 03
/*=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8=8*/



/*
CREATE DATABASE db_escola;
USE db_escola;

CREATE table tb_estudantes(
	id BIGINT AUTO_INCREMENT,
    nome varchar(255),
    idade int,
    nascimento DATE,
    matricula int,
    nota DOUBLE,
    primary key(id)
    );
    
INSERT INTO tb_estudantes(nome, idade, nascimento, matricula, nota)
VALUES('Joel', 15, '2005-05-23', 298, 8.9);

INSERT INTO tb_estudantes(nome, idade, nascimento, matricula, nota)
VALUES('Ana', 16, '2004-06-02', 221, 6.7);

INSERT INTO tb_estudantes(nome, idade, nascimento, matricula, nota)
VALUES('Cirilo', 15, '2005-11-07', 256, 10.0);

INSERT INTO tb_estudantes(nome, idade, nascimento, matricula, nota)
VALUES('Manoel', 17, '2003-04-22', 234, 5.8);

INSERT INTO tb_estudantes(nome, idade, nascimento, matricula, nota)
VALUES('Joana', 17, '2003-12-10', 233, 7.0);

INSERT INTO tb_estudantes(nome, idade, nascimento, matricula, nota)
VALUES('Marcelo', 18, '2002-09-17', 279, 6.9);

INSERT INTO tb_estudantes(nome, idade, nascimento, matricula, nota)
VALUES('Emiliana', 17, '2003-11-20', 296, 7.8);

INSERT INTO tb_estudantes(nome, idade, nascimento, matricula, nota)
VALUES('Julia', 16, '2004-01-24', 200, 9.9);

*/

/* Faça um SELECT que retorne todes o/a(s) estudantes com a nota maior do que 7.0. */
SELECT * FROM tb_estudantes WHERE nota > 7.0;

/* Faça um SELECT que retorne todes o/a(s) estudantes com a nota menor do que 7.0. */
SELECT * FROM tb_estudantes WHERE nota < 7.0;

SELECT * FROM tb_estudantes;















