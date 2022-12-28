create table if not exists user_account(
    id serial primary key,
    name varchar(30) not null,
    last_name varchar(30) not null,
    birth_date timestamp not null,
    email varchar(30) not null unique,
    password varchar(30) not null
)