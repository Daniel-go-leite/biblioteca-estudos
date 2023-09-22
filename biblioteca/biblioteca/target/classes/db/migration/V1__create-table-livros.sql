create table livros(

  id bigint not null auto_increment,
  titulo varchar(100) not null,
  autor varchar(100) not null unique,
  genero varchar(6) not null unique,
  publicado varchar(100) not null,


  primary key(id)

);