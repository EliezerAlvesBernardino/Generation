CREATE DATABASE db_quitanda;
USE db_quitanda;

CREATE TABLE tb_produtos(
    id bigint auto_increment,
	nome varchar(255) not null,
	quantidade int,
	preco decimal not null,
    PRIMARY KEY (id)
);

INSERT INTO tb_produtos(nome, quantidade, preco)
values ("tomate", 100, 8.00);
INSERT INTO tb_produtos(nome, quantidade, preco)
values("maçã", 20, 5.00);
INSERT INTO tb_produtos(nome, quantidade, preco)
values("Laranja", 50, 10.00);
INSERT INTO tb_produtos(nome, quantidade, preco)
values("banana", 200, 12.00);
INSERT INTO tb_produtos(nome, quantidade, preco)
values("Uva", 1200, 30.00);
INSERT INTO tb_produtos(nome, quantidade, preco)
values("pera", 500, 2.99);


SELECT * FROM tb_produtos;
