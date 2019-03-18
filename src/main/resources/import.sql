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

create table post(id int primary key, userId int, title varchar, body varchar);

create table comment(id int primary key, postId int, name varchar, email varchar, body varchar);

alter table album add foreign key(userId) references users(id);
alter table photo add foreign key(albumId) references album(id);
alter table post add foreign key(userId) references users(id);
alter table comment add foreign key(postId) references post(id);
alter table exchangegram add foreign key(albumId) references album(id);
alter table exchangegram add foreign key(ownerId) references users(id);