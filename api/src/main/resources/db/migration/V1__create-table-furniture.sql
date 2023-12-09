create table furnitures (
    id bigint not null auto_increment,
    nome varchar(100) not null,
    local_compra varchar(100),
    local_casa varchar(100) not null,

    primary key(id)
);