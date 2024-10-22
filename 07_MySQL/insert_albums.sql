insert into bernat.albums (nom_album, data_publicacio) values
	('Album 1', '2020-01-01'),
	('Album 2', '2021-02-15'),
	('Album 3', '2019-07-23'),
	('Album 4', '2022-03-11'),
	('Album 5', '2020-10-30'),
	('Album 6', '2018-12-20'),
	('Album 7', '2021-06-18'),
	('Album 8', '2017-09-05'),
	('Album 9', '2019-11-09'),
	('Album 10', '2022-08-25');

insert into bernat.artista (nom_artista) values
    ('Artista 1'),
    ('Artista 2'),
    ('Artista 3'),
    ('Artista 4'),
    ('Artista 5'),
    ('Artista 6'),
    ('Artista 7'),
    ('Artista 8'),
    ('Artista 9'),
    ('Artista 10');

insert into bernat.genere (nom_genere) values
    ('Rock'),
    ('Pop'),
    ('Jazz'),
    ('Hip-Hop'),
    ('Clásica'),
    ('Reggae'),
    ('Blues'),
    ('Electrónica'),
    ('Country'),
    ('Metal');
    
select * from albums;
select * from artista;
select * from genere;