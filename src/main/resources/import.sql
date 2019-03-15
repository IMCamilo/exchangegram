drop table if exists users;
drop table if exists album;
drop table if exists photo;

create table users(id int primary key,
                    name varchar,
                    username varchar,
                    email varchar,
                    address varchar,
                    phone varchar,
                    website varchar,
                    company varchar);

create table album(id int primary key, userId integer, title varchar);

create table photo(id int primary key, albumId int, title varchar, url varchar, thumbnailUrl varchar);

create table exchangegram(id int primary key auto_increment, albumId int, ownerId int, friendId int, permission varchar);

alter table album add foreign key(userId) references users(id);
alter table photo add foreign key(albumId) references album(id);
alter table exchangegram add foreign key(albumId) references album(id);
alter table exchangegram add foreign key(ownerId) references users(id);

--insert into users(id, name, username, email, address, phone, website, company)
--values (1, 'camilo', 'imcamilo', 'camilo.jorquera@xxxx.cl', 'Aquí', '781212', 'www.object.cl', 'IM');
--insert into album(id, userId, title) values (1, 1, 'GTH');
--insert into photo(id, albumId, title, url, thumbnailUrl) values (1, 1, 'Cuadro que se come ciudades', 'N/A', 'N/A');