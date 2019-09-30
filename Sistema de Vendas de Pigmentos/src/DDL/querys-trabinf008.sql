CREATE DATABASE PigmentationSystem

USE pigmentationsystem

CREATE TABLE PIGMENTORBG(
	id varchar(50) not null,
    nome varchar(150) not null,
    quantity int,
    preco double not null,
    red int not null,
    green int not null,
    blue int not null
);

CREATE TABLE PIGMENTOCMYK(
  id varchar(250) not null,
  preco double not null,
  nome varchar(250) not null,
  quantity integer not null,
  cianno int not null,
  magenta int not null,
  yellow int not null,
  black int not null
);

INSERT INTO pigmentocmyk(id, preco, nome, quantity,
						cianno, magenta, yellow, black)
VALUES("#FFFFFF", 7.50, "Branco", 30, 0, 0, 0, 0);
					
INSERT INTO pigmentorbg(id, nome, preco, quantity, red, green, blue)
VALUES("#FFFF00", "Amarelo", 5.00, 20, 255, 255, 0);

INSERT INTO pigmentocmyk(id, preco, nome, quantity, cianno, magenta, yellow, black)
VALUES("#00FF00", 10.00, "Verde", 40, 100, 0, 100, 0);

INSERT INTO pigmentorbg(id, nome, preco, quantity, red, green, blue)
VALUES("#FF0000", "Vermelho", 7.00, 20, 255, 0, 0);
