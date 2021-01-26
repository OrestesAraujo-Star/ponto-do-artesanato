INSERT INTO tb_produto (produto_id, produto_descricao, produto_imagemuri_1, produto_imagemuri_2, produto_imagemuri_3, produto_imagemuri_4, produto_imagemuri_5, produto_nome, produto_preco)
 VALUES ( 1,'CONJUNTO DE 4 ALMOFADAS - 1 GRANDE(45 x 45) E 3 PEQUENAS(35 x 35) - Na_falta_das_estampas_deste_produto, enviaremos_ao_cliente o produto_com as estampas_e cores mais_próximas_possíveis',
'https://github.com/OrestesAraujo-Star/ponto-do-artesanato/blob/main/Produtos/conjunto-de-almofadas.jpg',
'https://github.com/OrestesAraujo-Star/ponto-do-artesanato/blob/main/Produtos/conjunto-de-almofadas_1.jpg',
'https://github.com/OrestesAraujo-Star/ponto-do-artesanato/blob/main/Produtos/conjunto-de-almofadas_2.jpg','','',
'Conjunto_de_4_Almofadas', 204.19);

INSERT INTO TB_CLIENTE (cliente_id, cliente_cep, cliente_cnpj, cliente_cpf, cliente_email, cliente_endereco, cliente_estado, cliente_fone, cliente_municipio, cliente_pais, cliente_senha, cliente_usuario, nome)
 VALUES (1, '88.130-390', '34.536.759/0001-05', '400.297.439-15', 'orestesaraujo@gmail.com',
 'Rua Valentim Camilo Garcia,137', 'SC', '(48)991780033', 'Palhoça', 'Brasil', '123456', 'orestesaraujo', 'Orestes Gastão Santos Araujo');
 
 INSERT INTO TB_PEDIDO (pedido_id, cliente_id, pedido_momento, pedido_status, pedido_total)
 VALUES (1, 1, TIMESTAMP WITH TIME ZONE '2021-01-01T10:00:00Z', 0, 204.19);
 
 INSERT INTO TB_PEDIDO_ITENS (pedido_itens_id, pedido_id, produto_id, produto_quantidade)
 VALUES (1, 1, 1, 1);
 