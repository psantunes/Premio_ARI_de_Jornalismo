INSERT INTO Edicao VALUES (default, 1, 1958);
INSERT INTO Edicao VALUES (default, 2, 1959);

INSERT INTO InstEnsino VALUES (default, "UFRGS");
INSERT INTO InstEnsino VALUES (default, "PUCRS");
INSERT INTO InstEnsino VALUES (default, "Uniritter");
INSERT INTO InstEnsino VALUES (default, "Unisinos");
INSERT INTO InstEnsino VALUES (default, "ESPM");

INSERT INTO Veiculo VALUES (default, 'Correio do Povo');
INSERT INTO Veiculo VALUES (default,'Diário de Notícias');
INSERT INTO Veiculo VALUES (default,'Folha da Tarde');
INSERT INTO Veiculo VALUES (default,'Jornal do Comércio');
INSERT INTO Veiculo VALUES (default,'Rádio Guaíba');
INSERT INTO Veiculo VALUES (default,'A Hora');

INSERT INTO Categoria VALUES (DEFAULT,'Reportagem');
INSERT INTO Categoria VALUES (DEFAULT,'Crônica/Artigo');
INSERT INTO Categoria VALUES (DEFAULT,'Fotografia');
INSERT INTO Categoria VALUES (DEFAULT,'Menção honrosa');
INSERT INTO Categoria VALUES (DEFAULT,'Radiodifusão');

INSERT INTO Autor VALUES (DEFAULT,'Kleber Borges da Cunha');
INSERT INTO Autor VALUES (DEFAULT,'Carlos Rafael Guimaraens');
INSERT INTO Autor VALUES (DEFAULT,'Remy Gorga Filho');
INSERT INTO Autor VALUES (DEFAULT,'Rivadavia de Souza');
INSERT INTO Autor VALUES (DEFAULT,'João Bergmann (Jotabê)');
INSERT INTO Autor VALUES (DEFAULT,'Archimedes Fortini');
INSERT INTO Autor VALUES (DEFAULT,'Flávio Alcaraz Gomes');
INSERT INTO Autor VALUES (DEFAULT,'Afonso Klein');
INSERT INTO Autor VALUES (DEFAULT,'Wyss Soares');
INSERT INTO Autor VALUES (DEFAULT,'José Alberto Alves');
INSERT INTO Autor VALUES (DEFAULT,'Ruy Pratini');
INSERT INTO Autor VALUES (DEFAULT,'Antônio Carlos Ribeiro');
INSERT INTO Autor VALUES (DEFAULT,'Raul Castilhos');
INSERT INTO Autor VALUES (DEFAULT,'Amaro Junior');
INSERT INTO Autor VALUES (DEFAULT,'Homero Pinto Guerreiro');
INSERT INTO Autor VALUES (DEFAULT,'José Abraham');

INSERT INTO Premiado (id, nome, edicao_id, colocacao, categoria_id) VALUES (DEFAULT,'O rio que não é rio',1,"PRIMEIRO_LUGAR",1);
INSERT INTO Premiado_Autor(premiados_id, autores_id) VALUES (1, 1);
INSERT INTO Premiado_Veiculo(premiados_id, veiculos_id) VALUES (1, 1);

INSERT INTO Premiado (id, nome, edicao_id, colocacao, categoria_id) VALUES (DEFAULT,'O que deve a Santa Casa cabe a todos nós saldar',1,"SEGUNDO_LUGAR",1);
INSERT INTO Premiado_Autor(premiados_id, autores_id) VALUES (2, 2);
INSERT INTO Premiado_Veiculo(premiados_id, veiculos_id) VALUES (2, 1);

