create table "DAD".CLIENTES
(
	USUARIO VARCHAR(20) not null primary key,
	CLAVE VARCHAR(20) not null,
	EMAIL VARCHAR(100) not null unique,
	NOMBRE VARCHAR(100) not null,
	APELLIDOS VARCHAR(100),
	DIRECCION VARCHAR(150) not null,
	CIUDAD VARCHAR(25) not null,
	PAIS VARCHAR(25) not null
)

create table "DAD".SUBASTAS
(
	ID INTEGER generated always as identity not null primary key,
	SUBASTADOR VARCHAR(20) not null references CLIENTES(USUARIO) on delete cascade,
	NOMBRE VARCHAR(100) not null unique,
	DESCRIPCION VARCHAR(500),
	CATEGORIA VARCHAR(20) default 'ninguna' not null,
	PRECIO_SALIDA REAL,
	PUJA_ACTUAL REAL,
	PRECIO_COMPRA REAL,
	FECHA_SALIDA DATE,
	FECHA_CIERRE DATE,
	FECHA_PUJA_ACTUAL DATE,
	PUJADOR_ACTUAL VARCHAR(20) references CLIENTES(USUARIO) on delete cascade
)

--create table "DAD".ARTICULOS
--(
--	ID INTEGER generated always as identity not null primary key,
--	NOMBRE VARCHAR(100) not null,
--	DESCRIPCION VARCHAR(500),
--	CATEGORIA VARCHAR(20) default 'ninguna' not null
--)

--create table "DAD".SUBASTAS
--(
--	SUBASTADOR VARCHAR(20) not null references CLIENTES(USUARIO),
--	ID_ARTICULO INTEGER not null references ARTICULOS(ID),
--	PRECIO_SALIDA REAL,
--	PUJA_ACTUAL REAL,
--	PRECIO_COMPRA REAL,
--	FECHA_SALIDA DATE,
--	FECHA_CIERRE DATE,
--	FECHA_PUJA_ACTUAL DATE,
--	PUJADOR_ACTUAL VARCHAR(20) references CLIENTES(USUARIO),
--	primary key(SUBASTADOR,ID_ARTICULO)
--)
