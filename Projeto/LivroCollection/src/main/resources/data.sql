insert into livro_fav (id, nome, data) values (1,'Guerra Civil - II', '2019-01-30')
insert into livro (id, nome, isbn, idioma, ano, editora, edicao, register_id) values (1, 'Guerra Civil', 9788542804126, 'Português', 2014, 'Marvel Comics', '1', 1)
insert into livro_proximo (id, nome, numero, livro_id) values (1, 'Guerra Civil - II', 2, 1)
insert into autores (id, nome, idade, nacionalidade, descricao, livro_id) values (1, 'Stuart Moore', 54, 'Estado Unidense',  'Civil War', 1)