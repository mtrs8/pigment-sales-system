CREATE TABLE `estoque`.`pigmentorgb` (
  `idPigmento` VARCHAR(8) NULL,
  `nome` VARCHAR(45) NULL,
  `preco` DOUBLE NULL,
  `qtdNoEstoque` DOUBLE NULL,
  `red` INT NULL,
  `green` INT NULL,
  `blue` INT NULL);
  
  CREATE TABLE `pigmentocmyk` (
  `idPigmento` varchar(8) NOT NULL,
  `nome` varchar(45) NOT NULL,
  `preco` double NOT NULL,
  `qtdNoEstoque` double NOT NULL,
  `cyan` int(11) NOT NULL,
  `magenta` int(11) NOT NULL,
  `yellow` int(11) NOT NULL,
  `keyblack` int(11) NOT NULL
);

INSERT INTO estoque.pigmentorgb(idPigmento, nome, preco, qtdNoEstoque, red, green, blue) VALUES('rgbpig1', 'preto', 2.30, 10, 0, 0, 0 ),
('rgbpig2', 'branco', 2.0, 10, 255,255,255 ),
('rgbpig3', 'vermelho', 2.50, 10, 255,0,0),
('rgbpig4', 'lima', 2.70, 32, 0,255,0),
('rgbpig5', 'azul', 2.90, 25, 0,0,255),
('rgbpig6', 'amarelo', 3.30, 30, 255,255,0),
('rgbpig7', 'ciano', 4.30, 23, 0,255,255),
('rgbpig8', 'magenta', 4.40, 15, 255,0,255),
('rgbpig9', 'prata', 3.56, 10, 192,192,192),
('rgbpig10', 'cinza', 3.0, 30, 128,128,128),
('rgbpig11', 'marrom', 2.30, 15.6, 128,0,0),
('rgbpig12', 'oliva', 1.30, 10, 128,128,0),
('rgbpig13', 'verde', 4.25, 20.5, 0,128,0),
('rgbpig14', 'roxo', 5.0, 10, 128,0,128),
('rgbpig15', 'azul-naval', 4.70, 10, 0,0,128);
