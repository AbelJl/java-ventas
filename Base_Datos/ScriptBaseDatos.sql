create database BDVenta;
use BDVenta;

create table USUARIO(
IDUsuario int auto_increment primary key,
Nombre varchar(30) not null,
Apellidos varchar(60) not null,
Usuario varchar(30) not null,
DNI varchar(8),
Clave varchar(12) not null,
Estado bit not null);

create table CLIENTE(
IDCliente int primary key not null,
Nombre varchar(30),
Apellidos varchar(60),
DNI varchar(8),
Sexo bit,
Telefono varchar(12),
Direccion varchar(100),
Estado bit
);

create table PRODUCTO(
IDProducto int primary key not null,
Descripcion varchar(200) not null,
IDCategoria int not null,
IDUnidad int not null,
Precio decimal(8.2) not null,
Stcok int not null,
Estado bit
);

create table CATEGORIA(
IDCategoria int primary key not null,
Descripcion varchar(40)
);

create table UNIDAD(
IDUnidad int primary key not null,
Descripcion varchar(40)
);

create table VENTA(
IDVenta int primary key not null,
IDCliente int not null,
Fecha varchar(15) not null,
Total decimal(8,2) not null,
Estado bit not null
);

create table DETALLE_VENTA(
IDDetalle int auto_increment primary key,
IDVenta int not null,
IDCliente int not null,
IDProducto int not null,
Precio decimal(8,2),
Cantidad int not null,
Subtotal decimal(8,2) not null
);

create table PROVEEDOR(
IDProveedor int not null Primary key,
Descripcion varchar(200),
Estado bit
);

create table KARDEX(
IDKardex int auto_increment primary key,
IDProveedor int not null,
IDProducto int not null,
FechaVencimiento varchar(15),
Cantidad int not null,
Costo decimal(8,2),
FechaEntrada varchar(15) not null
);

alter table PRODUCTO add constraint categoria_producto foreign key (IDCategoria) references CATEGORIA (IDCATEGORIA);
alter table PRODUCTO add constraint unidad_producto foreign key (IDUnidad) references UNIDAD (IDUnidad);
alter table DETALLE_VENTA add constraint detalle_venta_producto foreign key (IDProducto) references PRODUCTO (IDProducto);
alter table DETALLE_VENTA add constraint detalle_venta_venta foreign key (IDVenta) references VENTA (IDVenta);
alter table VENTA add constraint venta_cliente foreign key (IDCliente) references CLIENTE (IDCliente);
alter table KARDEX add constraint kardex_producto foreign key (IDProducto) references PRODUCTO (IDProducto);
alter table KARDEX add constraint kardex_proveedor foreign key (IDProveedor) references PROVEEDOR (IDProveedor);
