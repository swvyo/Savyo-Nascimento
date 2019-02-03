insert into livro (id, nome, editora, isbn, idioma) values (1, 'Capitã Marvel - Higher Further Faster', 'Marvel Comics', 0785190139, 'Português')
insert into autores (nome, nacionalidade, livro_id) values ('Sue Deconick', 'Estado Unidense', 1)

insert into favoritos (id, nome, isbn) values (1, 'Teste1', '07453987')

insert into hqs (id, nome, cartunista, editora) values (1, 'Capitã Marvel', 'Sue Deconick', 'Marvel Comics')
insert into hqs (id, nome, cartunista, editora) values (2, 'Capitã Marvel - II', 'Sue Deconick', 'Marvel Comics')

insert into desejados (id, nome, isbn) values (1, 'Guerra Civil - II', 73827362)
insert into precos (desejados_id, id, preco) values (1, 1, '90')

