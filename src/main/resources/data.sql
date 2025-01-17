create table tb_produtos (
    id varchar(255) not null primary key,
    nomeProduto varchar(50) not null,
    descricaoProduto varchar(255) not null,
    precoProduto decimal(10,2) not null
);