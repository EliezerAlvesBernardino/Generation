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








