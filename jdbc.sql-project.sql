create database Naveenkumar;
use Naveenkumar;
create table Login(username varchar(50),password varchar(50));
insert into login values('naveen',12345);
create table Product(productId int ,productName varchar(50),minsellQuantity int,price int,quantity int );
insert into Product values(12,'root',32,3000,4);
select * from login;
select * from product;