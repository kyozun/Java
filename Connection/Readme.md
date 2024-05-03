create table customers
(
customer_id int primary key,
first_name  varchar(255) not null,
last_name   varchar(255) not null,
email       varchar(255) not null
);


insert into customers
values (1, 'Truong', 'Gia Binh', 'binh@gmail.com');
insert into customers
values (2, 'Nguyen', 'Thanh Nam', 'nam@gmail.com');


create table users
(
user_id int primary key,
user_name varchar(255) not null,
password varchar(255) not null
);


insert into users
values (1, 'admin', 'admin'),
(2, 'cuong', 'cuong');

select user_name from users where user_name like 'admin' and password like 'admin'
