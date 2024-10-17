create table if not exists Artista (
	id_artista int primary key not null auto_increment,
    nom_artista varchar(255)
);
create table if not exists Genere (
	id_genere int primary key not null auto_increment,
    nom_genere varchar(255)
);
create table if not exists Albums (
	id_album int primary key not null auto_increment,
    nom_album varchar(255),
    data_publicacio datetime
);