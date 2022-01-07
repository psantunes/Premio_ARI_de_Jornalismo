
INSERT INTO User VALUES (default, "admin@admin.com", "123456");

INSERT INTO Edicao(id, nroEdicao, ano) VALUES (default, 1, 1958);
INSERT INTO Edicao(id, nroEdicao, ano) VALUES (default, 2, 1959);
INSERT INTO Edicao(id, nroEdicao, ano) VALUES (default, 3, 1960);
INSERT INTO Edicao(id, nroEdicao, ano) VALUES (default, 4, 1961);
INSERT INTO Edicao(id, nroEdicao, ano) VALUES (default, 5, 1962);
INSERT INTO Edicao(id, nroEdicao, ano) VALUES (default, 6, 1963);
INSERT INTO Edicao(id, nroEdicao, ano) VALUES (default, 7, 1964);
INSERT INTO Edicao(id, nroEdicao, ano) VALUES (default, 8, 1965);
INSERT INTO Edicao(id, nroEdicao, ano) VALUES (default, 9, 1966);
INSERT INTO Edicao(id, nroEdicao, ano) VALUES (default, 10, 1966);
INSERT INTO Edicao(id, nroEdicao, ano) VALUES (default, 11, 1967);
INSERT INTO Edicao(id, nroEdicao, ano) VALUES (default, 12, 1968);

INSERT INTO InstEnsino VALUES (default,"UFRGS");
INSERT INTO InstEnsino VALUES (default,"PUCRS");
INSERT INTO InstEnsino VALUES (default,"Uniritter");
INSERT INTO InstEnsino VALUES (default,"Unisinos");
INSERT INTO InstEnsino VALUES (default,"ESPM");

INSERT INTO Veiculo VALUES (default,'Correio do Povo');
INSERT INTO Veiculo VALUES (default,'Diário de Notícias');
INSERT INTO Veiculo VALUES (default,'Folha da Tarde');
INSERT INTO Veiculo VALUES (default,'Jornal do Comércio');
INSERT INTO Veiculo VALUES (default,'Rádio Guaíba');
INSERT INTO Veiculo VALUES (default,'A Hora');

INSERT INTO Categoria VALUES (DEFAULT,'Reportagem');
INSERT INTO Categoria VALUES (DEFAULT,'Crônica/Artigo');
INSERT INTO Categoria VALUES (DEFAULT,'Fotografia');
INSERT INTO Categoria VALUES (DEFAULT,'Menção honrosa');
INSERT INTO Categoria VALUES (DEFAULT,'Rádio');

INSERT INTO Autor VALUES (DEFAULT,'Kleber Borges da Cunha');
INSERT INTO Autor VALUES (DEFAULT,'Carlos Rafael Guimaraens');
INSERT INTO Autor VALUES (DEFAULT,'Remy Gorga Filho');
INSERT INTO Autor VALUES (DEFAULT,'Geraldo Moser');
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

/* PREMIADOS EDICAO 1 */
INSERT INTO Premiado (id, nome, edicao_id, colocacao, categoria_id) VALUES (DEFAULT,'O rio que não é rio (série)',1,"PRIMEIRO_LUGAR",1);
INSERT INTO Premiado_Autor(premiados_id, autores_id) VALUES (1, 1);
INSERT INTO Premiado_Veiculo(premiados_id, veiculos_id) VALUES (1, 1);

INSERT INTO Premiado (id, nome, edicao_id, colocacao, categoria_id) VALUES (DEFAULT,'O que deve a Santa Casa cabe a todos nós saldar',1,"SEGUNDO_LUGAR",1);
INSERT INTO Premiado_Autor(premiados_id, autores_id) VALUES (2, 2);
INSERT INTO Premiado_Veiculo(premiados_id, veiculos_id) VALUES (2, 1);

INSERT INTO Premiado (id, nome, edicao_id, colocacao, categoria_id) VALUES (DEFAULT,'Um velho problema que está clamando por soluções mais práticas',1,"TERCEIRO_LUGAR",1);
INSERT INTO Premiado_Autor(premiados_id, autores_id) VALUES (3, 3);
INSERT INTO Premiado_Veiculo(premiados_id, veiculos_id) VALUES (3, 2);

INSERT INTO Premiado (id, nome, edicao_id, colocacao, categoria_id) VALUES (DEFAULT,'Cidade de Deus (série)',1,"PREMIO_ADICIONAL",1);
INSERT INTO Premiado_Autor(premiados_id, autores_id) VALUES (4, 4);
INSERT INTO Premiado_Veiculo(premiados_id, veiculos_id) VALUES (4, 1);

INSERT INTO Premiado (id, nome, edicao_id, colocacao, categoria_id) VALUES (DEFAULT,'O mês do amor (série)',1,"MENCAO_HONROSA",3);
INSERT INTO Premiado_Autor(premiados_id, autores_id) VALUES (5, 17);
INSERT INTO Premiado_Veiculo(premiados_id, veiculos_id) VALUES (5, 3);

INSERT INTO Premiado (id, nome, edicao_id, colocacao, categoria_id) VALUES (DEFAULT,'Bandeira',1,"PRIMEIRO_LUGAR",2);
INSERT INTO Premiado_Autor(premiados_id, autores_id) VALUES (6, 5);
INSERT INTO Premiado_Veiculo(premiados_id, veiculos_id) VALUES (6, 1);

/* PREMIADOS EDICAO 2 */

INSERT INTO Premiado (id, nome, edicao_id, colocacao, categoria_id) VALUES (DEFAULT,'Europa - 1959 (série)',1,"PRIMEIRO_LUGAR",2);
INSERT INTO Premiado_Autor(premiados_id, autores_id) VALUES (7, 8);
INSERT INTO Premiado_Veiculo(premiados_id, veiculos_id) VALUES (7, 1);
INSERT INTO Premiado_Veiculo(premiados_id, veiculos_id) VALUES (7, 3);

INSERT INTO Premiado (id, nome, edicao_id, colocacao, categoria_id) VALUES (DEFAULT,'Maria reflete na vidraça o drama da cidade grande',2,"SEGUNDO_LUGAR",3);
INSERT INTO Premiado_Autor(premiados_id, autores_id) VALUES (8, 17);
INSERT INTO Premiado_Veiculo(premiados_id, veiculos_id) VALUES (8, 3);

/* PREMIADOS EDICAO 3 */

INSERT INTO Premiado (id, nome, edicao_id, colocacao, categoria_id) VALUES (DEFAULT,'A bola em close-up',3,"TERCEIRO_LUGAR",3);
INSERT INTO Premiado_Autor(premiados_id, autores_id) VALUES (9, 17);
INSERT INTO Premiado_Veiculo(premiados_id, veiculos_id) VALUES (9, 3);

/* PREMIADOS EDICAO 12 */

INSERT INTO Premiado (id, nome, edicao_id, colocacao, categoria_id) VALUES (DEFAULT,'Rebelião de Maio',12,"PRIMEIRO_LUGAR",5);
INSERT INTO Premiado_Autor(premiados_id, autores_id) VALUES (10, 8);
INSERT INTO Premiado_Veiculo(premiados_id, veiculos_id) VALUES (10, 5);
