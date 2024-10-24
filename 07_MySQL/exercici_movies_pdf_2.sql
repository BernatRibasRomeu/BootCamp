-- 1 Selecciona tots els camps de la taula directors
select * from directors;
-- 2 selecciona el nom dels directors amb un alies per la colummns 
select name as Nom from directors;
-- 3 ordena la taula directors alfabeticament
select * from directors order by name asc;
-- 4 selecciona totes les pelicules que tinguin : en el nom
select * from movies where title like '%:%';
-- 5 selecciones els actors que el nom començi per M
select * from stars where name like 'M%';
-- 6 selecciona tots els actors que el nem acabi per e i una altre lletra
select * from stars where name like '%e_';
-- 7 selecciona tots els any dels que tenim una pelicula sense repetir
select distinct year from movies;
-- 8 ara volem contar aquests anys
select count(distinct year) as TOTAL from movies;
-- 9 ensenya la pelicula pulp fiction
select * from movies where title = 'Pulp Fiction';
-- 10 selecciona la pelicula que tingui id 6
select * from movies where id = 6;
-- 11 selecciona totes les pelicules amb una id superior a 3
select * from movies where id > 3;
-- 12 selecciona totes les pelicules amb una id menor o igual a 5
select * from movies where id <= 5;
-- 13 selecciones les pelicules amb una id entre 3 i 6 fent servir simbols
select * from movies where id >=3 and id <= 6;
-- 13 fem el mateix pero amb between
select * from movies where id between 3 and 6;
-- 14 selecciona totes les pelicules que no siguin del 2013
select * from movies where year != 2013;
-- 15 selecciona totes les pelicules amb any de grabacio 1895, 1994 i 1997
select * from movies where year in (1895, 1994, 1997);
-- 16 selecciona totes les pelicules que no siguin dels anys 2013, 2014 i 1994
select * from movies where year not in (2013, 2014, 1994);
-- 17 selecciona totes les pelicules grabades l'any 2000 o despres o amb una valoracio de 8,5 o mes
select * from movies where year >= 2000 or imdb_rating >= 8.5;