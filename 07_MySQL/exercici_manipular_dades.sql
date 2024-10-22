-- Exercici pagina 148 SQL
select * from mytable;
-- 1
select postalZip as 'Codigo Postal', region as Región, country as Pais from mytable;
-- 2
select * from mytable where phone like '811%';
-- 3
select * from mytable where country like 'Spain' or country like 'Italy';
-- 4
select count(id) from mytable;
-- 5
select id from mytable where country like 'Germany' or country like 'Turkey';
select address, country, region from mytable where id in (select id from mytable where country like 'Germany' or country like 'Turkey');
-- 6
select max(id), min(id) from mytable;
-- 7
select country, count(country) as 'Numero de registros' from mytable group by country order by country asc;
-- 8
select postalZip from mytable order by postalZip asc limit 10;
-- 9
delete from mytable where country like 'Singapore';
select * from mytable where country like 'Singapore';
-- 10
update mytable set country = 'España' where country like 'Spain';
select * from mytable where country = 'España';
