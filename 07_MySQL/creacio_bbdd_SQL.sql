drop database if exists cinema;
create database if not exists cinema;

use cinema;

create table if not exists movies (
	id int primary key not null auto_increment,
    title varchar(100),
    year int,
    img_url varchar(255),
    certificate varchar(45),
    runrtime int,
    imdb_rating float,
    description text,
    metascore int,
    votes int,
    gross int
);
create table if not exists direcotrs (
	id int primary key not null auto_increment,
    name varchar(45) unique,
    about text
);
create table if not exists stars (
	id int primary key not null auto_increment,
    name varchar(45),
    about text
);
create table if not exists generes (
	id int primary key not null auto_increment,
    name varchar(45)
);