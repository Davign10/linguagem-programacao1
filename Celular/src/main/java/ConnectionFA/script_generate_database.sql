#CREATE USER 'binary'@'localhost' IDENTIFIED BY 'binary123';
#GRANT ALL PRIVILEGES ON * . * TO 'binary'@'localhost';

create database estoque;

use estoque;

create table celular(
cor_celular varchar(10) not null,
gigabyte_celular varchar (5) not null,
modelo_celular varchar(10) not null,
tamanho_celular varchar (5) not null,
tela_celular varchar(15) not null);





