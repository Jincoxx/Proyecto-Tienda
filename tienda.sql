create database tienda;

use tienda;

create table Categorias (
categori_id int,
nombre varchar (100)
);

create table Productos (
id int,
nombre varchar (100),
precio float,
categoria_id int
);

create table Clientes (
id int,
nombre varchar (100)
);

create table Proveedores (
id_proveedor int,
nombre varchar (100),
precio float
);