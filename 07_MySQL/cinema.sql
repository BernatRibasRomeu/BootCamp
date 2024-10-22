drop database if exists cinema;
create database if not exists cinema;

use cinema;

create table if not exists movies (
	id int primary key not null auto_increment,
    title varchar(100),
    year int,
    img_url varchar(255),
    certificate varchar(45),
    runtime int,
    imdb_rating float,
    description text,
    metascore int,
    votes int,
    gross int
);

create table if not exists directors (
	id int primary key not null auto_increment,
    first_name varchar(45),
    last_name1 varchar(45),
    last_name2 varchar(45),
    birth_date date,
    death_date date default null,
    about text
);

create table if not exists movies_directors (
    movie_id int,
    director_id int,
    primary key (movie_id, director_id),
    foreign key (movie_id) references movies(id),
    foreign key (director_id) references directors(id)
);

create table if not exists genres (
	id int primary key not null auto_increment,
    name varchar(45)
);

create table if not exists movies_genres (
	movie_id int,
    genres_id int,
    primary key (movie_id, genres_id),
    foreign	key (movie_id) references movies(id),
    foreign key (genres_id) references genres(id)
);
create table if not exists actors (
    id int primary key not null auto_increment,
    first_name varchar(45),
    last_name1 varchar(45),
    last_name2 varchar(45),
    birth_date date,
    death_date date default null,
    about text
);

create table if not exists movies_actors (
    movie_id int,
    actor_id int,
    primary key (movie_id, actor_id),
    foreign key (movie_id) references movies(id),
    foreign key (actor_id) references actors(id)
);



insert into movies (title, year, img_url, certificate, runtime, imdb_rating, description, metascore, votes, gross)
values
-- Trilogía del Señor de los Anillos
('The Lord of the Rings: The Fellowship of the Ring', 2001, 'https://image.url/fellowship.jpg', 'PG-13', 178, 8.8, 'A hobbit sets out on a quest to destroy a powerful ring.', 92, 1660000, 871530324),
('The Lord of the Rings: The Two Towers', 2002, 'https://image.url/two_towers.jpg', 'PG-13', 179, 8.7, 'The fellowship is broken, and new alliances are formed.', 87, 1410000, 926047111),
('The Lord of the Rings: The Return of the King', 2003, 'https://image.url/return_king.jpg', 'PG-13', 201, 8.9, 'The final battle for Middle-earth begins.', 94, 1990000, 1119929521),

-- 6 Episodios Originales de Star Wars
('Star Wars: Episode IV - A New Hope', 1977, 'https://image.url/episode4.jpg', 'PG', 121, 8.6, 'A young farm boy becomes a hero in a galaxy far, far away.', 90, 1000000, 775398007),
('Star Wars: Episode V - The Empire Strikes Back', 1980, 'https://image.url/episode5.jpg', 'PG', 124, 8.7, 'The Rebels are pursued by the Empire.', 85, 800000, 538300000),
('Star Wars: Episode VI - Return of the Jedi', 1983, 'https://image.url/episode6.jpg', 'PG', 132, 8.3, 'The final confrontation between the Rebels and the Empire.', 82, 600000, 475106177),
('Star Wars: Episode I - The Phantom Menace', 1999, 'https://image.url/episode1.jpg', 'PG', 136, 6.5, 'Two Jedi knights battle a Sith lord.', 51, 580000, 1025518765),
('Star Wars: Episode II - Attack of the Clones', 2002, 'https://image.url/episode2.jpg', 'PG', 142, 6.6, 'A secret wedding, a battle against a dark side.', 65, 560000, 649398328),
('Star Wars: Episode III - Revenge of the Sith', 2005, 'https://image.url/episode3.jpg', 'PG-13', 140, 7.5, 'Anakin Skywalker turns to the dark side.', 65, 600000, 848998998),

-- Gladiator
('Gladiator', 2000, 'https://image.url/gladiator.jpg', 'R', 155, 8.5, 'A former Roman general sets out to exact vengeance against the corrupt emperor who murdered his family.', 77, 1000000, 460300000),

-- Geostorm
('Geostorm', 2017, 'https://image.url/geostorm.jpg', 'PG-13', 109, 5.3, 'A network of satellites designed to control the global climate goes haywire.', 39, 400000, 221999663),

-- Interstellar
('Interstellar', 2014, 'https://image.url/interstellar.jpg', 'PG-13', 169, 8.6, 'A team of explorers travel through a wormhole in space in an attempt to ensure humanity\'s survival.', 74, 3700000, 677463813),

-- Joker
('Joker', 2019, 'https://image.url/joker.jpg', 'R', 122, 8.4, 'In Gotham City, mentally troubled comedian Arthur Fleck is disregarded and mistreated by society.', 59, 1100000, 1074251311),

-- Trilogía Deadpool
('Deadpool', 2016, 'https://image.url/deadpool.jpg', 'R', 108, 8.0, 'A former special forces operative turns into a wisecracking superhero.', 65, 690000, 783112979),
('Deadpool 2', 2018, 'https://image.url/deadpool2.jpg', 'R', 119, 7.7, 'Deadpool joins forces with a group of mutants to protect a boy from a time-traveling cyborg.', 66, 800000, 785846495),
('Deadpool 3', 2024, 'https://image.url/deadpool3.jpg', 'R', 120, 8.5, 'Deadpool teams up with Wolverine for another wild adventure.', 70, 100000, 1333954262),

-- Pacific Rim
('Pacific Rim', 2013, 'https://image.url/pacific_rim.jpg', 'PG-13', 131, 7.0, 'As an alien invasion threatens Earth, giant robots are piloted by humans to fight back.', 71, 800000, 411000000),
('Pacific Rim: Uprising', 2018, 'https://image.url/pacific_rim_uprising.jpg', 'PG-13', 110, 5.6, 'Jake Pentecost, son of Stacker Pentecost, reunites with his estranged sister to lead a new generation of Jaeger pilots.', 43, 500000, 290269559),

-- Marte
('The Martian', 2015, 'https://image.url/martian.jpg', 'PG-13', 144, 8.0, 'An astronaut becomes stranded on Mars and must figure out how to survive.', 80, 820000, 630161890),

-- El Hombre de la Tierra
('The Man from Earth', 2007, 'https://image.url/man_from_earth.jpg', 'NR', 87, 7.8, 'An impromptu goodbye party for a professor turns into an unexpected interrogation of his long-held secrets.', 66, 200000, 300000),

-- Oppenheimer
('Oppenheimer', 2023, 'https://image.url/oppenheimer.jpg', 'R', 180, 8.6, 'A dramatization of the life and career of J. Robert Oppenheimer.', 94, 400000, 1000000000),

-- Inside Out (Del Revés)
('Inside Out', 2015, 'https://image.url/inside_out.jpg', 'PG', 95, 8.1, 'An 11-year-old girl’s emotions—Joy, Fear, Anger, Disgust, and Sadness—are at war.', 94, 3000000, 857611174),
('Inside Out 2', 2024, 'https://image.url/inside_out2.jpg', 'PG', 95, 7.6, 'The emotions face new challenges as Riley grows older.', 77, 800000, 1693477792),

-- The Italian Job
('The Italian Job', 2003, 'https://image.url/italian_job.jpg', 'PG-13', 111, 7.0, 'A team of thieves plans an elaborate heist against a former ally.', 74, 400000, 176000000),

-- Todas las películas de John Wick
('John Wick', 2014, 'https://image.url/john_wick.jpg', 'R', 101, 7.4, 'An ex-hitman comes out of retirement to track down the gangsters that took everything from him.', 68, 700000, 86000000),
('John Wick: Chapter 2', 2017, 'https://image.url/john_wick_chapter2.jpg', 'R', 122, 7.5, 'John Wick is forced back out of retirement by a former associate.', 75, 600000, 171017494),
('John Wick: Chapter 3 – Parabellum', 2019, 'https://image.url/john_wick_chapter3.jpg', 'R', 131, 7.4, 'John Wick is on the run after killing a member of the international assassins\' guild.', 73, 500000, 326701469),
('John Wick: Chapter 4', 2023, 'https://image.url/john_wick_chapter4.jpg', 'R', 169, 8.3, 'John Wick uncovers a path to defeating The High Table.', 88, 250000, 431000000);

insert into directors (first_name, last_name1, last_name2, birth_date, death_date, about)
values 
('Peter', 'Jackson', null, '1961-10-31', null, 'Director de la trilogía del Señor de los Anillos.'),
('George', 'Lucas', null, '1944-05-14', null, 'Creador de la saga Star Wars.'),
('Ridley', 'Scott', null, '1937-11-30', null, 'Director de Gladiator.'),
('Dean', 'Devlin', null, '1964-08-27', null, 'Director de Geostorm.'),
('Christopher', 'Nolan', null, '1970-07-30', null, 'Director de Interstellar y Oppenheimer.'),
('Todd', 'Phillips', null, '1970-12-20', null, 'Director de Joker.'),
('David', 'Leitch', null, '1972-02-07', null, 'Director de Deadpool 2.'),
('Guillermo', 'del Toro', null, '1964-10-09', null, 'Director de Pacific Rim.'),
('Pablo', 'Larraín', null, '1976-08-24', null, 'Director de El Hombre de la Tierra.'),
('Pete', 'Docter', null, '1968-11-09', null, 'Director de Inside Out.'),
('F.', 'Gary', 'Gray', '1970-07-17', null, 'Director de The Italian Job.'),
('Chad', 'Stahelski', null, '1978-09-20', null, 'Director de John Wick.');

INSERT INTO genres (name)
VALUES 
('Acción'),
('Aventura'),
('Ciencia Ficción'),
('Drama'),
('Comedia'),
('Terror'),
('Thriller'),
('Fantasía'),
('Animación'),
('Documental');

INSERT INTO actors (first_name, last_name1, last_name2, birth_date, death_date, about)
VALUES 
('Elijah', 'Wood', NULL, '1981-01-28', NULL, 'Actor conocido por su papel de Frodo en El Señor de los Anillos.'),
('Ian', 'McKellen', NULL, '1939-05-25', NULL, 'Actor conocido por su papel de Gandalf en El Señor de los Anillos.'),
('Viggo', 'Mortensen', NULL, '1958-10-20', NULL, 'Actor conocido por su papel de Aragorn en El Señor de los Anillos.'),
('Mark', 'Hamill', NULL, '1951-09-25', NULL, 'Actor conocido por su papel de Luke Skywalker en Star Wars.'),
('Harrison', 'Ford', NULL, '1942-07-13', NULL, 'Actor conocido por su papel de Han Solo en Star Wars.'),
('Natalie', 'Portman', NULL, '1981-06-09', NULL, 'Actriz conocida por su papel de Padmé Amidala en Star Wars.'),
('Russell', 'Crowe', NULL, '1964-04-07', NULL, 'Actor conocido por su papel de Maximus en Gladiator.'),
('Gerard', 'Butler', NULL, '1969-11-13', NULL, 'Actor conocido por su papel de Jake Lawson en Geostorm.'),
('Matthew', 'McConaughey', NULL, '1969-11-04', NULL, 'Actor conocido por su papel de Cooper en Interstellar.'),
('Joaquin', 'Phoenix', NULL, '1974-10-28', NULL, 'Actor conocido por su papel en Joker.'),
('Ryan', 'Reynolds', NULL, '1976-10-23', NULL, 'Actor conocido por su papel en Deadpool.'),
('Josh', 'Brolin', NULL, '1968-02-12', NULL, 'Actor conocido por su papel de Cable en Deadpool 2.'),
('John', 'Boyega', NULL, '1992-03-17', NULL, 'Actor conocido por su papel de Finn en Star Wars.'),
('Tom', 'Hardy', NULL, '1977-09-15', NULL, 'Actor conocido por su papel de Eddie Brock en Venom.'),
('Charlie', 'Hunnam', NULL, '1980-04-10', NULL, 'Actor conocido por su papel de Raleigh Becket en Pacific Rim.'),
('Matt', 'Damon', NULL, '1970-10-08', NULL, 'Actor conocido por su papel de Mark Watney en The Martian.'),
('William', 'Hurt', NULL, '1950-03-20', '2022-03-13', 'Actor conocido por su papel en El Hombre de la Tierra.'),
('Cillian', 'Murphy', NULL, '1976-05-25', NULL, 'Actor conocido por su papel en Oppenheimer.'),
('Amy', 'Poehler', NULL, '1971-09-16', NULL, 'Actriz conocida por su papel en Inside Out.'),
('Mindy', 'Kaling', NULL, '1979-06-24', NULL, 'Actriz conocida por su papel en Inside Out 2.'),
('Michael', 'Caine', NULL, '1933-03-14', NULL, 'Actor conocido por su papel en The Italian Job.'),
('Keanu', 'Reeves', NULL, '1964-09-02', NULL, 'Actor conocido por su papel de John Wick.');