drop database if exists eshop;

create database eshop;

use eshop;

create table customer (
    name varchar(32) unique,
    address varchar(128) not null,
    email varchar(128) not null,

    primary key(name)
);

drop database if exists estore;

create database estore;

use estore;

create table order (
    orderId varchar(8) not null,
    deliveryId varchar(128) not null,
    name varchar(32) unique,
    address varchar(128) not null,
    email varchar(128) not null,
    status varchar(16) not null,
    orderDate date not null,

)

