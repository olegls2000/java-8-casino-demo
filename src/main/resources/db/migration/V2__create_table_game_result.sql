create table if not exists game_result(
    id serial primary key,
    position1 varchar(30) not null,
    position2 varchar(30) not null,
    position3 varchar(30) not null,
    game_time timestamp not null
)