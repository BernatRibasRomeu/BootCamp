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