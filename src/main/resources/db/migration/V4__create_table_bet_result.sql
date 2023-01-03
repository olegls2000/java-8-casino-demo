create table if not exists bet_result
(
    id              serial primary key,
    balance           int not null,
    user_account_id int not null,
    bet_id  int not null,

    constraint FK_USER_ACCOUNT
        foreign key (user_account_id)
            references user_account (id),
    constraint FK_GAME_RESULT
        foreign key (bet_id)
            references bet (id)
)