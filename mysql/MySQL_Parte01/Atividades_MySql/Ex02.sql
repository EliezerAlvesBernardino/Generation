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

/* Faça um SELECT que retorne todes os produtos com o valor maior do que 500 */
SELECT * FROM tb_produtos WHERE preco > 500;

/* Faça um SELECT que retorne todes os produtos com o valor menor do que 500. */
SELECT * FROM tb_produtos WHERE preco < 500;

/* Ao término atualize um registro desta tabela através de uma query de atualização. */
SELECT * FROM tb_produtos;




