create table if not exists bet
(
    id              serial primary key,
    value           int not null,
    user_account_id int not null,
    game_result_id  int,

    constraint FK_USER_ACCOUNT
        foreign key (user_account_id)
            references user_account (id),
    constraint FK_GAME_RESULT
        foreign key (game_result_id)
            references game_result (id)
)