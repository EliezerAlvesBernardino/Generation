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

/* Faça um SELECT que retorne todes o/a(s) estudantes com a nota maior do que 7.0. */
SELECT * FROM tb_estudantes WHERE nota > 7.0;

/* Faça um SELECT que retorne todes o/a(s) estudantes com a nota menor do que 7.0. */
SELECT * FROM tb_estudantes WHERE nota < 7.0;

SELECT * FROM tb_estudantes;
 