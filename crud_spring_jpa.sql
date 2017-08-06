create database crud_spring_jpa;

use crud_spring_jpa;

create table presidiario(
pre_id integer not null primary key auto_increment,
pre_nome varchar(50) not null,
pre_rg varchar(15) not null,
pre_cpf varchar(15) not null
);