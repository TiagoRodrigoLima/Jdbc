CREATE DATABASE jdbc;

USE jdbc;

CREATE TABLE Alunos (
	id INT NOT NULL AUTO_INCREMENT,
	matricula VARCHAR(45),
	nome VARCHAR(45),
	coeficienteRendimento DOUBLE,
	aprovado BOOLEAN,
	PRIMARY KEY(id)
);

DESC Alunos;

SELECT * FROM Alunos;

DROP TABLE Alunos;
