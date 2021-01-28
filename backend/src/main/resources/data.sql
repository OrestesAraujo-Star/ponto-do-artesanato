INSERT INTO TB_CLIENTE (cliente_cep, cliente_cnpj, cliente_cpf, cliente_email, cliente_endereco, cliente_estado, cliente_fone, cliente_municipio, cliente_pais, cliente_senha, cliente_usuario, nome)
 VALUES ('88.130-390', '34.536.759/0001-05', '400.297.439-15', 'orestesaraujo@gmail.com',
 'Rua Valentim Camilo Garcia,137', 'SC', '(48)991780033', 'Palhoça', 'Brasil', '123456', 'orestesaraujo', 'Orestes Gastão Santos Araujo');
 

INSERT INTO tb_grupo (grupo_nome) VALUES ('BEBÊ');
INSERT INTO tb_grupo (grupo_nome) VALUES ('DIVERSOS');
INSERT INTO tb_grupo (grupo_nome) VALUES ('PÁSCOA');

INSERT INTO tb_produto (produto_descricao, produto_imagemuri_1, produto_imagemuri_2, produto_imagemuri_3, produto_imagemuri_4, produto_imagemuri_5, produtonome, produto_preco)
 VALUES ('CONJUNTO DE 4 ALMOFADAS
1 GRANDE(45 x 45) E 3 PEQUENAS(35 x 35)
Na falta das estampas deste produto, enviaremos ao cliente o produto com as estampas e cores mais próximas possíveis',
'https://github.com/OrestesAraujo-Star/ponto-do-artesanato/blob/main/Produtos/conjunto-de-almofadas.jpg',
'https://github.com/OrestesAraujo-Star/ponto-do-artesanato/blob/main/Produtos/conjunto-de-almofadas_1.jpg',
'https://github.com/OrestesAraujo-Star/ponto-do-artesanato/blob/main/Produtos/conjunto-de-almofadas_2.jpg','','',
'Conjunto_de_4_Almofadas', 204.19);


INSERT INTO tb_produto (produto_descricao, produto_imagemuri_1, produto_imagemuri_2, produto_imagemuri_3, produto_imagemuri_4, produto_imagemuri_5, produtonome, produto_preco)
 VALUES ('BANDÔ PARA CORTINAS
AS CORES PODEM SER MODIFICADAS.
O VALOR SERÁ AJUSTADO CONFORME O TAMANHO DA SUA NECESSIDADE
O DA FOTO MEDE 2 .00 X 0,50

Feito sob encomenda
45 dias úteis para produção',
'https://github.com/OrestesAraujo-Star/ponto-do-artesanato/blob/main/Produtos/Bando-para-cortina.jpg',
'',
'',
'',
'',
'BANDÔ PARA CORTINAS', 280.59);


INSERT INTO tb_produto (produto_descricao, produto_imagemuri_1, produto_imagemuri_2, produto_imagemuri_3, produto_imagemuri_4, produto_imagemuri_5, produtonome, produto_preco)
 VALUES ('TOALHA DE PÁSCOA
Toalha de mesa em tecido de algodão com aplicação.
As cores podem ser modificadas.
O valor varia dependendo do tamanho

Largura: 150.00 cm
Comprimento: 200.00 cm
Feito sob encomenda
45 dias úteis para produção',
'https://github.com/OrestesAraujo-Star/ponto-do-artesanato/blob/main/Produtos/toalha-de-pascoa.jpg',
'',
'',
'',
'',
'TOALHA DE PÁSCOA', 398.50);



INSERT INTO tb_produto (produto_descricao, produto_imagemuri_1, produto_imagemuri_2, produto_imagemuri_3, produto_imagemuri_4, produto_imagemuri_5, produtonome, produto_preco)
 VALUES ('KIT BERÇO-TECIDO 100% ALGODÃO
COM:
1 cabeceira(0,30x0,65 m)
2 laterais(0,30x1,30 m)
1 rolo(0,50x0,13)
1 edredom(1,25x0,90)
1 sobre lençol(1,65x1,05)
1 lençol c/elástico
1 fronha(30x40)
1 mosquiteiro

Feito sob encomenda
45 dias úteis p/produção',
'https://github.com/OrestesAraujo-Star/ponto-do-artesanato/blob/main/Produtos/kit-berco-ovelhinha.jpg',
'https://github.com/OrestesAraujo-Star/ponto-do-artesanato/blob/main/Produtos/kit-berco-presente.jpg',
'',
'',
'',
'KIT BERÇO EM TECIDO 100% ALGODÃO', 883.30);



INSERT INTO tb_produto (produto_descricao, produto_imagemuri_1, produto_imagemuri_2, produto_imagemuri_3, produto_imagemuri_4, produto_imagemuri_5, produtonome, produto_preco)
 VALUES ('KIT CAMA BABÁ COM TECIDO 100% ALGODÃO
COMPOSTO POR:
1 COLCHA ACOLCHOADA (COBRE LEITO)
2 ROLOS
3 ALMOFADA DE 70 X 55
2 ALMOFADAS DE 0,40 X 0,40
FAZEMOS SOB ENCOMENDA EM OUTRAS CORES E TEMAS


Feito sob encomenda
45 dias úteis para produção',
'https://github.com/OrestesAraujo-Star/ponto-do-artesanato/blob/main/Produtos/kit-cama-baba-baba.jpg',
'https://github.com/OrestesAraujo-Star/ponto-do-artesanato/blob/main/Produtos/kit-cama-baba-calvin.jpg',
'https://github.com/OrestesAraujo-Star/ponto-do-artesanato/blob/main/Produtos/kit-cama-baba-haroldo.jpg',
'https://github.com/OrestesAraujo-Star/ponto-do-artesanato/blob/main/Produtos/kit-cama-baba-quarto-bebe.jpg',
'',
'KIT CAMA BABÁ COM TECIDO 100% ALGODÃO', 1251.89);



INSERT INTO TB_PEDIDO (pedido_momento, pedido_status, pedido_total)
 VALUES (TIMESTAMP WITH TIME ZONE '2021-01-01T10:00:00Z', 0, 204.19);
 
 
INSERT INTO TB_CLIENTE_PEDIDO (cliente_id, pedido_id)
 VALUES ( 1, 1);
 

 
INSERT INTO TB_PEDIDO_PRODUTO (pedido_id, produto_id)
 VALUES ( 1, 1);
INSERT INTO TB_PEDIDO_PRODUTO (pedido_id, produto_id)
 VALUES ( 1, 3);
INSERT INTO TB_PEDIDO_PRODUTO (pedido_id, produto_id)
 VALUES ( 1, 4);
 
 
INSERT INTO TB_GRUPO_PRODUTO (grupo_id, produto_id)
 VALUES ( 2, 1);
INSERT INTO TB_GRUPO_PRODUTO (grupo_id, produto_id)
 VALUES ( 2, 2);
INSERT INTO TB_GRUPO_PRODUTO (grupo_id, produto_id)
 VALUES ( 3, 3);
INSERT INTO TB_GRUPO_PRODUTO (grupo_id, produto_id)
 VALUES ( 1, 4);
INSERT INTO TB_GRUPO_PRODUTO (grupo_id, produto_id)
 VALUES ( 1, 5);