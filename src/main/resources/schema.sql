create table Ticket
(
    id integer auto_increment not null,
    innFilm varchar(255) not null,
    innAmount varchar(255) not null,
    innFName varchar(255) not null,
    innLName varchar(255) not null,
    innPhone varchar(255) not null,
    innEmail varchar(255) not null,
    primary key (id)
);